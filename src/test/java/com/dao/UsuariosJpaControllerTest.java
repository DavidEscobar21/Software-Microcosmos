/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Usuarios;
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
public class UsuariosJpaControllerTest {
    
    UsuariosJpaController daoUsuario = new UsuariosJpaController();
    
    public UsuariosJpaControllerTest() {
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
     * Test of getEntityManager method, of class UsuariosJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        UsuariosJpaController instance = new UsuariosJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class UsuariosJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Usuarios objUsuario = new Usuarios();
        UsuariosJpaController instance = new UsuariosJpaController();

            objUsuario.setIdUsuario(8);
            objUsuario.setNombreUsuario("CarlosMauricio");
            objUsuario.setContrasena("hBZ9RkfUz3T2Z4VSwQKbcQ==");
            objUsuario.setNumeroDeIntentos(0);
            objUsuario.setAdmin(false);
            objUsuario.setIdEmpleados(5);
            objUsuario.setActivoUsuario(true); 
            
        try{
            
        instance.create(objUsuario);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class UsuariosJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Usuarios objUsuario = new Usuarios();
        UsuariosJpaController instance = new UsuariosJpaController();
        
            objUsuario.setIdUsuario(6);
            objUsuario.setNombreUsuario("CarlosEnrique");
            objUsuario.setContrasena("hBZ9RkfUz3T2Z4VSwQKbcQ==");
            objUsuario.setNumeroDeIntentos(0);
            objUsuario.setAdmin(false);
            objUsuario.setIdEmpleados(7);
            objUsuario.setActivoUsuario(true); 
            
        try{
            
        instance.edit(objUsuario);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    
    /**
     * Test of findUsuarios method, of class UsuariosJpaController.
     */
    @Test
    public void testFindUsuarios() {
        System.out.println("findUsuarios");
        int id = 2;
        UsuariosJpaController instance = new UsuariosJpaController();

        try{
        instance.findUsuarios(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    
}
