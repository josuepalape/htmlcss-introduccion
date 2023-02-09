package com.example.simpleapirest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
    

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id_empresa;

    @Column(name = "nombreEmpresa")
    private String nombre;

    @Column(name = "direccionEmpresa")
    private String direccion;

    @Column(name = "Id_Contrato")
    private String id_Contrato;

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Company [id_empresa=" + id_empresa + ", nombre=" + nombre + ", direccion=" + direccion
                + ", id_Contrato=" + id_Contrato + "]";
    }


}
