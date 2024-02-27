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



@Entity
@Table(name="venta")
public class Venta implements Serializable {
    
    
    @Id
    private int idVenta;
    @Column
    private java.sql.Timestamp fechaVenta;
    @Column
    private double impuesto;
    @Column
    private double subTotal;
    @Column
    private double total;
    @Column
    private int idParametros;
    @Column
    private int idEmpleados;
    @Column
    private int idTipoDePago;
    @Column
    private int idCliente;
    @Column
    private int idEstado;
    @Column
    private String numTarjeta;
    @Column
    private String formato;
    @Column
    private double montoEfectivo;
    @Column
    private double montoTarjeta;
    
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Timestamp getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Timestamp fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdParametros() {
        return idParametros;
    }

    public void setIdParametros(int idParametros) {
        this.idParametros = idParametros;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdTipoDePago() {
        return idTipoDePago;
    }

    public void setIdTipoDePago(int idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getMontoEfectivo() {
        return montoEfectivo;
    }

    public void setMontoEfectivo(double montoEfectivo) {
        this.montoEfectivo = montoEfectivo;
    }

    public double getMontoTarjeta() {
        return montoTarjeta;
    }

    public void setMontoTarjeta(double montoTarjeta) {
        this.montoTarjeta = montoTarjeta;
    }
    
    
    
    
}
