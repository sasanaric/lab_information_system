package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.MedicalRecord;
import lis.models.entities.BordersEntity;
import lis.repositories.BordersEntityRepository;
import lis.services.BordersService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BordersServiceImpl extends CrudJpaService<BordersEntity,Integer> implements BordersService {

    public BordersServiceImpl(BordersEntityRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper,BordersEntity.class);
    }

}
