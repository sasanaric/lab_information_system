package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.Patient;
import lis.models.entities.BordersEntity;
import lis.models.entities.PatientEntity;
import lis.repositories.BordersEntityRepository;
import lis.repositories.PatientEntityRepository;
import lis.services.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PatientServiceImpl extends CrudJpaService<PatientEntity,Integer> implements PatientService {
    private final PatientEntityRepository repository;
    private final ModelMapper modelMapper;
    public PatientServiceImpl(PatientEntityRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper, PatientEntity.class);
        this.repository=repository;
        this.modelMapper=modelMapper;
    }
   @Override
    public Integer getGenderById(Integer id){
        Patient patient = repository
                .findAll()
                .stream()
                .filter(x -> x.getId().equals(id)).map(x -> modelMapper.map(x, Patient.class)).toList().get(0);
        if ("M".equals(patient.getGender())) return 1;
        else return 2;


    }
}

