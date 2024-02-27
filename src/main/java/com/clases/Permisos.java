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

/**
 *
 * @author david
 */

@Entity
@Table(name="permisos")

public class Permisos implements Serializable {
    
    @Id
    private int idPermisos;
    @Column
    private int idUsuario;
    @Column
    private boolean agregarEmpleados;
    @Column
    private boolean editarEmpleados;
    @Column
    private boolean desactivarEmpleados;
    @Column
    private boolean imprimirEmpleados;
    @Column
    private boolean buscarEmpleados;
    @Column
    private boolean agregarProveedores;
    @Column
    private boolean editarProveedores;
    @Column
    private boolean desactivarProveedores;
    @Column
    private boolean imprimirProveedores;
    @Column
    private boolean buscarProveedores;
    @Column
    private boolean agregarClientes;
    @Column
    private boolean editarClientes;
    @Column
    private boolean desactivarClientes;
    @Column
    private boolean imprimirClientes;
    @Column
    private boolean buscarClientes;
    @Column
    private boolean registrarCompras;
    @Column
    private boolean buscarCompras;
    @Column
    private boolean mostrarCompras;
    @Column
    private boolean generarVentas;
    @Column
    private boolean buscarVentas;
    @Column
    private boolean mostrarVentas;
    @Column
    private boolean agregarArticulos;
    @Column
    private boolean editarArticulos;
    @Column
    private boolean desactivarArticulos;
    @Column
    private boolean imprimirArticulos;
    @Column
    private boolean buscarArticulos;
    @Column
    private boolean agregarTipoDocumento;
    @Column
    private boolean editarTipoDocumento;
    @Column
    private boolean desactivarTipoDocumento;
    @Column
    private boolean imprimirTipoDocumento;
    @Column
    private boolean agregarTipoPago;
    @Column
    private boolean editarTipoPago;
    @Column
    private boolean desactivarTipoPago;
    @Column
    private boolean imprimirTipoPago;
    @Column
    private boolean agregarSeccionTienda;
    @Column
    private boolean editarSeccionTienda;
    @Column
    private boolean desactivarSeccionTienda;
    @Column
    private boolean imprimirSeccionTienda;
    @Column
    private boolean imprimirPrecioHistorico;
    @Column
    private boolean buscarPrecioHistorico;
    @Column
    private boolean agregarAreaLaboral;
    @Column
    private boolean editarAreaLaboral;
    @Column
    private boolean desactivarAreaLaboral;
    @Column
    private boolean imprimirAreaLaboral;
    @Column
    private boolean agregarTalla;
    @Column
    private boolean editarTalla;
    @Column
    private boolean desactivarTalla;
    @Column
    private boolean imprimirTalla;
    @Column
    private boolean agregarEstados;
    @Column
    private boolean editarEstados;
    @Column
    private boolean desactivarEstados;
    @Column
    private boolean imprimirEstados;
    @Column
    private boolean agregarParametros;
    @Column
    private boolean imprimirParametros;

    public int getIdPermisos() {
        return idPermisos;
    }

    public void setIdPermisos(int idPermisos) {
        this.idPermisos = idPermisos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isAgregarEmpleados() {
        return agregarEmpleados;
    }

    public void setAgregarEmpleados(boolean agregarEmpleados) {
        this.agregarEmpleados = agregarEmpleados;
    }

    public boolean isEditarEmpleados() {
        return editarEmpleados;
    }

    public void setEditarEmpleados(boolean editarEmpleados) {
        this.editarEmpleados = editarEmpleados;
    }

    public boolean isDesactivarEmpleados() {
        return desactivarEmpleados;
    }

    public void setDesactivarEmpleados(boolean desactivarEmpleados) {
        this.desactivarEmpleados = desactivarEmpleados;
    }

    public boolean isImprimirEmpleados() {
        return imprimirEmpleados;
    }

    public void setImprimirEmpleados(boolean imprimirEmpleados) {
        this.imprimirEmpleados = imprimirEmpleados;
    }

    public boolean isBuscarEmpleados() {
        return buscarEmpleados;
    }

    public void setBuscarEmpleados(boolean buscarEmpleados) {
        this.buscarEmpleados = buscarEmpleados;
    }

    public boolean isAgregarProveedores() {
        return agregarProveedores;
    }

    public void setAgregarProveedores(boolean agregarProveedores) {
        this.agregarProveedores = agregarProveedores;
    }

    public boolean isEditarProveedores() {
        return editarProveedores;
    }

    public void setEditarProveedores(boolean editarProveedores) {
        this.editarProveedores = editarProveedores;
    }

    public boolean isDesactivarProveedores() {
        return desactivarProveedores;
    }

    public void setDesactivarProveedores(boolean desactivarProveedores) {
        this.desactivarProveedores = desactivarProveedores;
    }

    public boolean isImprimirProveedores() {
        return imprimirProveedores;
    }

    public void setImprimirProveedores(boolean imprimirProveedores) {
        this.imprimirProveedores = imprimirProveedores;
    }

    public boolean isBuscarProveedores() {
        return buscarProveedores;
    }

    public void setBuscarProveedores(boolean buscarProveedores) {
        this.buscarProveedores = buscarProveedores;
    }

    public boolean isAgregarClientes() {
        return agregarClientes;
    }

    public void setAgregarClientes(boolean agregarClientes) {
        this.agregarClientes = agregarClientes;
    }

    public boolean isEditarClientes() {
        return editarClientes;
    }

    public void setEditarClientes(boolean editarClientes) {
        this.editarClientes = editarClientes;
    }

    public boolean isDesactivarClientes() {
        return desactivarClientes;
    }

    public void setDesactivarClientes(boolean desactivarClientes) {
        this.desactivarClientes = desactivarClientes;
    }

    public boolean isImprimirClientes() {
        return imprimirClientes;
    }

    public void setImprimirClientes(boolean imprimirClientes) {
        this.imprimirClientes = imprimirClientes;
    }

    public boolean isBuscarClientes() {
        return buscarClientes;
    }

    public void setBuscarClientes(boolean buscarClientes) {
        this.buscarClientes = buscarClientes;
    }

    public boolean isRegistrarCompras() {
        return registrarCompras;
    }

    public void setRegistrarCompras(boolean registrarCompras) {
        this.registrarCompras = registrarCompras;
    }

    public boolean isBuscarCompras() {
        return buscarCompras;
    }

    public void setBuscarCompras(boolean buscarCompras) {
        this.buscarCompras = buscarCompras;
    }

    public boolean isMostrarCompras() {
        return mostrarCompras;
    }

    public void setMostrarCompras(boolean mostrarCompras) {
        this.mostrarCompras = mostrarCompras;
    }

    public boolean isGenerarVentas() {
        return generarVentas;
    }

    public void setGenerarVentas(boolean generarVentas) {
        this.generarVentas = generarVentas;
    }

    public boolean isBuscarVentas() {
        return buscarVentas;
    }

    public void setBuscarVentas(boolean buscarVentas) {
        this.buscarVentas = buscarVentas;
    }

    public boolean isMostrarVentas() {
        return mostrarVentas;
    }

    public void setMostrarVentas(boolean mostrarVentas) {
        this.mostrarVentas = mostrarVentas;
    }

    public boolean isAgregarArticulos() {
        return agregarArticulos;
    }

    public void setAgregarArticulos(boolean agregarArticulos) {
        this.agregarArticulos = agregarArticulos;
    }

    public boolean isEditarArticulos() {
        return editarArticulos;
    }

    public void setEditarArticulos(boolean editarArticulos) {
        this.editarArticulos = editarArticulos;
    }

    public boolean isDesactivarArticulos() {
        return desactivarArticulos;
    }

    public void setDesactivarArticulos(boolean desactivarArticulos) {
        this.desactivarArticulos = desactivarArticulos;
    }

    public boolean isImprimirArticulos() {
        return imprimirArticulos;
    }

    public void setImprimirArticulos(boolean imprimirArticulos) {
        this.imprimirArticulos = imprimirArticulos;
    }

    public boolean isBuscarArticulos() {
        return buscarArticulos;
    }

    public void setBuscarArticulos(boolean buscarArticulos) {
        this.buscarArticulos = buscarArticulos;
    }

    public boolean isAgregarTipoDocumento() {
        return agregarTipoDocumento;
    }

    public void setAgregarTipoDocumento(boolean agregarTipoDocumento) {
        this.agregarTipoDocumento = agregarTipoDocumento;
    }

    public boolean isEditarTipoDocumento() {
        return editarTipoDocumento;
    }

    public void setEditarTipoDocumento(boolean editarTipoDocumento) {
        this.editarTipoDocumento = editarTipoDocumento;
    }

    public boolean isDesactivarTipoDocumento() {
        return desactivarTipoDocumento;
    }

    public void setDesactivarTipoDocumento(boolean desactivarTipoDocumento) {
        this.desactivarTipoDocumento = desactivarTipoDocumento;
    }

    public boolean isImprimirTipoDocumento() {
        return imprimirTipoDocumento;
    }

    public void setImprimirTipoDocumento(boolean imprimirTipoDocumento) {
        this.imprimirTipoDocumento = imprimirTipoDocumento;
    }

    public boolean isAgregarTipoPago() {
        return agregarTipoPago;
    }

    public void setAgregarTipoPago(boolean agregarTipoPago) {
        this.agregarTipoPago = agregarTipoPago;
    }

    public boolean isEditarTipoPago() {
        return editarTipoPago;
    }

    public void setEditarTipoPago(boolean editarTipoPago) {
        this.editarTipoPago = editarTipoPago;
    }

    public boolean isDesactivarTipoPago() {
        return desactivarTipoPago;
    }

    public void setDesactivarTipoPago(boolean desactivarTipoPago) {
        this.desactivarTipoPago = desactivarTipoPago;
    }

    public boolean isImprimirTipoPago() {
        return imprimirTipoPago;
    }

    public void setImprimirTipoPago(boolean imprimirTipoPago) {
        this.imprimirTipoPago = imprimirTipoPago;
    }

    public boolean isAgregarSeccionTienda() {
        return agregarSeccionTienda;
    }

    public void setAgregarSeccionTienda(boolean agregarSeccionTienda) {
        this.agregarSeccionTienda = agregarSeccionTienda;
    }

    public boolean isEditarSeccionTienda() {
        return editarSeccionTienda;
    }

    public void setEditarSeccionTienda(boolean editarSeccionTienda) {
        this.editarSeccionTienda = editarSeccionTienda;
    }

    public boolean isDesactivarSeccionTienda() {
        return desactivarSeccionTienda;
    }

    public void setDesactivarSeccionTienda(boolean desactivarSeccionTienda) {
        this.desactivarSeccionTienda = desactivarSeccionTienda;
    }

    public boolean isImprimirSeccionTienda() {
        return imprimirSeccionTienda;
    }

    public void setImprimirSeccionTienda(boolean imprimirSeccionTienda) {
        this.imprimirSeccionTienda = imprimirSeccionTienda;
    }

    public boolean isImprimirPrecioHistorico() {
        return imprimirPrecioHistorico;
    }

    public void setImprimirPrecioHistorico(boolean imprimirPrecioHistorico) {
        this.imprimirPrecioHistorico = imprimirPrecioHistorico;
    }

    public boolean isBuscarPrecioHistorico() {
        return buscarPrecioHistorico;
    }

    public void setBuscarPrecioHistorico(boolean buscarPrecioHistorico) {
        this.buscarPrecioHistorico = buscarPrecioHistorico;
    }

    public boolean isAgregarAreaLaboral() {
        return agregarAreaLaboral;
    }

    public void setAgregarAreaLaboral(boolean agregarAreaLaboral) {
        this.agregarAreaLaboral = agregarAreaLaboral;
    }

    public boolean isEditarAreaLaboral() {
        return editarAreaLaboral;
    }

    public void setEditarAreaLaboral(boolean editarAreaLaboral) {
        this.editarAreaLaboral = editarAreaLaboral;
    }

    public boolean isDesactivarAreaLaboral() {
        return desactivarAreaLaboral;
    }

    public void setDesactivarAreaLaboral(boolean desactivarAreaLaboral) {
        this.desactivarAreaLaboral = desactivarAreaLaboral;
    }

    public boolean isImprimirAreaLaboral() {
        return imprimirAreaLaboral;
    }

    public void setImprimirAreaLaboral(boolean imprimirAreaLaboral) {
        this.imprimirAreaLaboral = imprimirAreaLaboral;
    }

    public boolean isAgregarTalla() {
        return agregarTalla;
    }

    public void setAgregarTalla(boolean agregarTalla) {
        this.agregarTalla = agregarTalla;
    }

    public boolean isEditarTalla() {
        return editarTalla;
    }

    public void setEditarTalla(boolean editarTalla) {
        this.editarTalla = editarTalla;
    }

    public boolean isDesactivarTalla() {
        return desactivarTalla;
    }

    public void setDesactivarTalla(boolean desactivarTalla) {
        this.desactivarTalla = desactivarTalla;
    }

    public boolean isImprimirTalla() {
        return imprimirTalla;
    }

    public void setImprimirTalla(boolean imprimirTalla) {
        this.imprimirTalla = imprimirTalla;
    }

    public boolean isAgregarEstados() {
        return agregarEstados;
    }

    public void setAgregarEstados(boolean agregarEstados) {
        this.agregarEstados = agregarEstados;
    }

    public boolean isEditarEstados() {
        return editarEstados;
    }

    public void setEditarEstados(boolean editarEstados) {
        this.editarEstados = editarEstados;
    }

    public boolean isDesactivarEstados() {
        return desactivarEstados;
    }

    public void setDesactivarEstados(boolean desactivarEstados) {
        this.desactivarEstados = desactivarEstados;
    }

    public boolean isImprimirEstados() {
        return imprimirEstados;
    }

    public void setImprimirEstados(boolean imprimirEstados) {
        this.imprimirEstados = imprimirEstados;
    }

    public boolean isAgregarParametros() {
        return agregarParametros;
    }

    public void setAgregarParametros(boolean agregarParametros) {
        this.agregarParametros = agregarParametros;
    }

    public boolean isImprimirParametros() {
        return imprimirParametros;
    }

    public void setImprimirParametros(boolean imprimirParametros) {
        this.imprimirParametros = imprimirParametros;
    }


    
    
    
    
    
}
