/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Articulo;
import java.util.ArrayList;
import java.util.List;
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
public class FmrArticulosTest {
    
    public FmrArticulosTest() {
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
     * Test of IdArticulo method, of class FmrArticulos.
     */
    @Test
    public void testIdArticulo() {
        System.out.println("IdArticulo");
        int expResult = 15;
        int result = FmrArticulos.IdArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of listaTalla method, of class FmrArticulos.
     */
    
    @Test
    public void testListaSeccionTienda() {
        System.out.println("listaSeccionTienda");
        FmrArticulos instance = new FmrArticulos();
        instance.listaSeccionTienda();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testListaTalla() {
        System.out.println("listaTalla");
        FmrArticulos instance = new FmrArticulos();
        instance.listaTalla();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**


    /**
     * Test of ValidacionDecimales method, of class FmrArticulos.
     */
    @Test
    public void testValidacionDecimales() {
        System.out.println("ValidacionDecimales");
        String Decimal = "10.00";
        boolean expResult = true;
        boolean result = FmrArticulos.ValidacionDecimales(Decimal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrArticulos.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "Blusa";
        boolean expResult = true;
        boolean result = FmrArticulos.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarArticulo method, of class FmrArticulos.
     */
    @Test
    public void testBuscarArticulo() {
        System.out.println("buscarArticulo");
        String Nombres = "Faja";
        FmrArticulos instance = new FmrArticulos();
        List<Articulo> expResult = new ArrayList<Articulo>();
        List<Articulo> result = instance.buscarArticulo(Nombres);
        //assertEquals(expResult, result);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of main method, of class FmrArticulos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrArticulos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
