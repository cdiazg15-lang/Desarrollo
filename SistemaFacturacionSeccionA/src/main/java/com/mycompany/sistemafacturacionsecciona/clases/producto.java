package com.mycompany.sistemafacturacionsecciona.clases;

public class producto {

    int IdProducto;
    String NombreProducto;
    String DescripcionProducto;
    double PrecioProducto;
    int StockProducto;
    String EstadoProducto;

    public producto(int IdProducto, String NombreProducto, String DescripcionProducto,
                    double PrecioProducto, int StockProducto, String EstadoProducto) {

        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.PrecioProducto = PrecioProducto;
        this.StockProducto = StockProducto;
        this.EstadoProducto = EstadoProducto;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }

    public String getEstadoProducto() {
        return EstadoProducto;
    }

    public void setEstadoProducto(String EstadoProducto) {
        this.EstadoProducto = EstadoProducto;
    }
}

