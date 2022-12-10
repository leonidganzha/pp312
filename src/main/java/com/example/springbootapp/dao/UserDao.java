package com.example.springbootapp.dao;


import com.example.springbootapp.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    List<User> getAllUsers();
}
