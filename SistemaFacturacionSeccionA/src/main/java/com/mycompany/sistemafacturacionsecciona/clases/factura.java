package com.mycompany.sistemafacturacionsecciona.clases;

import java.util.ArrayList;

public class factura {

    int IdFactura;
    clientes Clientes;
    String Fecha;
    ArrayList<detallefactura> DetalleFactura;
    boolean Anulada;

    public factura(int IdFactura, clientes Clientes, String Fecha) {
        this.IdFactura = IdFactura;
        this.Clientes = Clientes;
        this.Fecha = Fecha;
        this.DetalleFactura = new ArrayList<>();
        this.Anulada = false; // La factura inicia activa
    }

    // Crear Detalle Factura
    public void CrearFacturaDetalle(detallefactura detalle) {
        // Agregar el detalle a la factura
        DetalleFactura.add(detalle);
    }

    // Anular Factura
    public void AnularFactura() {

        if (!this.Anulada) {
            this.Anulada = true;
            System.out.println("La Factura No. " + this.IdFactura + " fue anulada");
        } else {
        System.out.println("La Factura No. " + this.IdFactura + " ya está anulada");
    }
}
   
    
    
    
    // Mostrar Factura
    public void MostrarFactura() {

    System.out.println("=================================");
    System.out.println("             FACTURA");
    System.out.println("=================================");
    System.out.println("No. Factura: " + IdFactura);
    System.out.println("Fecha: " + Fecha);
    System.out.println("Estado: " + (Anulada ? "Anulada" : "Activa"));

    System.out.println("\nCLIENTE");
    System.out.println("ID Cliente: " + Clientes.IdCliente);
    System.out.println("NIT: " + Clientes.NitCliente);
    System.out.println("Nombre: " + Clientes.NombreCliente + " " + Clientes.ApellidoCliente);
    System.out.println("Direccion: " + Clientes.DireccionCliente);
    System.out.println("Telefono: " + Clientes.TelefonoCliente);
    System.out.println("Correo: " + Clientes.CorreoCliente);

    System.out.println("\nDETALLE");

    for (detallefactura detalle : DetalleFactura) {
        System.out.println("ID Detalle: " + detalle.IdDetalle);
        System.out.println("Producto: " + detalle.Producto.NombreProducto);
        System.out.println("Cantidad: " + detalle.Cantidad);
        System.out.println("Precio Unitario: Q" + detalle.PrecioUnitario);
        System.out.println("Subtotal: Q" + detalle.Subtotal);
    }

    System.out.println("=================================");
}
}

