package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Empleado e1 = new Empleado("Jorge", "Martinez", 24, "Programador Junior", 900000);
        Empleado e2 = new Empleado("Andres", "Escobar", 34, "Programador Senior", 1500000);
        Empleado e3 = new Empleado("Jhon", "Warburton", 54, "Jefe de Proyecto", 2000000);

        List <Empleado> empleados = new ArrayList<>();

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);


        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getApellido());
            System.out.println("Direccion: " + empleado.getEdad());
            System.out.println("Id Empleado: " + empleado.getCargo());
            System.out.println("Salario: $" + empleado.getSueldo());
            System.out.println("--------o--------");
        }
    }

}
