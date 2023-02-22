package lis.services;

import lis.base.CrudService;

public interface PatientService extends CrudService<Integer> {
    public Integer getGenderById(Integer id);
}
