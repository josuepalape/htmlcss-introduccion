package com.example.simpleapirest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleapirest.models.Contract;

public interface ContractRepository extends JpaRepository<Contract,Integer>{
    
}
