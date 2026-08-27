package com.mycompany.ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> pendientes = new ArrayList<>();

        pendientes.add("Hacer tarea de Java");
        pendientes.add("Estudiar para el examen");  //agrega tareas
        pendientes.add("Hacer ejercicio");
        pendientes.add("Leer apuntes");

        System.out.println("Tareas pendientes:");

        for (int i = 0; i < pendientes.size(); i++) {
            System.out.println(i + ": " + pendientes.get(i));  //obtenemos la tarea
        }

        System.out.print("\nSeleccione una tarea completada: ");
        int indice = teclado.nextInt();

        if (indice >= 0 && indice < pendientes.size()) {

            String tareaCompletada = pendientes.get(indice);

            pendientes.remove(indice);  //quitarla de pendientes

            System.out.println("Tarea completada: " + tareaCompletada);

        } else {

            System.out.println("Índice inválido.");
        }

        System.out.println("\nTareas que todavía están pendientes:");

        for (String tarea : pendientes) {
            System.out.println(tarea);
        }
    }
}