package com.example.simpleapirest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleapirest.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}
