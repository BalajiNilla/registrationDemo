package com.project.registration.service;

import java.util.List;

import com.project.registration.model.user;

public interface UserService 
{

    user saveUser(user user);
    List<user> getUsers();

    user getUserById(int id);

    List<user> getUserByName(String name);

    String deleteUser(int id);
    user updateUser(Integer id, user user);

  
    
}
