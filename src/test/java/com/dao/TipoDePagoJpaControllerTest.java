/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.TipoDePago;
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
public class TipoDePagoJpaControllerTest {
    
    TipoDePagoJpaController daoTipoDePago = new TipoDePagoJpaController();  
    
    public TipoDePagoJpaControllerTest() {
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
     * Test of getEntityManager method, of class TipoDePagoJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        TipoDePagoJpaController instance = new TipoDePagoJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class TipoDePagoJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        TipoDePago objTipoDePago = new TipoDePago();
        TipoDePagoJpaController instance = new TipoDePagoJpaController();
       
           objTipoDePago.setIdTipoDePago(5);
           objTipoDePago.setNombreTipoDePago("Remesa");
           objTipoDePago.setDescripcionTipoDePago("Dinero del extranjero");
           objTipoDePago.setActivoTipoDePago(true);
        
        try{
            
        instance.create(objTipoDePago);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class TipoDePagoJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        TipoDePago objTipoDePago = new TipoDePago();
        TipoDePagoJpaController instance = new TipoDePagoJpaController();
        
           objTipoDePago.setIdTipoDePago(3);
           objTipoDePago.setNombreTipoDePago("Mixto");
           objTipoDePago.setDescripcionTipoDePago("Efectivo y Tarjeta de credito");
           objTipoDePago.setActivoTipoDePago(true);
           
        try{
            
        instance.edit(objTipoDePago);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findTipoDePago method, of class TipoDePagoJpaController.
     */
    @Test
    public void testFindTipoDePago() {
        System.out.println("findTipoDePago");
        int id = 1;
        TipoDePagoJpaController instance = new TipoDePagoJpaController();

        try{
        instance.findTipoDePago(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
