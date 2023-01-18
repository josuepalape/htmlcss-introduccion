package com.example;

public class Empleado extends Persona{

    private String cargo;
    private int sueldo;

    public Empleado(String nombre, String apellido, int edad, String cargo, int sueldo) {
        super(nombre, apellido, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
        //TODO Auto-generated constructor stub
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
    

    
}
