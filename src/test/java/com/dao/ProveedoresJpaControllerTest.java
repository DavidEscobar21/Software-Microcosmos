/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Proveedores;
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
public class ProveedoresJpaControllerTest {
    
    ProveedoresJpaController daoProveedores = new ProveedoresJpaController();
    
    public ProveedoresJpaControllerTest() {
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
     * Test of getEntityManager method, of class ProveedoresJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ProveedoresJpaController instance = new ProveedoresJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class ProveedoresJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Proveedores objProveedores = new Proveedores();
        ProveedoresJpaController instance = new ProveedoresJpaController();
        
        objProveedores.setIdProveedor(7);
        objProveedores.setNombreProveedor("Charly");
        objProveedores.setTelefonoProveedor(22995088);
        objProveedores.setCorreoProveedor("Charly@gmail.com");
        objProveedores.setUbicacionProveedor("Las casitas");
        objProveedores.setIdTipoDocumento(1);
        objProveedores.setDocumento("08011999234571");
        objProveedores.setActivoProveedor(true);
        
        try{
            
        instance.create(objProveedores);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class ProveedoresJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Proveedores objProveedores = new Proveedores();
        ProveedoresJpaController instance = new ProveedoresJpaController();
        
        objProveedores.setIdProveedor(4);
        objProveedores.setNombreProveedor("Carrion");
        objProveedores.setTelefonoProveedor(22274821);
        objProveedores.setCorreoProveedor("Carrion@gmail.com");
        objProveedores.setUbicacionProveedor("Las lomas");
        objProveedores.setIdTipoDocumento(1);
        objProveedores.setDocumento("12345678912347");
        objProveedores.setActivoProveedor(true);
        
        try{
            
        instance.edit(objProveedores);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of findProveedores method, of class ProveedoresJpaController.
     */
    @Test
    public void testFindProveedores() {
        System.out.println("findProveedores");
        int id = 5;
        ProveedoresJpaController instance = new ProveedoresJpaController();
       
        try{
        instance.findProveedores(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
        
    }


}
