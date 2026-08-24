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
        this.Anulada = false; //Será cuándo mi factura está activa.
    }
    
    //Crear Detalle Factura
    public void CrearFacturaDetalle(detallefactura detalle){
     //Agregar el detalle
     DetalleFactura.add(detalle);
    }
    
    //Anular Factura
    public void AnularFactura(){
        
        if(this.Anulada = false){
         this.Anulada = true;
            System.out.println("La Factura No. " + this.IdFactura + " fue anulada");
        }
        
    }
    
}