package com.mycompany.sistemafacturacionsecciona.clases;

import java.util.ArrayList;

public class factura {

    int IdFactura;
    String FechaFactura;
    clientes cliente;
    ArrayList<detallefactura> detalles;

    double Subtotal;
    double IVA;
    double Total;

    public factura(int IdFactura, String FechaFactura, clientes cliente) {

        this.IdFactura = IdFactura;
        this.FechaFactura = FechaFactura;
        this.cliente = cliente;

        detalles = new ArrayList<>();

        Subtotal = 0;
        IVA = 0;
        Total = 0;
    }

    public void agregarDetalle(detallefactura detalle) {

        detalles.add(detalle);

        calcularTotales();
    }

    public void calcularTotales() {

        Subtotal = 0;

        for (detallefactura detalle : detalles) {
            Subtotal += detalle.getSubtotal();
        }

        IVA = Subtotal * 0.12;

        Total = Subtotal + IVA;
    }

    public void mostrarFactura() {

    System.out.println("==============================================");
    System.out.println("                 FACTURA");
    System.out.println("==============================================");

    System.out.println("No. Factura: " + IdFactura);
    System.out.println("Fecha: " + FechaFactura);

    System.out.println();

    System.out.println("CLIENTE");
    System.out.println("NIT: " + cliente.getNitCliente());
    System.out.println("Nombre: " + cliente.getNombreCliente()
            + " " + cliente.getApellidoCliente());

    System.out.println();

    System.out.println("DETALLE DE FACTURA");
    System.out.println("----------------------------------------------");

    for (detallefactura detalle : detalles) {

        System.out.printf(
                "%-15s Cantidad: %-3d Precio: Q%8.2f Subtotal: Q%8.2f%n",
                detalle.getProducto().getNombreProducto(),
                detalle.getCantidad(),
                detalle.getPrecioUnitario(),
                detalle.getSubtotal()
        );
    }

    System.out.println("----------------------------------------------");

    System.out.printf("Subtotal:        Q%.2f%n", Subtotal);
    System.out.printf("IVA 12%%:         Q%.2f%n", IVA);
    System.out.printf("TOTAL:           Q%.2f%n", Total);

    System.out.println("==============================================");
}
}

