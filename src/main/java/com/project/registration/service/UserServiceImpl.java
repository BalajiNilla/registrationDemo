package com.project.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.registration.model.user;
import com.project.registration.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<user> getUsers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getUsers'");
    	return userRepository.findAll();
    }

    @Override
    public user getUserById(int id) {
        // TODO Auto-generated method stub
    	return userRepository.findById(id).get();
       // throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public List<user> getUserByName(String name) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getUserByName'");
    	return userRepository.findByfirstname(name);
    }

    @Override
    public String deleteUser(int id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    	userRepository.deleteById(id);
    	return "Deleted";
    }
    @Override
    public user updateUser(Integer id, user user) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    	user updatedEmployee = userRepository.findById(id).get();
    	updatedEmployee.setFirstname(user.getFirstname());
    	updatedEmployee.setLastname(user.getLastname());
    	updatedEmployee.setDob(user.getDob());
    	updatedEmployee.setEmail(user.getEmail());
    	updatedEmployee.setPhone(user.getPhone());
    	updatedEmployee.setAddress(user.getAddress());
    	
    	userRepository.save(updatedEmployee);
    	return updatedEmployee;
    	
    }

    /*
     * Add and save an user to repository
     */
    @Override
    public user saveUser(user user) 
    {
        System.out.println(user);
        return userRepository.save(user);
    }
    
}
