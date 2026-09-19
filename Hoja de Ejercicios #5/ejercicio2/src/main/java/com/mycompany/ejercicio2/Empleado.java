package com.mycompany.ejercicio2;

public class Empleado {
 
    private String nombre;
    private String departamento;
    private double salario;

    // Constructor
    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Obtener departamento
    public String getDepartamento() {
        return departamento;
    }

    // Obtener salario
    public double getSalario() {
        return salario;
    }
}
    

