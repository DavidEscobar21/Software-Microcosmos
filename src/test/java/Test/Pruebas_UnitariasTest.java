/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.clases.Articulo;
import com.clases.Clientes;
import com.clases.Empleados;
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
public class Pruebas_UnitariasTest {
    
    public Pruebas_UnitariasTest() {
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
     * Test of verificarCaracteresRepetidos method, of class Pruebas_Unitarias.
     */
    @Test
    public void testVerificarCaracteresRepetidos() {
        System.out.println("verificarCaracteresRepetidos");
        String cadena = "aaasssddd";
        boolean expResult = false;
        boolean result = Pruebas_Unitarias.verificarCaracteresRepetidos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionContraseña method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionContraseña() {
        System.out.println("ValidacionContrase\u00f1a");
        String contraseña = "D@vid123";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionContraseña(contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GuardarFecha method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGuardarFecha() {
        System.out.println("GuardarFecha");
        String f = "21/03/2021";
        String expResult = "2021-03-21";
        String result = Pruebas_Unitarias.GuardarFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of MostrarFecha method, of class Pruebas_Unitarias.
     */
    @Test
    public void testMostrarFecha() {
        System.out.println("MostrarFecha");
        String f = "2021-03-21";
        String expResult = "21/03/2021";
        String result = Pruebas_Unitarias.MostrarFecha(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionFecha method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("ValidacionFecha");
        String Nombre = "21/03/2021";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionFecha(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of Fechavalida method, of class Pruebas_Unitarias.
     */
    @Test
    public void testFechavalida() {
        System.out.println("Fechavalida");
        String date = "21/03/2021";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.Fechavalida(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionCAI method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionCAI() {
        System.out.println("ValidacionCAI");
        String CAI = "94ACF2-AB342A-AC49B3-EC2AB3-5FA281-67";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionCAI(CAI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionMail method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "David@gmail.com";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDNI method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "0801199912090";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionRTN method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "08011999120901";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDecimales method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionDecimales() {
        System.out.println("ValidacionDecimales");
        String Decimal = "11.11";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionDecimales(Decimal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdAreaLaboral method, of class Pruebas_Unitarias.
     */
    @Test
    public void testIdAreaLaboral() {
        System.out.println("IdAreaLaboral");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of ValidacionDeRepetidosAreaLaboral method, of class Pruebas_Unitarias.
     */
    @Test
    public void testValidacionDeRepetidosAreaLaboral() {
        System.out.println("ValidacionDeRepetidosAreaLaboral");
        String Nombre = "Gerente general";
        boolean expResult = true;
        boolean result = Pruebas_Unitarias.ValidacionDeRepetidosAreaLaboral(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }



    /**
     * Test of EditarAreaLaboral method, of class Pruebas_Unitarias.
     */
    @Test
    public void testEditarAreaLaboral() {
        System.out.println("EditarAreaLaboral");
        int id = 3;
        String nombre = "Departamento tecnico";
        String Descripcion = "Es el area donde están todos los ingenieros";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        boolean expResult = true;
        boolean result = instance.EditarAreaLaboral(id, nombre, Descripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetNombreTalla method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetNombreTalla() {
        System.out.println("GetNombreTalla");
        int id = 1;
        String expResult = "S";
        String result = Pruebas_Unitarias.GetNombreTalla(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetIdTalla method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetIdTalla() {
        System.out.println("GetIdTalla");
        String Nombre = "S";
        int expResult = 1;
        int result = Pruebas_Unitarias.GetIdTalla(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetNombreSeccionTienda method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetNombreSeccionTienda() {
        System.out.println("GetNombreSeccionTienda");
        int id = 1;
        String expResult = "Zona sur";
        String result = Pruebas_Unitarias.GetNombreSeccionTienda(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetIdSeccionTienda method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetIdSeccionTienda() {
        System.out.println("GetIdSeccionTienda");
        String Nombre = "Zona sur";
        int expResult = 1;
        int result = Pruebas_Unitarias.GetIdSeccionTienda(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdArticulo method, of class Pruebas_Unitarias.
     */
    @Test
    public void testIdArticulo() {
        System.out.println("IdArticulo");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarArticulo method, of class Pruebas_Unitarias.
     */
    @Test
    public void testBuscarArticulo() {
        System.out.println("buscarArticulo");
        String Nombres = "Blusa";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        List<Articulo> result = instance.buscarArticulo(Nombres);
        assertTrue("", result.size() > 0);
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetNombreTipoDocumento method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetNombreTipoDocumento() {
        System.out.println("GetNombreTipoDocumento");
        int id = 1;
        String expResult = "RTN";
        String result = Pruebas_Unitarias.GetNombreTipoDocumento(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetIdTipoDocumento method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetIdTipoDocumento() {
        System.out.println("GetIdTipoDocumento");
        String Nombre = "RTN";
        int expResult = 1;
        int result = Pruebas_Unitarias.GetIdTipoDocumento(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetNombreSexo method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetNombreSexo() {
        System.out.println("GetNombreSexo");
        int id = 1;
        String expResult = "Hombre";
        String result = Pruebas_Unitarias.GetNombreSexo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of GetIdSexo method, of class Pruebas_Unitarias.
     */
    @Test
    public void testGetIdSexo() {
        System.out.println("GetIdSexo");
        String Nombre = "Hombre";
        int expResult = 1;
        int result = Pruebas_Unitarias.GetIdSexo(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of IdClientes method, of class Pruebas_Unitarias.
     */
    @Test
    public void testIdClientes() {
        System.out.println("IdClientes");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }

    /**
     * Test of buscarPersonas method, of class Pruebas_Unitarias.
     */
    @Test
    public void testBuscarPersonas() {
        System.out.println("buscarPersonas");
        String Nombres = "Lulu";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        List<Clientes> result = instance.buscarPersonas(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }

  
//    /**
//     * Test of buscarProveedor method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        String Nombres = "Mendels";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        List<Proveedores> result = instance.buscarProveedor(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of buscarDocumento method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testBuscarDocumento() {
        System.out.println("buscarDocumento");
        String Nombres = "12345678998750";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        List<Proveedores> result = instance.buscarDocumento(Nombres);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of GetNombreProveedor method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testGetNombreProveedor() {
        System.out.println("GetNombreProveedor");
        String RTN = "12345678901234";
        String expResult = "Mendels";
        String result = Pruebas_Unitarias.GetNombreProveedor(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of buscarIdArticulo method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testBuscarIdArticulo() {
        System.out.println("buscarIdArticulo");
        String ID = "4";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        List<Articulo> result = instance.buscarIdArticulo(ID);
        assertTrue("", result.size() > 0);
        
        // TODO review the generated test code and remove the default call to fail.
        if(result.size() == 0){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdDetalleCompra method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdDetalleCompra() {
        System.out.println("IdDetalleCompra");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdDetalleCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdCompra method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdCompra() {
        System.out.println("IdCompra");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdEmpleado method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdEmpleado() {
        System.out.println("IdEmpleado");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of GetNombreAreaLaboral method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testGetNombreAreaLaboral() {
        System.out.println("GetNombreAreaLaboral");
        int id = 2;
        String expResult = "Gerente general";
        String result = Pruebas_Unitarias.GetNombreAreaLaboral(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(expResult.equals(result))){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of GetIdAreaLaboral method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testGetIdAreaLaboral() {
        System.out.println("GetIdAreaLaboral");
        String Nombre = "Gerente general";
        int expResult = 2;
        int result = Pruebas_Unitarias.GetIdAreaLaboral(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdEstado method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdEstado() {
        System.out.println("IdEstado");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of ValidarAcceso method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testValidarAcceso() {
        System.out.println("ValidarAcceso");
        String Usuario = "Descobar";
        String Contraseña = "hBZ9RkfUz3T2Z4VSwQKbcQ==";
        Pruebas_Unitarias instance = new Pruebas_Unitarias();
        boolean expResult = true;
        boolean result = instance.ValidarAcceso(Usuario, Contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdParametro method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdParametro() {
        System.out.println("IdParametro");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdParametro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdProveedores method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdProveedores() {
        System.out.println("IdProveedores");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdProveedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdSeccionTienda method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdSeccionTienda() {
        System.out.println("IdSeccionTienda");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdSeccionTienda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdTalla method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdTalla() {
        System.out.println("IdTalla");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdTalla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdTipoDocumento method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdTipoDocumento() {
        System.out.println("IdTipoDocumento");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdTipoPago method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdTipoPago() {
        System.out.println("IdTipoPago");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdTipoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdUsuarios method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdUsuarios() {
        System.out.println("IdUsuarios");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    /**
//     * Test of IdVenta method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdVenta() {
        System.out.println("IdVenta");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//
//    /**
//     * Test of IdDetalleVenta method, of class Pruebas_Unitarias.
//     */
    @Test
    public void testIdDetalleVenta() {
        System.out.println("IdDetalleVenta");
        int expResult = 2;
        int result = Pruebas_Unitarias.IdDetalleVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
    }
    }
//

//    
}
