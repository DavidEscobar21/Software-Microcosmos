/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Articulo;
import com.clases.Proveedores;
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
public class FmrComprasTest {
    
    public FmrComprasTest() {
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
     * Test of main method, of class FmrCompras.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrCompras.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProveedor method, of class FmrCompras.
     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        String Nombres = "Mendels";
        FmrCompras instance = new FmrCompras();
        List<Proveedores> expResult = null;
        List<Proveedores> result = instance.buscarProveedor(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarDocumento method, of class FmrCompras.
     */
    @Test
    public void testBuscarDocumento() {
        System.out.println("buscarDocumento");
        String Nombres = "12345678901234";
        FmrCompras instance = new FmrCompras();
        List<Proveedores> expResult = null;
        List<Proveedores> result = instance.buscarDocumento(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarArticulo method, of class FmrCompras.
     */
    @Test
    public void testBuscarArticulo() {
        System.out.println("buscarArticulo");
        String Nombres = "Faja";
        FmrCompras instance = new FmrCompras();
        List<Articulo> expResult = null;
        List<Articulo> result = instance.buscarArticulo(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarIdArticulo method, of class FmrCompras.
     */
    @Test
    public void testBuscarIdArticulo() {
        System.out.println("buscarIdArticulo");
        String ID = "7";
        FmrCompras instance = new FmrCompras();
        List<Articulo> expResult = null;
        List<Articulo> result = instance.buscarIdArticulo(ID);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDecimales method, of class FmrCompras.
     */
    @Test
    public void testValidacionDecimales() {
        System.out.println("ValidacionDecimales");
        String Decimal = "10.00";
        boolean expResult = true;
        boolean result = FmrCompras.ValidacionDecimales(Decimal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdCompra method, of class FmrCompras.
     */
    @Test
    public void testIdCompra() {
        System.out.println("IdCompra");
        int expResult = 8;
        int result = FmrCompras.IdCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdDetalleCompra method, of class FmrCompras.
     */
    @Test
    public void testIdDetalleCompra() {
        System.out.println("IdDetalleCompra");
        int expResult = 13;
        int result = FmrCompras.IdDetalleCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GuardarFecha method, of class FmrCompras.
     */
    @Test
    public void testGuardarFecha() {
        System.out.println("GuardarFecha");
        String f = "21/03/2021";
        String expResult = "2021-03-21";
        String result = FmrCompras.GuardarFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionFecha method, of class FmrCompras.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("ValidacionFecha");
        String Nombre = "21/03/2021";
        boolean expResult = true;
        boolean result = FmrCompras.ValidacionFecha(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of Fechavalida method, of class FmrCompras.
     */
    @Test
    public void testFechavalida() {
        System.out.println("Fechavalida");
        String date = "21/03/2021";
        boolean expResult = true;
        boolean result = FmrCompras.Fechavalida(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
    
}
