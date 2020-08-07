package com.nd2k.server_mongo.controllers;

import com.nd2k.server_mongo.models.User;
import com.nd2k.server_mongo.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createProject(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable String id) {
        return userRepository.findById(id);
    }

}
