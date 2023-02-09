package com.example.simpleapirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleapirest.models.User;
import com.example.simpleapirest.services.UserServices;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(userServices.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        if (id == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().body(userServices.getUserById(id));
    }

    @PostMapping("/users/crear")
    public ResponseEntity<User> savUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userServices.savUser(user));
    }

    @PutMapping("/users/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userServices.updateUser(user));
    }

    @DeleteMapping("/users/delete/{id}")
    public HttpStatus deleteUser(@PathVariable Integer id){
        this.userServices.deleteUser(id);
        return HttpStatus.OK;
    }


}
