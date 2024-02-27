/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name="facturasdevueltas")
public class FacturasDevueltas implements Serializable {
    
    @Id
    private int idFacturaDevuelta;
    @Column
    private int idEmpleados;
    @Column
    private int idVenta;
    @Column
    private java.sql.Timestamp fechaDevolucion;
    @Column
    private String descripcion;

    public int getIdFacturaDevuelta() {
        return idFacturaDevuelta;
    }

    public void setIdFacturaDevuelta(int idFacturaDevuelta) {
        this.idFacturaDevuelta = idFacturaDevuelta;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Timestamp getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Timestamp fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
