package com.mycompany.ejercicio6;

import java.util.ArrayList;

public class Ejercicio6 {

    // Método para calcular el promedio
    public static double calcularPromedio(ArrayList<Double> ventas) {

        double suma = 0;

        // Recorremos todas las ventas
        for (double venta : ventas) {
            suma = suma + venta;
        }

        // Retornamos el promedio
        return suma / ventas.size();
    }

    // Método para obtener el valor máximo
    public static double obtenerMaximo(ArrayList<Double> ventas) {

        // Tomamos el primer valor como máximo
        double maximo = ventas.get(0);

        // Recorremos la lista
        for (double venta : ventas) {

            if (venta > maximo) {
                maximo = venta;
            }
        }

        return maximo;
    }

    // Método para obtener el valor mínimo
    public static double obtenerMinimo(ArrayList<Double> ventas) {

        // Tomamos el primer valor como mínimo
        double minimo = ventas.get(0);

        // Recorremos la lista
        for (double venta : ventas) {

            if (venta < minimo) {
                minimo = venta;
            }
        }

        return minimo;
    }

    // Método para contar los días que superaron el promedio
    public static int diasSobrePromedio(
            ArrayList<Double> ventas,
            double promedio) {

        int contador = 0;

        for (double venta : ventas) {

            if (venta > promedio) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        // Creamos la lista
        ArrayList<Double> ventas = new ArrayList<>();

        // Agregamos ventas
        ventas.add(1000.0);
        ventas.add(1500.0);
        ventas.add(800.0);
        ventas.add(2000.0);
        ventas.add(1200.0);
        ventas.add(1800.0);

        // Calculamos el promedio
        double promedio = calcularPromedio(ventas);

        // Calculamos máximo
        double maximo = obtenerMaximo(ventas);

        // Calculamos mínimo
        double minimo = obtenerMinimo(ventas);

        // Contamos días sobre el promedio
        int dias = diasSobrePromedio(ventas, promedio);

        // Mostramos resultados
        System.out.println("Promedio: Q" + promedio);
        System.out.println("Máximo: Q" + maximo);
        System.out.println("Mínimo: Q" + minimo);
        System.out.println("Días sobre el promedio: " + dias);
    }
}