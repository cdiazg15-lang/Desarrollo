package com.mycompany.ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

    // Método que filtra empleados
    public static ArrayList<Empleado> filtrarEmpleados(
            ArrayList<Empleado> empleados,
            String departamento) {

        // Creamos una nueva lista
        ArrayList<Empleado> resultado = new ArrayList<>();

        // Recorremos todos los empleados
        for (Empleado empleado : empleados) {

            // Comprobamos departamento y salario
            if (empleado.getDepartamento().equals(departamento)
                    && empleado.getSalario() > 5000) {

                // Agregamos el empleado a la nueva lista
                resultado.add(empleado);
            }
        }

        // Devolvemos la nueva lista
        return resultado;
    }

    public static void main(String[] args) {

        // Creamos la lista
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregamos empleados
        empleados.add(
                new Empleado("Carlos", "Sistemas", 6000)
        );

        empleados.add(
                new Empleado("Ana", "Sistemas", 4500)
        );

        empleados.add(
                new Empleado("Pedro", "Ventas", 7000)
        );

        empleados.add(
                new Empleado("Maria", "Sistemas", 8000)
        );

        // Buscamos empleados de Sistemas
        ArrayList<Empleado> resultado =
                filtrarEmpleados(empleados, "Sistemas");

        // Mostramos resultado
        for (Empleado empleado : resultado) {

            System.out.println(
                    empleado.getNombre()
                    + " - "
                    + empleado.getDepartamento()
                    + " - Q"
                    + empleado.getSalario()
            );
        }
    }
}

