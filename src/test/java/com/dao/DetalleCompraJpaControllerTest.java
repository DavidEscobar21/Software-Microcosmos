/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.DetalleCompra;
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
public class DetalleCompraJpaControllerTest {
    
    DetalleCompraJpaController daoDetalleCompra = new DetalleCompraJpaController();  
    
    public DetalleCompraJpaControllerTest() {
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
     * Test of getEntityManager method, of class DetalleCompraJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        DetalleCompraJpaController instance = new DetalleCompraJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class DetalleCompraJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        DetalleCompra objDetalleCompra = new DetalleCompra();
        DetalleCompraJpaController instance = new DetalleCompraJpaController();
        
        objDetalleCompra.setIdDetalleCompra(14);
        objDetalleCompra.setCantidad(5);
        objDetalleCompra.setIdCompra(8);
        objDetalleCompra.setIdArticulo(7);
        objDetalleCompra.setPrecioCompra(100.00); 
        
        try{
            
        instance.create(objDetalleCompra);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class DetalleCompraJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        DetalleCompra objDetalleCompra = new DetalleCompra();
        DetalleCompraJpaController instance = new DetalleCompraJpaController();
        
        objDetalleCompra.setIdDetalleCompra(2);
        objDetalleCompra.setCantidad(2);
        objDetalleCompra.setIdCompra(1);
        objDetalleCompra.setIdArticulo(4);
        objDetalleCompra.setPrecioCompra(250.00); 
        
        try{
            
        instance.edit(objDetalleCompra);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

   
    /**
     * Test of findDetalleCompra method, of class DetalleCompraJpaController.
     */
    @Test
    public void testFindDetalleCompra() {
        System.out.println("findDetalleCompra");
        int id = 3;
        DetalleCompraJpaController instance = new DetalleCompraJpaController();
       
        try{
        instance.findDetalleCompra(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
