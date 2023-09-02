package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.User;
import com.example.erp_production_mrp.repositories.UserRepository;
import com.example.erp_production_mrp.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> listUserById(@PathVariable Long userId) {
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.FOUND);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // method to change
//    @PutMapping("/user/update/{userId}")
//    public ResponseEntity<User> updateUserById(@PathVariable Long userId, @RequestBody User user) {
//        userService.updateUserById(userId);
//        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
//    }
    @PutMapping("/user/update/{userId}")
    public ResponseEntity<User> updateUserById(@PathVariable Long userId,
                                               @RequestBody User user) {
        userService.updateUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}
