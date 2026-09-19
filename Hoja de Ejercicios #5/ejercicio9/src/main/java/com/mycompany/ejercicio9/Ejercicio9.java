package com.mycompany.ejercicio9;

import java.util.ArrayList;

public class Ejercicio9 {

    // Método que combina dos ArrayList ordenados
    // manteniendo el orden ascendente.
    public static ArrayList<Integer> combinar(
            ArrayList<Integer> lista1,
            ArrayList<Integer> lista2) {

        // ArrayList donde guardaremos el resultado.
        ArrayList<Integer> resultado = new ArrayList<>();

        // Índices para recorrer las dos listas.
        int i = 0;
        int j = 0;

        // Recorremos ambas listas al mismo tiempo.
        // Este recorrido tiene complejidad O(n + m).
        while (i < lista1.size() && j < lista2.size()) {

            // Comparamos los elementos actuales.
            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        // Agregamos los elementos restantes de lista1.
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        // Agregamos los elementos restantes de lista2.
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }

    public static void main(String[] args) {

        // Primera lista ordenada ascendentemente.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(4);
        lista1.add(7);
        lista1.add(10);

        // Segunda lista ordenada ascendentemente.
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(3);
        lista2.add(8);
        lista2.add(12);

        // Combinamos ambas listas.
        ArrayList<Integer> resultado = combinar(lista1, lista2);

        // Mostramos el resultado.
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista combinada: " + resultado);
    }
}