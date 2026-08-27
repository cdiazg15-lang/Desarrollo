package com.mycompany.ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(7);
        numeros.add(4);
        numeros.add(13);
        numeros.add(8);
        numeros.add(21);
        numeros.add(16);
        numeros.add(9);

        System.out.println("Números pares:");

        for (int numero : numeros) {

            if (numero % 2 == 0) {   //calcula numeros pares con operador %
                System.out.println(numero);
            }
        }
    }
}
