package com.mycompany.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidad = teclado.nextInt(); //Salto de linea pendiente

        teclado.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = teclado.nextLine();

            nombres.add(nombre);
        }

        System.out.println("\nNombres ingresados:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
