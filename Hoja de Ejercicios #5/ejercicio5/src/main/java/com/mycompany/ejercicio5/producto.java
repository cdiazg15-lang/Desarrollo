package com.mycompany.ejercicio5;

public class producto {
   
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setter del precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

