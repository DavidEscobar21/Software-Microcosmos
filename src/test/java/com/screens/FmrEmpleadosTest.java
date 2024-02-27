/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Empleados;
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
public class FmrEmpleadosTest {
    
    public FmrEmpleadosTest() {
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
     * Test of Fechavalida method, of class FmrEmpleados.
     */
    @Test
    public void testFechavalida() {
        System.out.println("Fechavalida");
        String date = "21/03/2021";
        boolean expResult = true;
        boolean result = FmrEmpleados.Fechavalida(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdEmpleado method, of class FmrEmpleados.
     */
    @Test
    public void testIdEmpleado() {
        System.out.println("IdEmpleado");
        int expResult = 7;
        int result = FmrEmpleados.IdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of listaTipoDocumento method, of class FmrEmpleados.
     */
    @Test
    public void testListaTipoDocumento() {
        System.out.println("listaTipoDocumento");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaTipoDocumento();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listaSexo method, of class FmrEmpleados.
     */
    @Test
    public void testListaSexo() {
        System.out.println("listaSexo");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaSexo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listaAreaLaboral method, of class FmrEmpleados.
     */
    @Test
    public void testListaAreaLaboral() {
        System.out.println("listaAreaLaboral");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaAreaLaboral();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionFecha method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("ValidacionFecha");
        String Nombre = "21/03/2021";
        boolean expResult = true;
        boolean result = FmrEmpleados.ValidacionFecha(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

 
    /**
     * Test of ValidacionDNI method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "0801199912080";
        boolean expResult = true;
        boolean result = FmrEmpleados.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionRTN method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "08011999120801";
        boolean expResult = true;
        boolean result = FmrEmpleados.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionMail method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "David@gmail.com";
        boolean expResult = true;
        boolean result = FmrEmpleados.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GuardarFecha method, of class FmrEmpleados.
     */
    @Test
    public void testGuardarFecha() {
        System.out.println("GuardarFecha");
        String f = "21/03/2021";
        String expResult = "2021-03-21";
        String result = FmrEmpleados.GuardarFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of MostrarFecha method, of class FmrEmpleados.
     */
    @Test
    public void testMostrarFecha() {
        System.out.println("MostrarFecha");
        String f = "2021-03-21";
        String expResult = "21/03/2021";
        String result = FmrEmpleados.MostrarFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarPersonas method, of class FmrEmpleados.
     */
    @Test
    public void testBuscarPersonas() {
        System.out.println("buscarPersonas");
        String Nombres = "Dianne";
        FmrEmpleados instance = new FmrEmpleados();
        List<Empleados> expResult = null;
        List<Empleados> result = instance.buscarPersonas(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarApellido method, of class FmrEmpleados.
     */
    @Test
    public void testBuscarApellido() {
        System.out.println("buscarApellido");
        String Nombres = "Escobar";
        FmrEmpleados instance = new FmrEmpleados();
        List<Empleados> expResult = null;
        List<Empleados> result = instance.buscarApellido(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDocumento method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionDocumento() {
        System.out.println("ValidacionDocumento");
        String Documento = "1234567899127";
        boolean expResult = true;
        boolean result = FmrEmpleados.ValidacionDocumento(Documento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of main method, of class FmrEmpleados.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrEmpleados.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
