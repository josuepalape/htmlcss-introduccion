package com.example.simpleapirest.models;

/* import org.hibernate.annotations.GeneratorType;
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contrato")
public class Contract {
    

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_contrato;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "sueldo")
    private int sueldo;

    @Column(name = "dContrato")
    private String dContrato;

    @Column(name = "id_User")
    private String id_User;

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getdContrato() {
        return dContrato;
    }

    public void setdContrato(String dContrato) {
        this.dContrato = dContrato;
    }

    public String getId_User() {
        return id_User;
    }

    public void setId_User(String id_User) {
        this.id_User = id_User;
    }

    @Override
    public String toString() {
        return "Contract [id_contrato=" + id_contrato + ", cargo=" + cargo + ", sueldo=" + sueldo + ", dContrato="
                + dContrato + ", id_User=" + id_User + "]";
    }

    

   
    
}
