package com.mycompany.ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Crear carrito
        CarritoCompras carrito =
                new CarritoCompras();

        // Agregar productos
        carrito.agregarItem(
                "Teclado", 2, 150
        );

        carrito.agregarItem(
                "Mouse", 1, 75
        );

        // Agregamos nuevamente Teclado
        carrito.agregarItem(
                "Teclado", 3, 150
        );

        // Mostrar carrito
        carrito.mostrarCarrito();

        // Mostrar total
        System.out.println(
                "Total: Q" + carrito.calcularTotal()
        );

        // Eliminar mouse
        carrito.eliminarItem("Mouse");

        System.out.println("\nDespués de eliminar Mouse:");

        carrito.mostrarCarrito();

        // Vaciar carrito
        carrito.vaciarCarrito();

        System.out.println("\nCarrito vaciado.");

        System.out.println(
                "Total: Q" + carrito.calcularTotal()
        );
    }
}