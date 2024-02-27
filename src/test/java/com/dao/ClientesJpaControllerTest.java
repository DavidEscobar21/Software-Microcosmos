/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Clientes;
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
public class ClientesJpaControllerTest {
    
    ClientesJpaController daoClientes = new ClientesJpaController();
    
    public ClientesJpaControllerTest() {
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
     * Test of getEntityManager method, of class ClientesJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ClientesJpaController instance = new ClientesJpaController();
        
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class ClientesJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Clientes objCliente = new Clientes();
        ClientesJpaController instance = new ClientesJpaController();
        
            objCliente.setIdCliente(10);
            objCliente.setNombreCliente("Darsy");
            objCliente.setApellidoCliente("Romaña");
            objCliente.setTelefonoCliente(22275896);
            objCliente.setDireccionCliente("El aeropuerto");
            objCliente.setCorreoCliente("Darsy@gmail.com");
            objCliente.setIdTipoDocumento(2);
            objCliente.setDocumento("0801199923455");
            objCliente.setIdSexo(2);
            objCliente.setActivoCliente(true);
        
        try{
            
         instance.create(objCliente);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of edit method, of class ClientesJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Clientes objCliente = new Clientes();
        ClientesJpaController instance = new ClientesJpaController();
        
            objCliente.setIdCliente(8);
            objCliente.setNombreCliente("Carlos");
            objCliente.setApellidoCliente("Gonzales");
            objCliente.setTelefonoCliente(22275890);
            objCliente.setDireccionCliente("EL hato");
            objCliente.setCorreoCliente("Carlos@gmail.com");
            objCliente.setIdTipoDocumento(2);
            objCliente.setDocumento("0801199923456");
            objCliente.setIdSexo(1);
            objCliente.setActivoCliente(true);
            
        try{
            
         instance.edit(objCliente);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
    }


    /**
     * Test of findClientes method, of class ClientesJpaController.
     */
    @Test
    public void testFindClientes() {
        System.out.println("findClientes");
        int id = 4;
        ClientesJpaController instance = new ClientesJpaController();
        try{
        instance.findClientes(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }

        
    }


    
}
