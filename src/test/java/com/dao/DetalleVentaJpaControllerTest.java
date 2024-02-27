/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.DetalleVenta;
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
public class DetalleVentaJpaControllerTest {
    
    DetalleVentaJpaController daoDetalleVenta = new DetalleVentaJpaController();
    
    public DetalleVentaJpaControllerTest() {
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
     * Test of getEntityManager method, of class DetalleVentaJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        DetalleVentaJpaController instance = new DetalleVentaJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class DetalleVentaJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        DetalleVenta objDetalleVenta = new DetalleVenta();
        DetalleVentaJpaController instance = new DetalleVentaJpaController();
        
        objDetalleVenta.setIdDetalleVenta(29);
        objDetalleVenta.setCantidad(1);
        objDetalleVenta.setIdVenta(22);
        objDetalleVenta.setIdArticulo(4); 
        
        
        try{
            
        instance.create(objDetalleVenta);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class DetalleVentaJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        DetalleVenta objDetalleVenta = new DetalleVenta();
        DetalleVentaJpaController instance = new DetalleVentaJpaController();
        
        objDetalleVenta.setIdDetalleVenta(27);
        objDetalleVenta.setCantidad(1);
        objDetalleVenta.setIdVenta(22);
        objDetalleVenta.setIdArticulo(5);
             
        try{
            
        instance.edit(objDetalleVenta);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findDetalleVenta method, of class DetalleVentaJpaController.
     */
    @Test
    public void testFindDetalleVenta() {
        System.out.println("findDetalleVenta");
        int id = 25;
        DetalleVentaJpaController instance = new DetalleVentaJpaController();
        
        try{
        instance.findDetalleVenta(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
}
