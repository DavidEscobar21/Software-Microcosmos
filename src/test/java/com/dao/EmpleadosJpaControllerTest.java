/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Empleados;
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
public class EmpleadosJpaControllerTest {
    
    EmpleadosJpaController daoEmpleado = new EmpleadosJpaController();
    
    public EmpleadosJpaControllerTest() {
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
     * Test of getEntityManager method, of class EmpleadosJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        EmpleadosJpaController instance = new EmpleadosJpaController();
        try{
        instance.getEntityManager();
        
        }catch(Exception e){        
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of create method, of class EmpleadosJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Empleados objEmpleado = new Empleados();
        EmpleadosJpaController instance = new EmpleadosJpaController();
        
        objEmpleado.setIdEmpleados(8);
        objEmpleado.setNombreEmpleado("Andres");
        objEmpleado.setApellidoEmpleado("Figueroa");
        objEmpleado.setTelefonoEmpleado(22884477);
        objEmpleado.setCorreoEmpleado("Andres@gmail.com");
        objEmpleado.setIdTipoDocumento(2);
        objEmpleado.setDocumento("0801199912012");
        objEmpleado.setFechaDeNacimiento(Timestamp.valueOf("2000-10-20"+ " 00:00:00"));
        objEmpleado.setIdSexo(1);
        objEmpleado.setIdAreaLaboral(1);
        objEmpleado.setActivoEmpleado(true);
        
        try{
            
        instance.create(objEmpleado);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }

    }

    /**
     * Test of edit method, of class EmpleadosJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Empleados objEmpleado = new Empleados();
        EmpleadosJpaController instance = new EmpleadosJpaController();
        
        objEmpleado.setIdEmpleados(3);
        objEmpleado.setNombreEmpleado("Miriam");
        objEmpleado.setApellidoEmpleado("Santamaría");
        objEmpleado.setTelefonoEmpleado(22292827);
        objEmpleado.setCorreoEmpleado("Miriam@gmail.com");
        objEmpleado.setIdTipoDocumento(2);
        objEmpleado.setDocumento("0801196300088");
        objEmpleado.setFechaDeNacimiento(Timestamp.valueOf("1963-03-21"+ " 00:00:00"));
        objEmpleado.setIdSexo(2);
        objEmpleado.setIdAreaLaboral(2);
        objEmpleado.setActivoEmpleado(true);
        
        try{
            
        instance.edit(objEmpleado);
        
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
        
    }


    /**
     * Test of findEmpleados method, of class EmpleadosJpaController.
     */
    @Test
    public void testFindEmpleados() {
        System.out.println("findEmpleados");
        int id = 3;
        EmpleadosJpaController instance = new EmpleadosJpaController();
        
        try{
        instance.findEmpleados(id);
        }catch(Exception e){   
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
 
    }

    
}
