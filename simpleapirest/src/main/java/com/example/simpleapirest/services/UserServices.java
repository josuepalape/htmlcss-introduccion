package com.example.simpleapirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleapirest.models.User;
import com.example.simpleapirest.models.repository.UserRepository;

@Service
public class UserServices {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Integer id){
        if (id == null){
            throw new IllegalArgumentException("ID cannot be null");
        }
        return userRepository.findById(id).orElseThrow();
    }

    public User savUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        if (existingUser != null){
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        }
        else{
            return null;
        }   
    }

    public String deleteUser(Integer id){
        userRepository.deleteById(id);
        return "Usuario Removido "+ id;
    }
}
