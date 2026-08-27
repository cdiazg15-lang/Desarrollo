package com.mycompany.ejercicio9;

import java.util.ArrayList;

public class Ejercicio9 {

    public static void main(String[] args) {

        ArrayList<empleado> empleados = new ArrayList<>();

        empleados.add(new empleado("Juan", 3500));
        empleados.add(new empleado("Pedro", 4200));
        empleados.add(new empleado("Maria", 5000));
        empleados.add(new empleado("Ana", 3800));

        double suma = 0;

        System.out.println("Empleados:");

        for (empleado empleado : empleados) {

            empleado.mostrarDatos();

            suma = suma + empleado.Salario;
        }

        double promedio = suma / empleados.size();  //calcula promedio

        System.out.println("\nPromedio de salarios: " + promedio);
    }
}
