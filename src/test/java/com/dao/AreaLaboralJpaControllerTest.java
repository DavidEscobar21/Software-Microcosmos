/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.AreaLaboral;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class AreaLaboralJpaControllerTest {
    
    AreaLaboralJpaController daoAreaLaboral = new AreaLaboralJpaController(); 
    
    public AreaLaboralJpaControllerTest() {
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
     * Test of getEntityManager method, of class AreaLaboralJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        
        AreaLaboralJpaController instance =  new AreaLaboralJpaController();
        
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class AreaLaboralJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        AreaLaboral areaLaboral = new AreaLaboral();
        AreaLaboralJpaController instance = new AreaLaboralJpaController();
        
        areaLaboral.setIdAreaLaboral(7);
        areaLaboral.setNombreAreaLaboral("Finanzas");
        areaLaboral.setDescripcionAreaLaboral("Departamento encargado del area de finanzas");
        areaLaboral.setActivoAreaLaboral(true);
        
        try{
            
        instance.create(areaLaboral);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class AreaLaboralJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        AreaLaboral areaLaboral = new AreaLaboral();
        AreaLaboralJpaController instance = new AreaLaboralJpaController();
        
        areaLaboral.setIdAreaLaboral(4);
        areaLaboral.setNombreAreaLaboral("Servicios generales");
        areaLaboral.setDescripcionAreaLaboral("Se encarga de realizar las compras");
        areaLaboral.setActivoAreaLaboral(true);
       
        try{
            
        instance.edit(areaLaboral);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }



    /**
     * Test of findAreaLaboral method, of class AreaLaboralJpaController.
     */
    @Test
    public void testFindAreaLaboral() {
        System.out.println("findAreaLaboral");
        int id = 1;
        AreaLaboralJpaController instance = new AreaLaboralJpaController();
        
        try{
        instance.findAreaLaboral(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
