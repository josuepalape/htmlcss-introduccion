package com.example.simpleapirest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleapirest.models.Company;


public interface CompanyRepository extends JpaRepository<Company,Integer>{
    
}
