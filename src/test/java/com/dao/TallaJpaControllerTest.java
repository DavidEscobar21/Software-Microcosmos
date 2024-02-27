/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Talla;
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
public class TallaJpaControllerTest {
    
    TallaJpaController daoTalla = new TallaJpaController();
    
    public TallaJpaControllerTest() {
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
     * Test of getEntityManager method, of class TallaJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        TallaJpaController instance = new TallaJpaController();
       
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class TallaJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Talla objTalla = new Talla();
        TallaJpaController instance = new TallaJpaController();

           objTalla.setIdTalla(18);
           objTalla.setNombreTalla("Mediana");
           objTalla.setDescripcionTalla("Talla Mediana para adulto");
           objTalla.setActivoTalla(true);      
        
        try{
            
        instance.create(objTalla);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class TallaJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Talla objTalla = new Talla();
        TallaJpaController instance = new TallaJpaController();

           objTalla.setIdTalla(7);
           objTalla.setNombreTalla("Grande");
           objTalla.setDescripcionTalla("Talla grande para niños");
           objTalla.setActivoTalla(true);
       
        try{
            
        instance.edit(objTalla);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of findTalla method, of class TallaJpaController.
     */
    @Test
    public void testFindTalla() {
        System.out.println("findTalla");
        int id = 1;
        TallaJpaController instance = new TallaJpaController();
       
        try{
        instance.findTalla(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


}
