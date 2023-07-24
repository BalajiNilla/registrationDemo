package com.project.registration.controller;

//create a rest controller class

import java.util.List;
import com.project.registration.model.user;
import com.project.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController 
{
    @Autowired
    private UserService service;

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @PostMapping(value = "/addUser")
    public String addUser(@ModelAttribute user user)
    {
        service.saveUser(user);
        return "Details are saved";
    } 


    @GetMapping("/users")
    public List<user> findAllUsers() 
    {
        return service.getUsers();
    }

    @GetMapping("/userById/{id}")
    public user findUserById(@PathVariable int id) 
    {
        return service.getUserById(id);
    }

    @GetMapping("/user/{name}")
    public List<user> findUserByName(@PathVariable String name) 
    {
        return service.getUserByName(name);
    }

    @PutMapping("/update/{id}")
    public user updateUser(@PathVariable Integer id,@RequestBody user user) 
    {
        return service.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) 
    {
        return service.deleteUser(id);
    }
}