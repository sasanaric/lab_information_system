package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.MedicalRecordEntity;
import lis.repositories.MedicalRecordRepository;
import lis.services.MedicalRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordServiceImpl extends CrudJpaService<MedicalRecordEntity, Integer> implements MedicalRecordService {

    public MedicalRecordServiceImpl(MedicalRecordRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, MedicalRecordEntity.class);
    }
}
