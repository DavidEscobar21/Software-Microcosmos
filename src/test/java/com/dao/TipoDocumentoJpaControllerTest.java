/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.TipoDocumento;
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
public class TipoDocumentoJpaControllerTest {
    
    TipoDocumentoJpaController daoTipoDocumento = new TipoDocumentoJpaController();
    
    public TipoDocumentoJpaControllerTest() {
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
     * Test of getEntityManager method, of class TipoDocumentoJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        TipoDocumentoJpaController instance = new TipoDocumentoJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class TipoDocumentoJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        TipoDocumento objTipoDocumento = new TipoDocumento();
        TipoDocumentoJpaController instance = new TipoDocumentoJpaController();
        
           objTipoDocumento.setIdTipoDocumento(11);
           objTipoDocumento.setNombreTipoDocumento("Escritura");
           objTipoDocumento.setDescripcionTipoDocumento("Documento legal de una empresa");
           objTipoDocumento.setActivoTipoDocumento(true);
        
        try{
            
        instance.create(objTipoDocumento);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class TipoDocumentoJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        TipoDocumento objTipoDocumento = new TipoDocumento();
        TipoDocumentoJpaController instance = new TipoDocumentoJpaController();
        
           objTipoDocumento.setIdTipoDocumento(1);
           objTipoDocumento.setNombreTipoDocumento("RTN");
           objTipoDocumento.setDescripcionTipoDocumento("Documento legal de Honduras");
           objTipoDocumento.setActivoTipoDocumento(true);
        
        try{
            
        instance.edit(objTipoDocumento);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    /**
     * Test of findTipoDocumento method, of class TipoDocumentoJpaController.
     */
    @Test
    public void testFindTipoDocumento() {
        System.out.println("findTipoDocumento");
        int id = 1;
        TipoDocumentoJpaController instance = new TipoDocumentoJpaController();

        try{
        instance.findTipoDocumento(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
