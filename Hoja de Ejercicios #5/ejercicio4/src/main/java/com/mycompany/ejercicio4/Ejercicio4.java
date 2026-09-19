package com.mycompany.ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Crear historial
        HistorialNavegacion historial =
                new HistorialNavegacion();

        // Agregar páginas
        historial.visitarPagina("www.google.com");
        historial.visitarPagina("www.youtube.com");
        historial.visitarPagina("www.github.com");
        historial.visitarPagina("www.facebook.com");
        historial.visitarPagina("www.instagram.com");
        historial.visitarPagina("www.wikipedia.org");
        historial.visitarPagina("www.amazon.com");
        historial.visitarPagina("www.netflix.com");
        historial.visitarPagina("www.microsoft.com");
        historial.visitarPagina("www.apple.com");

        // Esta será la página número 11
        historial.visitarPagina("www.openai.com");

        // Mostrar historial
        historial.mostrarHistorial();
    }
}

