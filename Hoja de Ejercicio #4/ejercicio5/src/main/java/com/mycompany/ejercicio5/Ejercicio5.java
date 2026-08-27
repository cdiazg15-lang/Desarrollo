package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Ana");

        System.out.print("Ingrese un nombre para buscar: ");
        String nombre = teclado.nextLine();

        if (nombres.contains(nombre)) {  //devuelve un valor si existe o no

            System.out.println("El nombre existe en la lista.");

        } else {

            System.out.println("El nombre no existe.");
        }
    }
}
