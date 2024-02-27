/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import javax.crypto.spec.SecretKeySpec;
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
public class FmrLoginTest {
    
    public FmrLoginTest() {
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
     * Test of ValidarAccesoAdmin method, of class FmrLogin.
     */
    @Test
    public void testValidarAccesoAdmin() {
        System.out.println("ValidarAccesoAdmin");
        String Usuario = "";
        String Contraseña = "";
        FmrLogin instance = new FmrLogin();
        instance.ValidarAccesoAdmin(Usuario, Contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidarAcceso method, of class FmrLogin.
     */
    @Test
    public void testValidarAcceso() {
        System.out.println("ValidarAcceso");
        String Usuario = "";
        String Contraseña = "";
        FmrLogin instance = new FmrLogin();
        instance.ValidarAcceso(Usuario, Contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DesactivarUsuario method, of class FmrLogin.
     */
    @Test
    public void testDesactivarUsuario() {
        System.out.println("DesactivarUsuario");
        String Usuario = "";
        FmrLogin instance = new FmrLogin();
        instance.DesactivarUsuario(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class FmrLogin.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        FmrLogin instance = new FmrLogin();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Resetear method, of class FmrLogin.
     */
    @Test
    public void testResetear() {
        System.out.println("Resetear");
        String Usuario = "";
        FmrLogin instance = new FmrLogin();
        instance.Resetear(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetearTodo method, of class FmrLogin.
     */
    @Test
    public void testResetearTodo() {
        System.out.println("ResetearTodo");
        FmrLogin instance = new FmrLogin();
        instance.ResetearTodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearClave method, of class FmrLogin.
     */
    @Test
    public void testCrearClave() {
        System.out.println("CrearClave");
        String llave = "";
        SecretKeySpec expResult = null;
        SecretKeySpec result = FmrLogin.CrearClave(llave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Encriptar method, of class FmrLogin.
     */
    @Test
    public void testEncriptar() {
        System.out.println("Encriptar");
        String contraseña = "";
        String expResult = "";
        String result = FmrLogin.Encriptar(contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrLogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DesactivarFecha method, of class FmrLogin.
     */
    @Test
    public void testDesactivarFecha() {
        System.out.println("DesactivarFecha");
        FmrLogin instance = new FmrLogin();
        instance.DesactivarFecha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
