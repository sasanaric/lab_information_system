package lis.services;

import lis.base.CrudService;

import java.util.List;

public interface UserService extends CrudService<Integer> {
    List<String> getAllUsernames();
}
