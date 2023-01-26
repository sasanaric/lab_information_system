package lis.controllers;

import lis.exceptions.NotFoundException;
import lis.models.SingleUser;
import lis.models.User;
import lis.models.UserResponse;
import lis.models.requests.UserRequest;
import lis.services.UserService;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/users")
public class UserController {

    private final UserService service;


    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    List<User> findAll() {
        return service.getAllUsers();
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

    @GetMapping("/current-role")
    public String getCurrentRole() {
        return service.getCurrentRole();
    }
    @GetMapping("/usernames")
    List<String> getAllUsernames(){
        return service.getAllUsernames();
    }

    @GetMapping("/current-user")
    public ResponseEntity<UserResponse> getCurrentUser() {
        UserResponse currentUser = service.getCurrentUser();
        return new ResponseEntity<>(currentUser, HttpStatus.OK);
    }
}