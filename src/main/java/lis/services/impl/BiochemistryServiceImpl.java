package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.BiochemistryEntity;
import lis.repositories.BiochemistryEntityRepository;
import lis.services.BiochemistryService;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BiochemistryServiceImpl extends CrudJpaService<BiochemistryEntity,Integer> implements BiochemistryService {
    public BiochemistryServiceImpl(BiochemistryEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, BiochemistryEntity.class);
    }
}
