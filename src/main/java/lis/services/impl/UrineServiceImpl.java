package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.UrineEntity;
import lis.repositories.UrineEntityRepository;
import lis.services.UrineService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UrineServiceImpl extends CrudJpaService<UrineEntity,Integer> implements UrineService {
    public UrineServiceImpl(UrineEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, UrineEntity.class);
    }
}
