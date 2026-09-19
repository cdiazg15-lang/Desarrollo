package com.mycompany.ejercicio7;

public class ItemCarrito {

    private String producto;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Obtener producto
    public String getProducto() {
        return producto;
    }

    // Obtener cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Modificar cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Obtener precio unitario
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    // Calcular subtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
}