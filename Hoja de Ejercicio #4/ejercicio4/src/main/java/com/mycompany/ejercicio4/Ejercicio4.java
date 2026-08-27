package com.mycompany.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> elementos = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Mostrar elementos");
            System.out.println("3. Eliminar por índice");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el elemento: ");
                    String elemento = teclado.nextLine();

                    elementos.add(elemento);  //agregar elemento

                    System.out.println("Elemento agregado.");
                    break;

                case 2:

                    System.out.println("\nElementos:");

                    for (int i = 0; i < elementos.size(); i++) {
                        System.out.println(i + ": " + elementos.get(i));
                    }

                    break;

                case 3:

                    System.out.print("Ingrese el índice que desea eliminar: ");
                    int indice = teclado.nextInt();

                    if (indice >= 0 && indice < elementos.size()) {

                        elementos.remove(indice);  //elimina por indice

                        System.out.println("Elemento eliminado.");

                    } else {

                        System.out.println("Índice inválido.");
                    }

                    break;

                case 4:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}

