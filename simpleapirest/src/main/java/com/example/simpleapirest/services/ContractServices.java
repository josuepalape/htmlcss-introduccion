package com.example.simpleapirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleapirest.models.Contract;
import com.example.simpleapirest.models.repository.ContractRepository;


@Service
public class ContractServices {
    
    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getAllContract(){
        return contractRepository.findAll();
    }

    public Contract getContractByID (Integer id){
        if(id == null){
            throw new IllegalArgumentException("ID cannot by Null");
        }
        return contractRepository.findById(id).orElseThrow();
    }

    public Contract crearContrato(Contract contract){
        return contractRepository.save(contract);
    }

    public Contract updateContract(Contract contract){
        Contract existinfContract = contractRepository.findById(contract.getId_contrato()).orElse(null);
        if (existinfContract != null){
            existinfContract.setSueldo(contract.getSueldo());
            existinfContract.setdContrato(contract.getdContrato());
            return contractRepository.save(existinfContract);
        }
        else{
            return null;
        }
    }

    public String deleteContract(Integer id){
        contractRepository.deleteById(id);
        return "Contrato Borrado" + id;
    }
}
