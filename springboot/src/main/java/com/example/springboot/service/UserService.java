package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void removeUserById(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();

    void updateUser(User user);
}
