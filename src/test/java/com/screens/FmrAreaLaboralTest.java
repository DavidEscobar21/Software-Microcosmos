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
public class FmrAreaLaboralTest {
    
    public FmrAreaLaboralTest() {
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
     * Test of IdAreaLaboral method, of class FmrAreaLaboral.
     */
    @org.junit.Test
    public void testIdAreaLaboral() {
        System.out.println("IdAreaLaboral");
        int expResult = 3;
        int result = FmrAreaLaboral.IdAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrAreaLaboral.
     */
    @org.junit.Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "Gerente general";
        boolean expResult = true;
        boolean result = FmrAreaLaboral.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of main method, of class FmrAreaLaboral.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrAreaLaboral.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
