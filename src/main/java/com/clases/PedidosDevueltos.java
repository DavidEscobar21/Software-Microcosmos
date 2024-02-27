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
@Table(name="pedidosdevueltos")
public class PedidosDevueltos implements Serializable {
    
    @Id
    private int idPedidosDevueltos;
    @Column
    private int idEmpleados;
    @Column
    private int idCompra;
    @Column
    private java.sql.Timestamp fechaAnulacion;
    @Column
    private String descripcion;

    public int getIdPedidosDevueltos() {
        return idPedidosDevueltos;
    }

    public void setIdPedidosDevueltos(int idPedidosDevueltos) {
        this.idPedidosDevueltos = idPedidosDevueltos;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Timestamp getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Timestamp fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
