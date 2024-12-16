package com.restaurant.services;

import org.springframework.stereotype.Service;

import com.restaurant.entities.User;
import com.restaurant.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository; // Declared as final for immutability

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
