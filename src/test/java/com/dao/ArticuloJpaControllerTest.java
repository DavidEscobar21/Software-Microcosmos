/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Articulo;
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
public class ArticuloJpaControllerTest {
    
    ArticuloJpaController daoArticulo = new ArticuloJpaController();
    
    public ArticuloJpaControllerTest() {
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
     * Test of getEntityManager method, of class ArticuloJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ArticuloJpaController instance = new ArticuloJpaController();

        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class ArticuloJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Articulo objArticulo = new Articulo();
        ArticuloJpaController instance = new ArticuloJpaController();
        
            objArticulo.setIdArticulo(17);
            objArticulo.setNombreArticulo("Pijama");
            objArticulo.setPrecioArticulo(150.00);
            objArticulo.setDescripcionArticulo("pijama color gris");
            objArticulo.setIdTalla(1);
            objArticulo.setStock(0);
            objArticulo.setStockMinimo(1);
            objArticulo.setStockMaximo(20);
            objArticulo.setIdSeccionTienda(1); 
            objArticulo.setActivoArticulo(true);
        
        
        try{
            
        instance.create(objArticulo);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class ArticuloJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Articulo objArticulo = new Articulo();
        ArticuloJpaController instance = new ArticuloJpaController();
        
            objArticulo.setIdArticulo(15);
            objArticulo.setNombreArticulo("Lentes");
            objArticulo.setPrecioArticulo(200.00);
            objArticulo.setDescripcionArticulo("Lentes color negro");
            objArticulo.setIdTalla(1);
            objArticulo.setStock(0);
            objArticulo.setStockMinimo(1);
            objArticulo.setStockMaximo(20);
            objArticulo.setIdSeccionTienda(1); 
            objArticulo.setActivoArticulo(true);
            
        try{
            
        instance.edit(objArticulo);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findArticulo method, of class ArticuloJpaController.
     */
    @Test
    public void testFindArticulo() {
        System.out.println("findArticulo");
        int id = 4;
        ArticuloJpaController instance = new ArticuloJpaController();
       
        try{
        instance.findArticulo(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
