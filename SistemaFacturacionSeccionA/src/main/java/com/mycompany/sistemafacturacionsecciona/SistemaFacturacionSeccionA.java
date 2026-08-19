package com.mycompany.sistemafacturacionsecciona;
import java.util.Scanner;
import com.mycompany.sistemafacturacionsecciona.clases.detallefactura;
import com.mycompany.sistemafacturacionsecciona.clases.factura;
import com.mycompany.sistemafacturacionsecciona.clases.producto;
import com.mycompany.sistemafacturacionsecciona.clases.clientes;

public class SistemaFacturacionSeccionA {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("======================================");
    System.out.println("       SISTEMA DE FACTURACIÓN");
    System.out.println("======================================");

    // ==========================================
    // DATOS DEL CLIENTE
    // ==========================================

    System.out.println("\n--- DATOS DEL CLIENTE ---");

    System.out.print("Ingrese ID del cliente: ");
    int idCliente = entrada.nextInt();
    entrada.nextLine();

    System.out.print("Ingrese NIT: ");
    String nit = entrada.nextLine();

    System.out.print("Ingrese nombre: ");
    String nombre = entrada.nextLine();

    System.out.print("Ingrese apellido: ");
    String apellido = entrada.nextLine();

    System.out.print("Ingrese dirección: ");
    String direccion = entrada.nextLine();

    System.out.print("Ingrese teléfono: ");
    String telefono = entrada.nextLine();

    System.out.print("Ingrese correo: ");
    String correo = entrada.nextLine();


    // ==========================================
    // CREAR CLIENTE
    // ==========================================

    clientes cliente1 = new clientes(
            idCliente,
            nit,
            nombre,
            apellido,
            direccion,
            telefono,
            correo,
            "Activo"
    );


    // ==========================================
    // DATOS DEL PRODUCTO
    // ==========================================

    System.out.println("\n--- DATOS DEL PRODUCTO ---");

    System.out.print("Ingrese ID del producto: ");
    int idProducto = entrada.nextInt();
    entrada.nextLine();

    System.out.print("Ingrese nombre del producto: ");
    String nombreProducto = entrada.nextLine();

    System.out.print("Ingrese descripción: ");
    String descripcion = entrada.nextLine();

    System.out.print("Ingrese precio: ");
    double precio = entrada.nextDouble();

    System.out.print("Ingrese stock: ");
    int stock = entrada.nextInt();

    System.out.print("Ingrese cantidad a comprar: ");
    int cantidad = entrada.nextInt();


    // ==========================================
    // CREAR PRODUCTO
    // ==========================================

    producto producto1 = new producto(
            idProducto,
            nombreProducto,
            descripcion,
            precio,
            stock,
            "Activo"
    );


    // ==========================================
    // CREAR DETALLE
    // ==========================================

    detallefactura detalle1 = new detallefactura(
            1,
            producto1,
            cantidad
    );


    // ==========================================
    // CREAR FACTURA
    // ==========================================

    factura factura1 = new factura(
            1,
            "17/08/2026",
            cliente1
    );


    // ==========================================
    // AGREGAR DETALLE
    // ==========================================

    factura1.agregarDetalle(detalle1);


    // ==========================================
    // MOSTRAR FACTURA
    // ==========================================

    System.out.println("\n");
    factura1.mostrarFactura();

    entrada.close();
}
}