package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.PatientEntity;
import lis.repositories.PatientEntityRepository;
import lis.services.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends CrudJpaService<PatientEntity,Integer> implements PatientService {
        public PatientServiceImpl(PatientEntityRepository repository,ModelMapper modelMapper) {
            super(repository,modelMapper,PatientEntity.class);
        }
}

