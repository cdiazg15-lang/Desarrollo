package com.mycompany.ejercicio7;

import java.util.ArrayList;

public class CarritoCompras {

    // Lista que contiene los productos del carrito
    private ArrayList<ItemCarrito> items;

    // Constructor
    public CarritoCompras() {
        items = new ArrayList<>();
    }

    // Agregar un producto
    public void agregarItem(
            String producto,
            int cantidad,
            double precioUnitario) {

        // Buscamos si el producto ya existe
        for (ItemCarrito item : items) {

            if (item.getProducto().equals(producto)) {

                // Si existe, aumentamos la cantidad
                item.setCantidad(
                        item.getCantidad() + cantidad
                );

                return;
            }
        }

        // Si no existe, creamos un nuevo elemento
        ItemCarrito nuevoItem =
                new ItemCarrito(
                        producto,
                        cantidad,
                        precioUnitario
                );

        items.add(nuevoItem);
    }

    // Eliminar un producto
    public void eliminarItem(String producto) {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getProducto().equals(producto)) {

                items.remove(i);

                return;
            }
        }
    }

    // Vaciar el carrito
    public void vaciarCarrito() {

        items.clear();
    }

    // Calcular el total
    public double calcularTotal() {

        double total = 0;

        for (ItemCarrito item : items) {

            total = total + item.calcularSubtotal();
        }

        return total;
    }

    // Mostrar los productos
    public void mostrarCarrito() {

        for (ItemCarrito item : items) {

            System.out.println(
                    item.getProducto()
                    + " - Cantidad: "
                    + item.getCantidad()
                    + " - Precio: Q"
                    + item.getPrecioUnitario()
            );
        }
    }
}