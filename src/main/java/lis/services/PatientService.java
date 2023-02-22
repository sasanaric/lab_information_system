package lis.services;

import lis.base.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientService extends CrudService<Integer> {
    public Integer getGenderById(Integer id);

    <T> Page<T> findAll(Pageable page, Class<T> resultDtoClass);
}
