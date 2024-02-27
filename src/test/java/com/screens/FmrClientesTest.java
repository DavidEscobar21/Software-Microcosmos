/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Clientes;
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
public class FmrClientesTest {
    
    public FmrClientesTest() {
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
     * Test of listaTipoDocumento method, of class FmrClientes.
     */
    @Test
    public void testListaTipoDocumento() {
        System.out.println("listaTipoDocumento");
        FmrClientes instance = new FmrClientes();
        instance.listaTipoDocumento();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listaSexo method, of class FmrClientes.
     */
    @Test
    public void testListaSexo() {
        System.out.println("listaSexo");
        FmrClientes instance = new FmrClientes();
        instance.listaSexo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionMail method, of class FmrClientes.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "David@gmail.com";
        boolean expResult = true;
        boolean result = FmrClientes.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDNI method, of class FmrClientes.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "0801199912080";
        boolean expResult = true;
        boolean result = FmrClientes.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionRTN method, of class FmrClientes.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "08011999120801";
        boolean expResult = true;
        boolean result = FmrClientes.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdClientes method, of class FmrClientes.
     */
    @Test
    public void testIdClientes() {
        System.out.println("IdClientes");
        int expResult = 8;
        int result = FmrClientes.IdClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarPersonas method, of class FmrClientes.
     */
    @Test
    public void testBuscarPersonas() {
        System.out.println("buscarPersonas");
        String Nombres = "Andrew";
        FmrClientes instance = new FmrClientes();
        List<Clientes> result = instance.buscarPersonas(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDocumento method, of class FmrClientes.
     */
    @Test
    public void testValidacionDocumento() {
        System.out.println("ValidacionDocumento");
        String Documento = "0801199912080";
        boolean expResult = true;
        boolean result = FmrClientes.ValidacionDocumento(Documento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of main method, of class FmrClientes.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrClientes.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
