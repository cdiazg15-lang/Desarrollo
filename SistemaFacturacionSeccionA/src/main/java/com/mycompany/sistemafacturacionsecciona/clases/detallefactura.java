package com.mycompany.sistemafacturacionsecciona.clases;

public class detallefactura {

    int IdDetalle;
    producto producto;
    int Cantidad;
    double PrecioUnitario;
    double Subtotal;

    public detallefactura(int IdDetalle, producto producto, int Cantidad) {
        this.IdDetalle = IdDetalle;
        this.producto = producto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = producto.getPrecioProducto();
        this.Subtotal = PrecioUnitario * Cantidad;
    }

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
        this.PrecioUnitario = producto.getPrecioProducto();
        calcularSubtotal();
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
        calcularSubtotal();
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    private void calcularSubtotal() {
        Subtotal = PrecioUnitario * Cantidad;
    }
}

