/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.SeccionTienda;
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
public class SeccionTiendaJpaControllerTest {
    
    SeccionTiendaJpaController daoSeccionTienda = new SeccionTiendaJpaController();
    
    public SeccionTiendaJpaControllerTest() {
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
     * Test of getEntityManager method, of class SeccionTiendaJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        SeccionTiendaJpaController instance = new SeccionTiendaJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class SeccionTiendaJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        SeccionTienda objSeccionTienda = new SeccionTienda();
        SeccionTiendaJpaController instance = new SeccionTiendaJpaController();
        
        objSeccionTienda.setIdSeccionTienda(3);
        objSeccionTienda.setNombreSeccionTienda("Zona Oeste");
        objSeccionTienda.setDescripcionSeccionTienda("la parte oeste de la tienda");
        objSeccionTienda.setActivoSeccionTienda(true);
       
        try{
            
        instance.create(objSeccionTienda);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class SeccionTiendaJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        SeccionTienda objSeccionTienda = new SeccionTienda();
        SeccionTiendaJpaController instance = new SeccionTiendaJpaController();
        
        objSeccionTienda.setIdSeccionTienda(1);
        objSeccionTienda.setNombreSeccionTienda("Zona sur");
        objSeccionTienda.setDescripcionSeccionTienda("la parte sur del mall");
        objSeccionTienda.setActivoSeccionTienda(true);
       
        try{
            
        instance.edit(objSeccionTienda);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of findSeccionTienda method, of class SeccionTiendaJpaController.
     */
    @Test
    public void testFindSeccionTienda() {
        System.out.println("findSeccionTienda");
        int id = 1;
        SeccionTiendaJpaController instance = new SeccionTiendaJpaController();
        
        try{
        instance.findSeccionTienda(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
}
