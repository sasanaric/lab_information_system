package lis.services;

import lis.base.CrudService;
import lis.models.User;
import lis.models.UserResponse;
import lis.models.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService extends CrudService<Integer> {
    List<String> getAllUsernames();

    List<User> getAllUsers();
    UserResponse getCurrentUser();
    String getCurrentRole();
    Integer getCurrentId();
}
