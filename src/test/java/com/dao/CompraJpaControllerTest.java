/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Compra;
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
public class CompraJpaControllerTest {
    
    CompraJpaController daoCompra = new CompraJpaController();
    
    public CompraJpaControllerTest() {
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
     * Test of getEntityManager method, of class CompraJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        CompraJpaController instance = new CompraJpaController();
        
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class CompraJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Compra objCompra = new Compra();
        CompraJpaController instance = new CompraJpaController();
        
            objCompra.setIdCompra(9);
            objCompra.setTotalCompra(500.00);
            objCompra.setFechaPedido(Timestamp.valueOf("2021-10-21"+ " 00:00:00"));
            objCompra.setFechaRecibido(Timestamp.valueOf("2021-10-22"+ " 00:00:00"));
            objCompra.setIdProveedor(5);
            objCompra.setIdEmpleados(1);
            objCompra.setIdEstado(2);
        
        try{
            
        instance.create(objCompra);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class CompraJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Compra objCompra = new Compra();
        CompraJpaController instance = new CompraJpaController();
        
            objCompra.setIdCompra(7);
            objCompra.setTotalCompra(150.00);
            objCompra.setFechaPedido(Timestamp.valueOf("2021-10-20"+ " 00:00:00"));
            objCompra.setFechaRecibido(Timestamp.valueOf("2021-10-21"+ " 00:00:00"));
            objCompra.setIdProveedor(5);
            objCompra.setIdEmpleados(1);
            objCompra.setIdEstado(2);
            
        try{
            
        instance.edit(objCompra);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findCompra method, of class CompraJpaController.
     */
    @Test
    public void testFindCompra() {
        System.out.println("findCompra");
        int id = 6;
        CompraJpaController instance = new CompraJpaController();
        
        try{
        instance.findCompra(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
}
