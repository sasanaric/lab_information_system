package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.UserEntity;
import lis.repositories.UserEntityRepository;
import lis.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudJpaService<UserEntity,Integer> implements UserService {

    public UserServiceImpl(UserEntityRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper,UserEntity.class);
    }
}
