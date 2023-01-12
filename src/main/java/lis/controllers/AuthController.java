package lis.controllers;


import lis.exceptions.NotFoundException;
import lis.models.AuthResponse;
import lis.models.User;
import lis.models.entities.UserEntity;
import lis.models.requests.LoginRequest;
import lis.models.requests.RegisterRequest;
import lis.repositories.UserEntityRepository;
import lis.security.JwtGenerator;
import lis.security.SecurityConfig;
import lis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.oauth2.resourceserver.JwtDsl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private UserService userService;
    private PasswordEncoder passwordEncoder;
    private JwtGenerator jwtGenerator;

    private UserEntityRepository repository;


    public AuthController(AuthenticationManager authenticationManager,
                          UserService userService,
                          PasswordEncoder passwordEncoder,
                          JwtGenerator jwtGenerator,
                          UserEntityRepository repository) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
        this.repository = repository;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) throws NotFoundException {
        if(repository.existsByUsername(request.getUsername())) {
            return new ResponseEntity<>("Username is taken!", HttpStatus.BAD_REQUEST);
        }

        request.setPassword(passwordEncoder.encode(request.getPassword()));
        userService.insert(request, UserEntity.class);
        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        System.out.println(request.getUsername());
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        System.out.println(token);
        return new ResponseEntity<>(new AuthResponse(token), HttpStatus.OK);
    }
}
