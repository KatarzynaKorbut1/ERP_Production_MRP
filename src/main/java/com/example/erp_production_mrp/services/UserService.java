package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.User;
import com.example.erp_production_mrp.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    @Autowired
   private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(long userId){
        return userRepository.findById(userId).get();
    }

    // method to change
    public User updateUserById(long userId) {
        var user = userRepository.findById(userId).get();
        user.setUsername(user.getUsername());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        userRepository.save(user);
        return user;

//        User user = userRepository.findById(userId).get();
//        user.setUsername(user.getUsername());
//        return user;
    }
}
