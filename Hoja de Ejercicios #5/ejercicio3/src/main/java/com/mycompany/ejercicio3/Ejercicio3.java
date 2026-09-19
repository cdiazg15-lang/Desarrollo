package com.mycompany.ejercicio3;
import java.util.ArrayList;

public class Ejercicio3 {

    // Calcular el promedio de las ventas
    public static double calcularPromedio(
            ArrayList<Double> ventas) {

        double suma = 0;

        // Recorremos las ventas
        for (double venta : ventas) {

            suma = suma + venta;
        }

        // Calculamos promedio
        return suma / ventas.size();
    }

    // Encontrar la venta máxima
    public static double obtenerMaximo(
            ArrayList<Double> ventas) {

        // Comenzamos con el primer elemento
        double maximo = ventas.get(0);

        for (double venta : ventas) {

            if (venta > maximo) {
                maximo = venta;
            }
        }

        return maximo;
    }

    // Encontrar la venta mínima
    public static double obtenerMinimo(
            ArrayList<Double> ventas) {

        // Comenzamos con el primer elemento
        double minimo = ventas.get(0);

        for (double venta : ventas) {

            if (venta < minimo) {
                minimo = venta;
            }
        }

        return minimo;
    }

    // Contar días que superaron el promedio
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

        // Crear ArrayList de ventas
        ArrayList<Double> ventas = new ArrayList<>();

        // Agregar ventas
        ventas.add(1000.0);
        ventas.add(1500.0);
        ventas.add(800.0);
        ventas.add(2000.0);
        ventas.add(1200.0);
        ventas.add(1800.0);

        // Calcular promedio
        double promedio = calcularPromedio(ventas);

        // Calcular máximo
        double maximo = obtenerMaximo(ventas);

        // Calcular mínimo
        double minimo = obtenerMinimo(ventas);

        // Contar días sobre el promedio
        int dias = diasSobrePromedio(ventas, promedio);

        // Mostrar resultados
        System.out.println("Promedio: Q" + promedio);
        System.out.println("Máximo: Q" + maximo);
        System.out.println("Mínimo: Q" + minimo);
        System.out.println(
                "Días sobre el promedio: " + dias
        );
    }
}

