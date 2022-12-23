package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.UserEntity;
import lis.repositories.UserEntityRepository;
import lis.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends CrudJpaService<UserEntity,Integer> implements UserService {

    private final UserEntityRepository repository;

    public UserServiceImpl(UserEntityRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper,UserEntity.class);
        this.repository = repository;
    }

    @Override
    public List<String> getAllUsernames() {
        return repository.findAll().stream().map(UserEntity::getUsername).collect(Collectors.toList());
    }
}
