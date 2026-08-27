package com.mycompany.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("¿Cuántas calificaciones desea ingresar?: ");
        int cantidad = teclado.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            double nota = teclado.nextDouble();

            calificaciones.add(nota);

            suma = suma + nota;
        }

        double promedio = suma / calificaciones.size(); //formula promedio 

        System.out.println("\nCalificaciones:");

        for (double nota : calificaciones) {
            System.out.println(nota);
        }

        System.out.println("Promedio: " + promedio);
    }
}
