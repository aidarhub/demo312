package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User getUserByLogin(String login);
}
