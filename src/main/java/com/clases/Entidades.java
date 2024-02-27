/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="entidades")
public class Entidades implements Serializable {
     
    @Id
    private int idEntidad;
    @Column
    private String nombreEntidad;
    @Column
    private boolean activoEntidad;

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public boolean isActivoEntidad() {
        return activoEntidad;
    }

    public void setActivoEntidad(boolean activoEntidad) {
        this.activoEntidad = activoEntidad;
    }
    
    
    
    
}
