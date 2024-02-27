/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Parametros;
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
public class ParametrosJpaControllerTest {
    
    ParametrosJpaController daoParametros = new ParametrosJpaController();
    
    public ParametrosJpaControllerTest() {
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
     * Test of getEntityManager method, of class ParametrosJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ParametrosJpaController instance = new ParametrosJpaController();
        
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class ParametrosJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Parametros objParametros = new Parametros();
        ParametrosJpaController instance = new ParametrosJpaController();
        
       objParametros.setIdParametros(8);
       objParametros.setCai("94ACF2-AB342A-AC49B3-EC2AB3-5FA281-59");
       objParametros.setFacturaInicial(1);
       objParametros.setFacturaFinal(100);
       objParametros.setFechaEmision(Timestamp.valueOf("2021-10-20"+ " 00:00:00"));
       objParametros.setFechaCaducidad(Timestamp.valueOf("2022-10-20"+ " 00:00:00"));
       objParametros.setActivoParametros(true);
        
        try{
            
        instance.create(objParametros);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class ParametrosJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Parametros objParametros = new Parametros();
        ParametrosJpaController instance = new ParametrosJpaController();
        
       objParametros.setIdParametros(6);
       objParametros.setCai("94ACF2-AB342A-AC49B3-EC2AB3-5FA281-13");
       objParametros.setFacturaInicial(50);
       objParametros.setFacturaFinal(100);
       objParametros.setFechaEmision(Timestamp.valueOf("2021-10-14"+ " 00:00:00"));
       objParametros.setFechaCaducidad(Timestamp.valueOf("2022-10-14"+ " 00:00:00"));
       objParametros.setActivoParametros(true);
       
        
        try{
            
        instance.edit(objParametros);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findParametros method, of class ParametrosJpaController.
     */
    @Test
    public void testFindParametros() {
        System.out.println("findParametros");
        int id = 1;
        ParametrosJpaController instance = new ParametrosJpaController();
       
        try{
        instance.findParametros(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


}
