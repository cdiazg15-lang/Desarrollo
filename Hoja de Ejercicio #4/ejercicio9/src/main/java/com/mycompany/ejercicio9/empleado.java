package com.mycompany.ejercicio9;

public class empleado {
    
    String Nombre;
    double Salario;

    public empleado(String Nombre, double Salario) {
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: " + Salario);
    }
}
    

