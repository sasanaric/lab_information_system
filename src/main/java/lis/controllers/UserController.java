package lis.controllers;

import lis.base.CrudController;
import lis.exceptions.NotFoundException;
import lis.models.SinglePatient;
import lis.models.SingleUser;
import lis.models.User;
import lis.models.requests.PatientRequest;
import lis.models.requests.UserRequest;
import lis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;


    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    List<User> findAll() {
        return service.findAll(User.class);
    }

    @GetMapping("/{id}")
    SingleUser findById(@PathVariable Integer id) throws NotFoundException {
        return service.findById(id,SingleUser.class);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SingleUser insert(@RequestBody UserRequest request) throws NotFoundException {
        return service.insert(request, SingleUser.class);
    }

    @PutMapping("/{id}")
    public SingleUser update(@PathVariable Integer id, @RequestBody UserRequest request) throws NotFoundException {
        return service.update(id, request, SingleUser.class);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws NotFoundException {
        service.delete(id);


    }
}