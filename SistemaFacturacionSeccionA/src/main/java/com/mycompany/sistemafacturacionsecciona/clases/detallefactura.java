package com.mycompany.sistemafacturacionsecciona.clases;

public class detallefactura {

    int IdDetalle;
    producto Producto;
    int Cantidad;
    double PrecioUnitario;
    double Subtotal;

    public detallefactura(int IdDetalle, producto Producto, int Cantidad) {
        this.IdDetalle = IdDetalle;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = Producto.Precio;
        this.Subtotal = Cantidad * PrecioUnitario;
    }
}