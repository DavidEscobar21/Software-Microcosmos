/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microcosmosproyecto;

import com.clases.Articulo;
import com.screens.FmrArticulos;
import com.screens.FmrClientes;
import com.screens.FmrLogin;
import com.screens.FmrMenú;
import com.screens.FmrProveedores;
import com.screens.FmrTalla;
import com.screens.FmrTipoDocumento;
import com.screens.Logs;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.StringConverter;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;




public class Main {
    
    
   static Logs log = new Logs();
    
    public static void main(String[] args){
        
        int x = 5;
        String y = "s";
        int z;
        try{
        
        z = x+ Integer.parseInt(y);
        
        
        }catch(Exception ex){
        
        log.Logs("PantallaClientes", "Hubo un error al intentar guadar: " + ex);
        
        
        }
        
        
        
        
//        System.out.println(verificarCaracteresRepetidos("Holaaa")); //True
//        System.out.println(verificarCaracteresRepetidos("hola daviiid")); //True
//        System.out.println(verificarCaracteresRepetidos("hooolaa")); //True
//        System.out.println(verificarCaracteresRepetidos("hollla david")); //True
//        System.out.println(verificarCaracteresRepetidos("Komoooo")); //True
//        System.out.println(verificarCaracteresRepetidos("hola")); //False
//        System.out.println(verificarCaracteresRepetidos("hola david")); //False
//        
//        
        
//        String texto = "David Escobar";
//        
//        String nombre = texto.split(" ")[0];
//        String Apellido = texto.split(" ")[1];
//        
//        System.out.println(texto);
//        System.out.println(nombre);
//        System.out.println(Apellido);
        
        
//     System.out.println(Fechavalida("29/02/2019")); //false
//     System.out.println(Fechavalida("32/09/2022")); //false
//     System.out.println(Fechavalida("31/09/2022")); //false
//     System.out.println(Fechavalida("29/02/2021")); //false
//     System.out.println(Fechavalida("29/02/2020")); //true 
//     System.out.println(Fechavalida("29/02/2024")); //true    
//     System.out.println(Fechavalida("30/09/2022")); //true
     
  //  EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
  // EntityManager em = emf.createEntityManager();
    
    
//   System.out.println(ValidacionCai());
//   System.out.println(GetIdParametro());  
//   System.out.println(fecha_Hora_Actual()); 
//   System.out.println(fecha_Hora_Actual2());   
  
//      System.out.println(ValidacionCAI2("94ACF2-AB342A-AC49B3-EC2AB3-5FA281-67")); // true
//      System.out.println(ValidacionCAI2("94ACF2-AB342A-AC49B3-EC2AB3-5FA281-6A")); // true
//      System.out.println(ValidacionCAI2("94ACF2-AB342A-AC49B3-EC2AB3-5FA28-67")); // false
//      System.out.println(ValidacionCAI2("94ACF2-AB342a-AC49B3-EC2AB3-5FA281-6A")); // false
//      System.out.println(ValidacionCAI2("94ACF2-AB342A-AC49B3-EC2AB3-5FA281-6a")); // false
//      System.out.println(ValidacionCAI2("94ACF2-AB342A-AC49B3-EC2AB3-512281-67")); // false
//      System.out.println(ValidacionCAI2("ABCDEF-AB342A-AC49B3-EC2AB3-ABCDAE-67")); // false
      
//    System.out.println(ValidacionCAI("ABCDEFGHIJ")); // false
//    System.out.println(ValidacionCAI("123456789a")); // false
//    System.out.println(ValidacionCAI("1234ABCDEF")); // true
//    System.out.println(ValidacionCAI("ABCDEF1234")); // true
//    System.out.println(ValidacionCAI("A1B2C3D4E5")); // true
    
    
//    System.out.println(Comparacionfecha("13/08/2021","12/08/2022")); //true
//    System.out.println(Comparacionfecha("13/08/2021","12/09/2021")); //true
//    System.out.println(Comparacionfecha("13/08/2021","14/08/2021")); //true
//    System.out.println(Comparacionfecha("13/08/2021","13/08/2021")); //false
//    System.out.println(Comparacionfecha("13/08/2021","12/08/2021")); //false
//    System.out.println(Comparacionfecha("13/08/2021","13/07/2021")); //false
//    System.out.println(Comparacionfecha("13/08/2021","14/08/2020")); //false
//    System.out.println(fechaActual());
    
    
//    System.out.println(GetNombreDeUsuario("David","Escobar"));
//    System.out.println(GetNombreDeUsuario("D","escobar"));
    //System.out.println(Encriptar("12345"));
    //System.out.println(Encriptar("123456789102345"));
       
  // JOptionPane.showMessageDialog(this, "Hola","Error",JOptionPane.ERROR_MESSAGE);
          
  //   System.out.println(ValidacionDocumento("12345678901234")); //true
  //   
  //        System.out.println(GetFecha(1)); //true
//        System.out.println(ValidacionDias("31/09/2020")); //true
//        System.out.println(ValidacionDias("31/04/2020")); //true
//        System.out.println(ValidacionDias("29/02/2020")); //false
//        System.out.println(MostrarFecha2("2021-08-11 12:34:12"));
//      System.out.println(ValidacionContraseña("12345678")); //false
//      System.out.println(ValidacionContraseña("abcdefghi")); //false
//      System.out.println(ValidacionContraseña("AEIOUBCDEWQ")); //false
//      System.out.println(ValidacionContraseña("Abfdsahgfdsa")); //false
//      System.out.println(ValidacionContraseña("A12345678")); //false
//      System.out.println(ValidacionContraseña("a12345678")); //false
//      System.out.println(ValidacionContraseña("a12345B")); //false
//      System.out.println(ValidacionContraseña("Ab12345678")); //true
    
 //   System.out.println(ValidacionFecha("1.12.2019")); //false
 //   System.out.println(ValidacionFecha("2019-12-01")); //false
 //   System.out.println(ValidacionFecha("2019-12-01")); //false
 //   System.out.println(ValidacionFecha("01-12-2019")); //false
//    System.out.println(ValidacionFecha("1/12/2019")); //false
//    System.out.println(ValidacionFecha("32/11/2021")); //false
//    System.out.println(ValidacionFecha("01/1/2021")); //false
//    System.out.println(ValidacionFecha("31/03/2019")); //true
   
    
    
//   String select = "SELECT idCliente FROM Clientes WHERE apellidoCliente = 'Santamaria' ";
//   Query query = em.createQuery(select);
//    
//   System.out.println(query.getResultList());
    
    
 //   FmrTalla t = em.find(FmrTalla.class, 1);
   // System.out.println(t.getIdTalla());
 //   System.out.println(t.getNombreTalla());
   // System.out.println(t.getDescripcionTalla());
   // System.out.println(t.isActivoTalla());


 // FmrTalla t = new FmrTalla();
 // t.show();

 // FmrTipoDocumento D = new FmrTipoDocumento();
 // D.show();

//  FmrLogin L = new FmrLogin();
//  L.show();
    
//  FmrMenú m = new FmrMenú();
//  m.show();

//  FmrClientes c = new FmrClientes();
//  c.show();

//  FmrArticulos Art = new FmrArticulos();
//  Art.show();

//  FmrProveedores P = new FmrProveedores();
//  P.show();
 
    }
    
     public static boolean verificarCaracteresRepetidos(String cadena) {
            
        String patron = "^(\\d|(([A-Za-zñÑáéíóúÁÉÍÓÚ\\s])\\3?(?!\\3)))+$";
        Pattern patt = Pattern.compile(patron);
        Matcher comparador = patt.matcher(cadena);
        
        if (!comparador.matches()) {
            
            return false;
            
        } else {
            
            return true;
        }
        
        
    }
     
     public static boolean ValidarNombre(String nombre){
     
     return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
     
     }
     
    
     public static boolean Fechavalida(String date) 
{
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
}
    
    
    private static String FormatoFactura(int numero){
    
        String s = String.format("%0" + 8 + "d", numero);
        String p = "000-001-01-"+s;
        return p;
        
    }
    
    
    
    private static int GetIdParametro(){
        
              EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
              EntityManager em = emf.createEntityManager();
              String select = "SELECT MIN(idParametros) FROM Parametros WHERE (now() between fechaEmision AND fechaCaducidad) AND ((SELECT MAX(idCompra) AS id FROM Compra) between facturaInicial AND facturaFinal) AND activoParametros = true";
              Query query = em.createQuery(select);
    
              
              return Integer.parseInt(query.getSingleResult().toString());
            
          }   
    
      public List<Articulo> buscarArticulo(String Nombres){
       
           Articulo a;
             
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
           EntityManager em = emf.createEntityManager();
           String select = "SELECT a From Articulo a WHERE a.nombreArticulo LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Articulo> lista = query.getResultList();
           return lista;
           
       }
    
    
    private static boolean Comparacionfecha(String FechaInicio, String FechaFinal){
    
        int dia = Integer.parseInt(FechaInicio.substring(0, 2));
        int mes = Integer.parseInt(FechaInicio.substring(3, 5));
        int año = Integer.parseInt(FechaInicio.substring(6, 10));
    
        int dia2 = Integer.parseInt(FechaFinal.substring(0, 2));
        int mes2 = Integer.parseInt(FechaFinal.substring(3, 5));
        int año2 = Integer.parseInt(FechaFinal.substring(6, 10));
    
        if(año < año2){
        
        return true;
        
        }else if(año == año2 && mes < mes2){
        
        return true;
        
        }else if(año == año2 && mes == mes2 && dia < dia2){
        
        return true;
        
        }else{
            
        return false;
        
        }
        
    
    }
    
    public static String fechaActual(){
    
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
    
    return formatofecha.format(fecha);
    
    }
    
    public static String fecha_Hora_Actual(){
            
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
    
    LocalTime hora = LocalTime.now();
    
    String FechaCompleta = formatofecha.format(fecha)+" "+hora.toString().substring(0,8) ; 
    return FechaCompleta;
    
    }
    
     public static String fecha_Hora_Actual2(){
            
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
    
    LocalTime hora = LocalTime.now();
    
    String FechaCompleta = formatofecha.format(fecha)+" "+hora.toString().substring(0,8) ; 
    return FechaCompleta;
    
    }
    
    private static String GetFecha(int id){
        
              EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
              EntityManager em = emf.createEntityManager();
              String select = "SELECT fechaFinal FROM PrecioHistorico WHERE idPrecioHistorico = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              try{
              return query.getSingleResult().toString();
              }
              catch(Exception e){
              
              return "hola";
              }
          }
    
    public static boolean ValidacionDocumento(String Documento){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idProveedor FROM Proveedores WHERE documento  = '"+Documento+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
    
    
    
       public static boolean ValidacionContraseña(String contraseña){
        
        return contraseña.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");
                
        }
       
       
       public static boolean ValidacionDias(String Fecha){
        
        //  21/03/1999
        int Año = Integer.parseInt(Fecha.substring(6, 10));
        Fecha = Fecha.substring(0, 5);
         
        System.out.println(Año);
        
        if ((Año % 4 == 0) && ((Año % 100 != 0) || (Año % 400 == 0))){
            
	if(Fecha.equals("30/02") || Fecha.equals("31/02") || Fecha.equals("31/04") || Fecha.equals("31/06") || Fecha.equals("31/09") ||
           Fecha.equals("31/11")|| Fecha.equals("29/02")){
      
            return true;
        
        }else{
        
            return false;
           
        }
       
        }else{
	
           if(Fecha.equals("30/02") || Fecha.equals("31/02") || Fecha.equals("31/04") || Fecha.equals("31/06") || Fecha.equals("31/09") ||
           Fecha.equals("31/11")){
      
            return true;
        
        }else{
        
            return false;
           
        }   }   }
       

    public static SecretKeySpec CrearClave(String llave){
   
        try{
        byte[] cadena = llave.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        cadena = md.digest(cadena);
        cadena = Arrays.copyOf(cadena, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
        return secretKeySpec;
        
        }catch(Exception e ){
        
            return null;         
        }
    }
    
    
    
    public static String Encriptar(String contraseña){
    
        try{
        SecretKeySpec secretKeySpec = CrearClave("Microcosmos");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        
        byte[] cadena = contraseña.getBytes("UTF-8");
        byte[] encriptar = cipher.doFinal(cadena);
        String cadena_Encriptada = Base64.encode(encriptar);
        return cadena_Encriptada;
        
        
        }catch(Exception e){
        
            return "";
            
        }
    }
    
    
    public static String GuardarFecha(String f){
        
        
        //  21/03/1999
         
        String dia = f.substring(0, 2);
        String mes = f.substring(3, 5);
        String año = f.substring(6, 10);
        
        return año+"-"+mes+"-"+dia;
        
    
    }
    
    public static String MostrarFecha(String f){
        
         
        String dia = f.substring(0, 4);
        String mes = f.substring(5, 7);
        String año = f.substring(8, 10);
        
        return año+"/"+mes+"/"+dia;
        
    
    }
    
    public static String MostrarFecha2(String f){
        
         
        String dia = f.substring(0, 4);
        String mes = f.substring(5, 7);
        String año = f.substring(8, 10);
        String hora = f.substring(11, 19);
        
        return año+"/"+mes+"/"+dia +" "+hora;
        
    
    }
    
     public static boolean ValidacionFecha(String Nombre){
        
         return Nombre.matches("^(?:3[01]|[12][0-9]|0?[1-9])([\\/])(0?[0-9]|1[1-2])\\1\\d{4}$");
        
        }
    
    public static boolean ValidacionCAI2(String CAI){
        
        return CAI.matches("^((?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{6})([-])((?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{6})([-])"
                         + "((?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{6})([-])((?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{6})([-])"
                         + "((?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{6})([-])([A-Z0-9]{2})$");
                
        }
    
      public static boolean ValidacionMail(String Nombre){
        
         return Nombre.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
        
        
        }
      
       public static boolean ValidacionDNI(String DNI){
        
        return DNI.matches("^[0-1]{1}[0-9]{12}$");
                
        }
       
       public static boolean ValidacionCAI(String CAI){
        
        return CAI.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$");
                
        }
       
       public static boolean ValidacionRTN(String RTN){
        
        return RTN.matches("^[0-1]{1}[0-9]{13}$");
                
        }
       
       
       public static boolean ValidacionDecimales(String Decimal){
        
        return Decimal.matches("^[1-9]{1}[0-9]{1,4}+\\.[0-9]{2}$");
                
        }
       
       private static int ValidacionCai(){
        
              EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
              EntityManager em = emf.createEntityManager();
              String select = "SELECT idParametros FROM Parametros WHERE (now() between fechaEmision AND fechaCaducidad) AND ((SELECT MAX(idVenta) AS id FROM Venta) between facturaInicial AND facturaFinal) AND activoParametros = true";
              Query query = em.createQuery(select);
    
              
              return query.getResultList().size();
            
          } 
      
     private static boolean ValidacionTresLetras(String Nombre){
        
        String Letra1 = Nombre.substring(0, 1);
        String Letra2 = Nombre.substring(1, 2);
        String Letra3 = Nombre.substring(2, 3);
        
        
        if(Letra1.equalsIgnoreCase(Letra2) && Letra2.equalsIgnoreCase(Letra3)){
        
        return true;
         
        }else{
        
        return false;
              
        }
              
        }
     
     public static boolean ValidacionDeRepetidos(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idTalla FROM Talla WHERE nombreTalla  = '"+ Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
     
      public static String GetNombreDeUsuario(String Nombre, String Apellido){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String NombreUsuario = Nombre+Apellido;
             String select = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario  = '"+ NombreUsuario + "'";
   
             Query query = em.createQuery(select);
             
             
             String NombresRepetidos = NombreUsuario;
       
             if(query.getResultList().size() != 0){
             
                for(int i = 1; i != 0; i++){
                    
                select = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario  = '"+ NombreUsuario + "'";
                query = em.createQuery(select);
                
                if(query.getResultList().size() != 0){
                
                NombreUsuario = NombresRepetidos;
                NombreUsuario = NombreUsuario+i;
                
                
                }else{
                
                i = -1;
                
                }
                 
                 }
                 
                 
             return NombreUsuario;
             
             }else{
             
             return NombreUsuario;
                
             }
             
        }
      
      
     
        public static boolean ValidacionDeRepetidos2(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario = '"+ Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }        
             
             
             
       }         
}
