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
@Table(name="empleados")
public class Empleados implements Serializable {
    
    @Id
    private int idEmpleados;
    @Column
    private String nombreEmpleado;
    @Column
    private String apellidoEmpleado;
    @Column
    private long telefonoEmpleado;
    @Column
    private String correoEmpleado;
    @Column
    private java.sql.Timestamp fechaDeNacimiento;
    @Column
    private boolean activoEmpleado;
    @Column
    private String documento;
    @Column
    private int idSexo;
    @Column
    private int idTipoDocumento;
    @Column
    private int idAreaLaboral;
    

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public long getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(long telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Timestamp getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Timestamp fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }



    public boolean isActivoEmpleado() {
        return activoEmpleado;
    }

    public void setActivoEmpleado(boolean activoEmpleado) {
        this.activoEmpleado = activoEmpleado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdAreaLaboral() {
        return idAreaLaboral;
    }

    public void setIdAreaLaboral(int idAreaLaboral) {
        this.idAreaLaboral = idAreaLaboral;
    }
    
    
    
    
}
