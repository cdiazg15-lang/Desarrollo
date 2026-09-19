package com.mycompany.ejercicio4;

import java.util.ArrayList;

public class HistorialNavegacion {

    // Lista donde se guardan las URLs
    private ArrayList<String> historial;

    // Constructor
    public HistorialNavegacion() {

        historial = new ArrayList<>();
    }

    // Método para visitar una página
    public void visitarPagina(String url) {

        // Agregamos la URL al final
        historial.add(url);

        // Si hay más de 10 elementos
        if (historial.size() > 10) {

            // Eliminamos la URL más antigua
            historial.remove(0);
        }
    }

    // Mostrar historial
    public void mostrarHistorial() {

        for (String url : historial) {

            System.out.println(url);
        }
    }
}