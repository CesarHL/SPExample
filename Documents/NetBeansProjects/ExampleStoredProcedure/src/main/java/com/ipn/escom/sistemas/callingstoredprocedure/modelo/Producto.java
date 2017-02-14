package com.ipn.escom.sistemas.callingstoredprocedure.modelo;

import java.io.Serializable;

/**
 *
 * @author Erick
 */
public class Producto implements Serializable {

    private Integer idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto() {

    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }

}
