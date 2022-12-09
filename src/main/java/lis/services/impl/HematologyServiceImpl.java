package lis.services.impl;

import lis.base.CrudJpaService;
import lis.models.entities.HematologyEntity;
import lis.repositories.HematologyEntityRepository;
import lis.services.HematologyService;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HematologyServiceImpl extends CrudJpaService<HematologyEntity,Integer> implements HematologyService {
    public HematologyServiceImpl(HematologyEntityRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper, HematologyEntity.class);
    }
}
