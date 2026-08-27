package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Almacena numeros enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = teclado.nextInt();

            numeros.add(numero); //Para agregar
        }

        System.out.println("\nElementos de la lista:");

        for (int numero : numeros) {    //Para recorrer
            System.out.println(numero);
        }
    }
}