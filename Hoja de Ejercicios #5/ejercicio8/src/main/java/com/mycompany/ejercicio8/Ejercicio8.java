package com.mycompany.ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio8 {

    // Método para acumular el total por cliente
    public static HashMap<String, Double> resumirFacturas(
            ArrayList<Factura> facturas) {

        // Creamos el resumen
        HashMap<String, Double> resumen =
                new HashMap<>();

        // Recorremos las facturas
        for (Factura factura : facturas) {

            String cliente = factura.getCliente();
            double monto = factura.getMonto();

            // Si el cliente ya existe
            if (resumen.containsKey(cliente)) {

                double totalActual =
                        resumen.get(cliente);

                resumen.put(
                        cliente,
                        totalActual + monto
                );

            } else {

                // Si es la primera factura del cliente
                resumen.put(cliente, monto);
            }
        }

        return resumen;
    }

    public static void main(String[] args) {

        // Crear lista
        ArrayList<Factura> facturas =
                new ArrayList<>();

        // Agregar facturas
        facturas.add(
                new Factura(1, "Carlos", 1000)
        );

        facturas.add(
                new Factura(2, "Ana", 500)
        );

        facturas.add(
                new Factura(3, "Carlos", 700)
        );

        facturas.add(
                new Factura(4, "Ana", 300)
        );

        // Generar resumen
        HashMap<String, Double> resumen =
                resumirFacturas(facturas);

        // Mostrar resumen
        for (Map.Entry<String, Double> entrada
                : resumen.entrySet()) {

            System.out.println(
                    entrada.getKey()
                    + " → Q"
                    + entrada.getValue()
            );
        }
    }
}