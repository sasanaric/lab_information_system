package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.User;
import lis.models.UserResponse;
import lis.models.entities.UserEntity;
import lis.repositories.UserEntityRepository;
import lis.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends CrudJpaService<UserEntity,Integer> implements UserService {

    private final UserEntityRepository repository;

    public UserServiceImpl(UserEntityRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper,UserEntity.class);
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return super.findAll(User.class).stream().filter(u -> !u.getUsername().equals(username)).collect(Collectors.toList());
    }

    @Override
    public UserResponse getCurrentUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getModelMapper().map(repository.findByUsername(username), UserResponse.class);
    }

    @Override
    public String getCurrentRole(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return repository.findRoleByUsername(username);
    }

    @Override
    public List<String> getAllUsernames() {
        return repository.findAll().stream().map(UserEntity::getUsername).collect(Collectors.toList());
    }
}
