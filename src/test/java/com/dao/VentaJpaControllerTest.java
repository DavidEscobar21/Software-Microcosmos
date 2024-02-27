/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Venta;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class VentaJpaControllerTest {
    
    VentaJpaController daoVenta = new VentaJpaController();
    
    public VentaJpaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEntityManager method, of class VentaJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        VentaJpaController instance = new VentaJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class VentaJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Venta objVenta = new Venta();
        VentaJpaController instance = new VentaJpaController();
       
            objVenta.setIdVenta(24);
            objVenta.setFechaVenta(Timestamp.valueOf("2021-10-21"+ " 00:00:00"));
            objVenta.setImpuesto(150.00);
            objVenta.setSubTotal(1000.00);
            objVenta.setTotal(1150.00);
            objVenta.setIdParametros(4);
            objVenta.setIdEmpleados(1);
            objVenta.setIdTipoDePago(1);
            objVenta.setIdCliente(6);
            objVenta.setIdEstado(3);         
            objVenta.setFormato("000-001-01-00000024");
            objVenta.setMontoEfectivo(1150.00);
            objVenta.setMontoTarjeta(0.0);
            objVenta.setNumTarjeta("0");
        
        try{
            
        instance.create(objVenta);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }
    /**
     * Test of edit method, of class VentaJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Venta objVenta = new Venta();
        VentaJpaController instance = new VentaJpaController();
        
            objVenta.setIdVenta(21);
            objVenta.setFechaVenta(Timestamp.valueOf("2021-10-13 17:37:48"));
            objVenta.setImpuesto(73.50);
            objVenta.setSubTotal(490.00);
            objVenta.setTotal(563.50);
            objVenta.setIdParametros(4);
            objVenta.setIdEmpleados(1);
            objVenta.setIdTipoDePago(1);
            objVenta.setIdCliente(6);
            objVenta.setIdEstado(3);         
            objVenta.setFormato("000-001-01-00000021");
            objVenta.setMontoEfectivo(563.50);
            objVenta.setMontoTarjeta(0.0);
            objVenta.setNumTarjeta("0");
        
        try{
            
        instance.edit(objVenta);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findVenta method, of class VentaJpaController.
     */
    @Test
    public void testFindVenta() {
        System.out.println("findVenta");
        int id = 1;
        VentaJpaController instance = new VentaJpaController();

        try{
        instance.findVenta(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
}
