/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

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
public class FmrEstadoTest {
    
    public FmrEstadoTest() {
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
     * Test of listaEntidad method, of class FmrEstado.
     */
    @Test
    public void testListaEntidad() {
        System.out.println("listaEntidad");
        FmrEstado instance = new FmrEstado();
        instance.listaEntidad();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of IdEstado method, of class FmrEstado.
     */
    @Test
    public void testIdEstado() {
        System.out.println("IdEstado");
        int expResult = 5;
        int result = FmrEstado.IdEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrEstado.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "Factura pagada";
        boolean expResult = true;
        boolean result = FmrEstado.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of main method, of class FmrEstado.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrEstado.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
