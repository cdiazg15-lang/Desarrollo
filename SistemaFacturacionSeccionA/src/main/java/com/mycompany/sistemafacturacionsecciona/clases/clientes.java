package com.mycompany.sistemafacturacionsecciona.clases;
public class clientes {
        
    int IdCliente;
    String NitCliente;
    String NombreCliente;
    String ApellidoCliente;
    String DireccionCliente;
    String TelefonoCliente;
    String CorreoCliente;
    String EstadoCliente;

    public clientes(int IdCliente, String NitCliente, String NombreCliente, String ApellidoCliente, String DireccionCliente, String TelefonoCliente, String CorreoCliente, String EstadoCliente) {
        this.IdCliente = IdCliente;
        this.NitCliente = NitCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.DireccionCliente = DireccionCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
        this.EstadoCliente = EstadoCliente;
        
        
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    public String getEstadoCliente() {
        return EstadoCliente;
    }

    public void setEstadoCliente(String EstadoCliente) {
        this.EstadoCliente = EstadoCliente;
    }
       
}