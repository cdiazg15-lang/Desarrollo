package com.mycompany.ejercicio1;
import java.util.ArrayList;
public class Ejercicio1 {
    
    public static void aumentarPrecio(
            ArrayList<Producto> productos,
            double porcentaje) {

        // Recorremos todos los productos
        for (Producto producto : productos) {

            // Verificamos si el stock es menor que 10
            if (producto.getStock() < 10) {

                // Calculamos el nuevo precio
                double nuevoPrecio = producto.getPrecio()
                        + (producto.getPrecio() * porcentaje / 100);

                // Actualizamos el precio
                producto.setPrecio(nuevoPrecio);
            }
        }
    }

    public static void main(String[] args) {

        // Creamos el ArrayList
        ArrayList<Producto> productos = new ArrayList<>();

        // Agregamos productos
        productos.add(new Producto(1, "Teclado", 150, 5));
        productos.add(new Producto(2, "Mouse", 75, 15));
        productos.add(new Producto(3, "Monitor", 1200, 7));

        // Aumentamos un 10% los productos con stock menor que 10
        aumentarPrecio(productos, 10);

        // Mostramos los resultados
        for (Producto producto : productos) {

            System.out.println(
                    producto.getNombre()
                    + " - Precio: Q"
                    + producto.getPrecio()
            );
        }
    }
}

