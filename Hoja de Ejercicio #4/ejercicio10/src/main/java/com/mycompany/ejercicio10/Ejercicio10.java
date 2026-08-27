package com.mycompany.ejercicio10;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Random aleatorio = new Random();

        for (int i = 0; i < 20; i++) {

            int numero = aleatorio.nextInt(100) + 1; //genera numeros de 1 hasta 100

            numeros.add(numero);  //los guarda en arraylist
        } 

        System.out.println("Números generados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
