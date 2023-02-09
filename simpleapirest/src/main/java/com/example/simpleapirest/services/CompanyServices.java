package com.example.simpleapirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleapirest.models.Company;
import com.example.simpleapirest.models.repository.CompanyRepository;

@Service
public class CompanyServices {
    

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }

    public Company getCompanyByID (Integer id){
        if(id == null){
            throw new IllegalArgumentException("ID cannot by Null");
        }
        return companyRepository.findById(id).orElseThrow();
    }

    public Company crearContrato(Company company){
        return companyRepository.save(company);
    }

    public Company updateCompany(Company Company){
        Company existinfCompany = companyRepository.findById(company.getId_empresa()).orElse();
        if (existinfCompany != null){
            existinfCompany.setNombre(company.getNombre);
            existinfCompany.setDireccion(company.getDireccion);
            return companyRepository.save(existinfCompany);
        }
        else{
            return null;
        }
    }

    public String deleteCompany(Integer id){
        companyRepository.deleteById(id);
        return "Empresa Borrada" + id;
    } 
}
