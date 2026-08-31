package com.mycompany.sistemafacturacionsecciona;

import com.mycompany.sistemafacturacionsecciona.clases.clientes;
import com.mycompany.sistemafacturacionsecciona.clases.producto;
import com.mycompany.sistemafacturacionsecciona.clases.detallefactura;
import com.mycompany.sistemafacturacionsecciona.clases.factura;

public class SistemaFacturacionSeccionA {

    public static void main(String[] args) {

        // Crear cliente
        clientes cliente = new clientes(
                1,
                "1234567-8",
                "Carlos",
                "Diaz",
                "Guatemala",
                "5555-5555",
                "carlos@gmail.com",
                "Activo"
        );

        // Crear producto
        producto producto = new producto(
                1,
                "Laptop",
                5000
        );

        // Crear detalle de factura
        detallefactura detalle = new detallefactura(
                1,
                producto,
                2
        );

        // Crear factura
        factura factura = new factura(
                1001,
                cliente,
                "31/08/2026"
        );

        // Agregar detalle a la factura
        factura.CrearFacturaDetalle(detalle);

        // Mostrar factura antes de anular
        factura.MostrarFactura();

        // Anular factura
        factura.AnularFactura();

        // Mostrar factura después de anular
        factura.MostrarFactura();
       
} 
}