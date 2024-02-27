/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.clases.AreaLaboral;
import com.clases.Articulo;
import com.clases.Clientes;
import com.clases.Compra;
import com.clases.DetalleCompra;
import com.clases.DetalleVenta;
import com.clases.Empleados;
import com.clases.Estado;
import com.clases.Parametros;
import com.clases.Proveedores;
import com.clases.SeccionTienda;
import com.clases.Talla;
import com.clases.TipoDePago;
import com.clases.TipoDocumento;
import com.clases.Usuarios;
import com.clases.Venta;
import com.dao.AreaLaboralJpaController;
import com.dao.ArticuloJpaController;
import com.dao.ClientesJpaController;
import com.dao.CompraJpaController;
import com.dao.DetalleCompraJpaController;
import com.dao.DetalleVentaJpaController;
import com.dao.EmpleadosJpaController;
import com.dao.EstadoJpaController;
import com.dao.ParametrosJpaController;
import com.dao.ProveedoresJpaController;
import com.dao.SeccionTiendaJpaController;
import com.dao.TallaJpaController;
import com.dao.TipoDePagoJpaController;
import com.dao.TipoDocumentoJpaController;
import com.dao.UsuariosJpaController;
import com.dao.VentaJpaController;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;


public class Pruebas_Unitarias {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    static EntityManager em = emf.createEntityManager();
    AreaLaboralJpaController daoAreaLaboral = new AreaLaboralJpaController();  
    AreaLaboral objAreaLaboral = new AreaLaboral();
    ArticuloJpaController daoArticulo = new ArticuloJpaController();
    Articulo objArticulo = new Articulo();
    ClientesJpaController daoClientes = new ClientesJpaController(); 
    Clientes objCliente = new Clientes();
    CompraJpaController daoCompra = new CompraJpaController();
    Compra objCompra = new Compra();
    DetalleCompra objDetalleCompra = new DetalleCompra();
    DetalleCompraJpaController daoDetalleCompra = new DetalleCompraJpaController();  
    EmpleadosJpaController daoEmpleado = new EmpleadosJpaController();   
    Empleados objEmpleado = new Empleados();
    EstadoJpaController daoEstado = new EstadoJpaController();  
    Estado objEstado = new Estado();
    ParametrosJpaController daoParametros = new ParametrosJpaController();
    Parametros objParametros = new Parametros();    
    ProveedoresJpaController daoProveedores = new ProveedoresJpaController();
    Proveedores objProveedores = new Proveedores();
    SeccionTiendaJpaController daoSeccionTienda = new SeccionTiendaJpaController();
    SeccionTienda objSeccionTienda = new SeccionTienda();
    TallaJpaController daoTalla = new TallaJpaController();
    Talla objTalla = new Talla();
    TipoDocumentoJpaController daoTipoDocumento = new TipoDocumentoJpaController();
    TipoDocumento objTipoDocumento = new TipoDocumento();
    TipoDePagoJpaController daoTipoDePago = new TipoDePagoJpaController();  
    TipoDePago objTipoDePago = new TipoDePago();
    UsuariosJpaController daoUsuario = new UsuariosJpaController();
    Usuarios objUsuario = new Usuarios();
    VentaJpaController daoVenta = new VentaJpaController();
    DetalleVentaJpaController daoDetalleVenta = new DetalleVentaJpaController();
    Venta objVenta = new Venta();
    DetalleVenta objDetalleVenta = new DetalleVenta();
    
    // Validaciones Generales
    
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
    

    
    private static String FormatoFactura(int numero){
    
        String s = String.format("%0" + 8 + "d", numero);
        String p = "000-001-01-"+s;
        return p;
        
    }
    
    private static int GetIdParametro(){
                  
              String select = "SELECT MIN(idParametros) FROM Parametros WHERE (now() between fechaEmision AND fechaCaducidad) AND ((SELECT MAX(idCompra) AS id FROM Compra) between facturaInicial AND facturaFinal) AND activoParametros = true";
              Query query = em.createQuery(select);
                  
              return Integer.parseInt(query.getSingleResult().toString());
            
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
        
        }}
    
    public static boolean ValidacionContraseña(String contraseña){
        
        return contraseña.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");
                
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
        
        public static boolean ValidacionFecha(String Nombre){
        
         return Nombre.matches("^(?:3[01]|[12][0-9]|0?[1-9])([\\/])(0?[0-9]|1[0-2])\\1\\d{4}$");
        
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
     
     public static boolean ValidacionCAI(String CAI){
        
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
       
     public static boolean ValidacionRTN(String RTN){
        
        return RTN.matches("^[0-1]{1}[0-9]{13}$");
                
        }
       
       
       public static boolean ValidacionDecimales(String Decimal){
        
        return Decimal.matches("^[1-9]{1}[0-9]{1,4}+\\.[0-9]{2}$");
                
        }
       
       
       // Area Laboral
       
       public static int IdAreaLaboral(){
        
      
             String select = "SELECT Max(idAreaLaboral)+1 FROM AreaLaboral";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
       
       public static boolean ValidacionDeRepetidosAreaLaboral(String Nombre){
       
      
             String select = "SELECT idAreaLaboral FROM AreaLaboral WHERE nombreAreaLaboral  = '"+Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
       
       
       public boolean LlenarAreaLaboral(String nombre, String Descripcion){
        
     
         objAreaLaboral.setIdAreaLaboral(IdAreaLaboral());
         objAreaLaboral.setNombreAreaLaboral(nombre);
         objAreaLaboral.setDescripcionAreaLaboral(Descripcion);
         objAreaLaboral.setActivoAreaLaboral(true);
        
        try {
            daoAreaLaboral.create(objAreaLaboral);
            return true;
            
        } catch (Exception ex) {
           
            return false;
            
        }
       } 
       
       public boolean EditarAreaLaboral(int id, String nombre, String Descripcion){  
       
        objAreaLaboral.setIdAreaLaboral(id);
        objAreaLaboral.setNombreAreaLaboral(nombre);
        objAreaLaboral.setDescripcionAreaLaboral(Descripcion);
        objAreaLaboral.setActivoAreaLaboral(true);
       
        try {
           daoAreaLaboral.edit(objAreaLaboral);
           return true;
           
        } catch (Exception ex) {
            
           return false;
             
        }
       }
       
       
       // Articulos
       
       public static String GetNombreTalla(int id){
        
              String select = "SELECT nombreTalla FROM Talla WHERE idTalla = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              return query.getSingleResult().toString() ;
            
          }    
       
       public static int GetIdTalla(String Nombre){
        
              String select = "SELECT idTalla FROM Talla WHERE nombreTalla = '"+ Nombre+ "'";
              Query query = em.createQuery(select);
    
              return Integer.parseInt(query.getSingleResult().toString());
            
          }   
          
          
          public static String GetNombreSeccionTienda(int id){
        
              String select = "SELECT nombreSeccionTienda FROM SeccionTienda WHERE idSeccionTienda = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              return query.getSingleResult().toString() ;
            
          }   
          
          public static int GetIdSeccionTienda(String Nombre){
        
              String select = "SELECT idSeccionTienda FROM SeccionTienda WHERE nombreSeccionTienda = '"+ Nombre + "'";
              Query query = em.createQuery(select);
    
              return Integer.parseInt(query.getSingleResult().toString());
            
          }   
          
           public static int IdArticulo(){
      
             String select = "SELECT Max(idArticulo)+1 FROM Articulo";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
                
        }
       
       public List<Articulo> buscarArticulo(String Nombres){
       
           Articulo a;
           
           String select = "SELECT a From Articulo a WHERE a.nombreArticulo LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Articulo> lista = query.getResultList();
           return lista;
           
       }
       
       public boolean LlenarArticulo(String nombreArticulo,double precio,String descripcion, int idtalla,int stockMin, int stockMax, int seccionTienda ){
             
            objArticulo.setIdArticulo(IdArticulo());
            objArticulo.setNombreArticulo(nombreArticulo);
            objArticulo.setPrecioArticulo(precio);
            objArticulo.setDescripcionArticulo(descripcion);
            objArticulo.setIdTalla(idtalla);
            objArticulo.setStock(0);
            objArticulo.setStockMinimo(stockMin);
            objArticulo.setStockMaximo(stockMax);
            objArticulo.setIdSeccionTienda(seccionTienda); 
            objArticulo.setActivoArticulo(true);
            
            
        try {
            daoArticulo.create(objArticulo);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }   
       
     
     
      public boolean EditarArticulo(int id, String nombreArticulo,double precio,String descripcion, int idtalla,int stockMin, int stockMax, int seccionTienda){
            
            objArticulo.setIdArticulo(id);
            objArticulo.setNombreArticulo(nombreArticulo);
            objArticulo.setPrecioArticulo(precio);
            objArticulo.setDescripcionArticulo(descripcion);
            objArticulo.setIdTalla(idtalla);
            objArticulo.setStock(0);
            objArticulo.setStockMinimo(stockMin);
            objArticulo.setStockMaximo(stockMax);
            objArticulo.setIdSeccionTienda(seccionTienda); 
            objArticulo.setActivoArticulo(true);
       
            
        try {
            daoArticulo.edit(objArticulo);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }  
            
      
      
      //Clientes
      
      public static String GetNombreTipoDocumento(int id){
        
              String select = "SELECT nombreTipoDocumento FROM TipoDocumento WHERE idTipoDocumento = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              return query.getSingleResult().toString() ;
            
          }         
   
          public static int GetIdTipoDocumento(String Nombre){

              String select = "SELECT idTipoDocumento FROM TipoDocumento WHERE nombreTipoDocumento = '"+ Nombre+ "'";
              Query query = em.createQuery(select);
    
              return Integer.parseInt(query.getSingleResult().toString());
            
          }   
          
          
          public static String GetNombreSexo(int id){

              String select = "SELECT nombreSexo FROM Sexo WHERE idSexo = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              return query.getSingleResult().toString() ;
            
          }   
          
          public static int GetIdSexo(String Nombre){
        
              String select = "SELECT idSexo FROM Sexo WHERE nombreSexo  = '"+ Nombre + "'";
              Query query = em.createQuery(select);
    
              return Integer.parseInt(query.getSingleResult().toString());
            
          } 
      
          
          public static int IdClientes(){
        
      
             String select = "SELECT Max(idCliente)+1 FROM Clientes";
   
             Query query = em.createQuery(select);
        
             if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
          
          public List<Clientes> buscarPersonas(String Nombres){
       
           Clientes c;

           String select = "SELECT c From Clientes c WHERE c.nombreCliente LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Clientes> lista = query.getResultList();
           return lista;
           
       }
          
          
          public boolean LlenarCliente(String nombre, String Apellido, long telefono, String direccion, String correo, int idDocumento,String documento, int idSexo){
        
            objCliente.setIdCliente(IdClientes());
            objCliente.setNombreCliente(nombre);
            objCliente.setApellidoCliente(Apellido);
            objCliente.setTelefonoCliente(telefono);
            objCliente.setDireccionCliente(direccion);
            objCliente.setCorreoCliente(correo);
            objCliente.setIdTipoDocumento(idDocumento);
            objCliente.setDocumento(documento);
            objCliente.setIdSexo(idSexo);
            objCliente.setActivoCliente(true);
            
            
        try {
            daoClientes.create(objCliente);
            return true;

        } catch (Exception ex) {
            return false;
        }
       }   
       
            
            public boolean EditarCliente(int id, String nombre, String Apellido, long telefono, String direccion, String correo, int idDocumento,String documento, int idSexo){
            
            objCliente.setIdCliente(id);
            objCliente.setNombreCliente(nombre);
            objCliente.setApellidoCliente(Apellido);
            objCliente.setTelefonoCliente(telefono);
            objCliente.setDireccionCliente(direccion);
            objCliente.setCorreoCliente(correo);
            objCliente.setIdTipoDocumento(idDocumento);
            objCliente.setDocumento(documento);
            objCliente.setIdSexo(idSexo);
            objCliente.setActivoCliente(true);
            
        try {
            daoClientes.edit(objCliente);
            return true;

        } catch (Exception ex) {
            return false;
        }
       }  
            
            
          // Compras 
          
           public List<Proveedores> buscarProveedor(String Nombres){
       
           Proveedores p;

           String select = "SELECT p From Proveedores p WHERE p.nombreProveedor LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Proveedores> lista = query.getResultList();
           return lista;
           
       }
      
       public List<Proveedores> buscarDocumento(String Nombres){
       
           Proveedores p;

           String select = "SELECT p From Proveedores p WHERE p.documento LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Proveedores> lista = query.getResultList();
           return lista;
           
       }
            
            
        public static String GetNombreProveedor(String RTN){

              String select = "SELECT nombreProveedor FROM Proveedores WHERE documento = '"+ RTN+ "' AND activoProveedor = true";
              Query query = em.createQuery(select);     
    
              return query.getSingleResult().toString();
                           
            
          }   
        
        
        public List<Articulo> buscarIdArticulo(String ID){
       
           Articulo a;

           String select = "Select a From Articulo a WHERE idArticulo LIKE '"+ ID +"%'";
           Query query = em.createQuery(select);
           List<Articulo> lista = query.getResultList();
           return lista;
           
       }
        
        
        public static int IdDetalleCompra(){
      
             String select = "SELECT Max(idDetalleCompra)+1 FROM DetalleCompra";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
        
        public static int IdCompra(){
        
      
             String select = "SELECT Max(idCompra)+1 FROM Compra";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
        
        
        public boolean LlenarCompra(double total, String fechaPedido, String fechaRecibido, int idProveedor, int idEmpleado){
        
            objCompra.setIdCompra(IdCompra());
            objCompra.setTotalCompra(total);
            objCompra.setFechaPedido(Timestamp.valueOf(GuardarFecha(fechaPedido)+ " 00:00:00"));
            objCompra.setFechaRecibido(Timestamp.valueOf(GuardarFecha(fechaRecibido)+ " 00:00:00"));
            objCompra.setIdProveedor(idProveedor);
            objCompra.setIdEmpleados(idEmpleado);
            objCompra.setIdEstado(2);
            
            
        try {
            daoCompra.create(objCompra);
            return true;            
        } catch (Exception ex) {
            return false;
        
       }   
       } 
      
      
      public boolean LlenarDetalleCompra(int cantidad, int idarticulo, double preciocompra){
        
            
            objDetalleCompra.setIdDetalleCompra(IdDetalleCompra());
            objDetalleCompra.setCantidad(cantidad);
            objDetalleCompra.setIdCompra((IdCompra()-1));
            objDetalleCompra.setIdArticulo(idarticulo);
            objDetalleCompra.setPrecioCompra(preciocompra);           
            
        try {
           daoDetalleCompra.create(objDetalleCompra);
           return true;
        } catch (Exception ex) {
           return false;
        
       }   
          }
        
        
      
      // Empleados
      
      public static int IdEmpleado(){
        
             String select = "SELECT Max(idEmpleados)+1 FROM Empleados";
   
             Query query = em.createQuery(select);
             
             if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        }
        
      
       public static String GetNombreAreaLaboral(int id){
        
              String select = "SELECT nombreAreaLaboral FROM AreaLaboral WHERE idAreaLaboral = '"+ id+ "'";
              Query query = em.createQuery(select);
    
              return query.getSingleResult().toString() ;
            
          }         
   
          public static int GetIdAreaLaboral(String Nombre){
        
              String select = "SELECT idAreaLaboral FROM AreaLaboral WHERE nombreAreaLaboral = '"+ Nombre+ "'";
              Query query = em.createQuery(select);
    
              return Integer.parseInt(query.getSingleResult().toString());
            
          } 
        
          
          public List<Empleados> buscarApellido(String Nombres){
       
           Empleados c;
             
           String select = "SELECT e From Empleados e WHERE e.apellidoEmpleado LIKE'"+ Nombres + "%'";
           Query query = em.createQuery(select);
           List<Empleados> lista = query.getResultList();
           return lista;
           
       }
          
          public boolean LlenarEmpleado(String nombre, String Apellido, long telefono, String correo, int idDocumento, String documento, String fecha_nacimiento, int idSexo, int idArealaboral){
        
       
            objEmpleado.setIdEmpleados(IdEmpleado());
            objEmpleado.setNombreEmpleado(nombre);
            objEmpleado.setApellidoEmpleado(Apellido);
            objEmpleado.setTelefonoEmpleado(telefono);
            objEmpleado.setCorreoEmpleado(correo);
            objEmpleado.setIdTipoDocumento(idDocumento);
            objEmpleado.setDocumento(documento);
            objEmpleado.setFechaDeNacimiento(Timestamp.valueOf(GuardarFecha(fecha_nacimiento)+ " 00:00:00"));
            objEmpleado.setIdSexo(idSexo);
            objEmpleado.setIdAreaLaboral(idArealaboral);
            objEmpleado.setActivoEmpleado(true);
                       
            
        try {
            daoEmpleado.create(objEmpleado);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }   
       
     
     
         public boolean EditarEmpleado(int id, String nombre, String Apellido, long telefono, String correo, int idDocumento, String documento, String fecha_nacimiento, int idSexo, int idArealaboral){
            
            objEmpleado.setIdEmpleados(IdEmpleado());
            objEmpleado.setNombreEmpleado(nombre);
            objEmpleado.setApellidoEmpleado(Apellido);
            objEmpleado.setTelefonoEmpleado(telefono);
            objEmpleado.setCorreoEmpleado(correo);
            objEmpleado.setIdTipoDocumento(idDocumento);
            objEmpleado.setDocumento(documento);
            objEmpleado.setFechaDeNacimiento(Timestamp.valueOf(GuardarFecha(fecha_nacimiento)+ " 00:00:00"));
            objEmpleado.setIdSexo(idSexo);
            objEmpleado.setIdAreaLaboral(idArealaboral);
            objEmpleado.setActivoEmpleado(true);

            
        try {
            daoEmpleado.edit(objEmpleado);
            return true;

        } catch (Exception ex) {
            return false;
        }
       }  
            
     
         
         //Estado
         
         public static int IdEstado(){
      
             String select = "SELECT Max(idEstado)+1 FROM Estado";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
         
         public boolean EditarEstado(int id, String nombre, String descripcion, int idEntidad){
            
         objEstado.setIdEstado(id);
         objEstado.setNombreEstado(nombre);
         objEstado.setDescripcionEstado(descripcion);
         objEstado.setIdEntidad(idEntidad);
         objEstado.setActivoEstado(true);

       
        try {
            daoEstado.edit(objEstado);
            return true;
        } catch (Exception ex) {
            return false;
        }
        
       }
         
         
         public boolean LlenarEstado(String nombre, String descripcion, int idEntidad){
        
         objEstado.setIdEstado(IdEstado());
         objEstado.setNombreEstado(nombre);
         objEstado.setDescripcionEstado(descripcion);
         objEstado.setIdEntidad(idEntidad);
         objEstado.setActivoEstado(true);
        
        try {
            daoEstado.edit(objEstado);
            return true;
            
        } catch (Exception ex) {
            return false;
        
       }   
       }  
         
         
         //Login
         
          public boolean ValidarAcceso(String Usuario, String Contraseña){


    String select = "SELECT nombreUsuario, contrasena FROM Usuarios WHERE nombreUsuario = '"+ Usuario+ "' AND contrasena = '" + Contraseña + "'";

    Query query = em.createQuery(select);
      
      if(query.getResultList().size() == 0){
       
       return false;   
          
    }else{
        
       return true;
        
    }
       
    }
         
     
         //Parametros
          
          
          public static int IdParametro(){
      
             String select = "SELECT Max(idParametros)+1 FROM Parametros";
   
             Query query = em.createQuery(select);
        
             if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                
             return 2;
             
             }
        
        }
          
        public boolean LlenarParametro(String cai, int FacturaInicial, int FacturaFinal, String fechaEmision, String FechaCaducidad){
        
       objParametros.setIdParametros(IdParametro());
       objParametros.setCai(cai);
       objParametros.setFacturaInicial(FacturaInicial);
       objParametros.setFacturaFinal(FacturaFinal);
       objParametros.setFechaEmision(Timestamp.valueOf(GuardarFecha(fechaEmision)+ " 00:00:00"));
       objParametros.setFechaCaducidad(Timestamp.valueOf(GuardarFecha(FechaCaducidad)+ " 00:00:00"));
       objParametros.setActivoParametros(true);
     
        
        try {
            daoParametros.create(objParametros);
            return true;
           
        } catch (Exception ex) {
            return false;
       }   
          }
          
          
          // Proveedores
          
          public static int IdProveedores(){
        
             String select = "SELECT Max(idProveedor)+1 FROM Proveedores";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
          
          public boolean LlenarProveedor(String nombre, long telefono, String correo, String ubicacion, int idDocumento, String Documento){
        
            objProveedores.setIdProveedor(IdProveedores());
            objProveedores.setNombreProveedor(nombre);
            objProveedores.setTelefonoProveedor(telefono);
            objProveedores.setCorreoProveedor(correo);
            objProveedores.setUbicacionProveedor(ubicacion);
            objProveedores.setIdTipoDocumento(idDocumento);
            objProveedores.setDocumento(Documento);
            objProveedores.setActivoProveedor(true);
            
            
        try {
            daoProveedores.create(objProveedores);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }   
       
        
        
        public boolean EditarProveedor(int id, String nombre, long telefono, String correo, String ubicacion, int idDocumento, String Documento){
            
            objProveedores.setIdProveedor(id);
            objProveedores.setNombreProveedor(nombre);
            objProveedores.setTelefonoProveedor(telefono);
            objProveedores.setCorreoProveedor(correo);
            objProveedores.setUbicacionProveedor(ubicacion);
            objProveedores.setIdTipoDocumento(idDocumento);
            objProveedores.setDocumento(Documento);
            objProveedores.setActivoProveedor(true);

            
        try {
            daoProveedores.edit(objProveedores);
            return true;
        } catch (Exception ex) {
            return false;
        }
       }  
            
        
        // seccion tienda
        
        public static int IdSeccionTienda(){
      
             String select = "SELECT Max(idSeccionTienda)+1 FROM SeccionTienda";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
            
       public boolean LlenarSeccionTienda(String nombre, String descripcion){
       
       objSeccionTienda.setIdSeccionTienda(IdSeccionTienda());
       objSeccionTienda.setNombreSeccionTienda(nombre);
       objSeccionTienda.setDescripcionSeccionTienda(descripcion);
       objSeccionTienda.setActivoSeccionTienda(true); 
        
        try {
            daoSeccionTienda.create(objSeccionTienda);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }   
       
       
       
       public boolean EditarSeccionTienda(int id, String nombre, String descripcion){
                  
       objSeccionTienda.setIdSeccionTienda(id);
       objSeccionTienda.setNombreSeccionTienda(nombre);
       objSeccionTienda.setDescripcionSeccionTienda(descripcion);
       objSeccionTienda.setActivoSeccionTienda(true);
       
        try {
            daoSeccionTienda.edit(objSeccionTienda);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
        }
       
          
       // Talla
       
       public static int IdTalla(){
      
             String select = "SELECT Max(idTalla)+1 FROM Talla";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
       
       
       public boolean LlenarTalla(String talla, String descripcion){
        
       objTalla.setIdTalla(IdTalla());
       objTalla.setNombreTalla(talla);
       objTalla.setDescripcionTalla(descripcion);
       objTalla.setActivoTalla(true);
        
        try {
            daoTalla.create(objTalla);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
       }   
       
    
       public boolean EditarTalla(int id, String talla, String descripcion){
                  
       objTalla.setIdTalla(id);
       objTalla.setNombreTalla(talla);
       objTalla.setDescripcionTalla(descripcion);
       objTalla.setActivoTalla(true);

       
        try {
            daoTalla.edit(objTalla);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
        }
       
       
       // Tipo de Documento
       
       public static int IdTipoDocumento(){
      
             String select = "SELECT Max(idTipoDocumento)+1 FROM TipoDocumento";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
       
       public boolean LlenarTipoDocumento(String documento, String descripcion){
        
       objTipoDocumento.setIdTipoDocumento(IdTipoDocumento());
       objTipoDocumento.setNombreTipoDocumento(documento);
       objTipoDocumento.setDescripcionTipoDocumento(descripcion);
       objTipoDocumento.setActivoTipoDocumento(true);
        
        try {
            daoTipoDocumento.create(objTipoDocumento);
            return true;

        } catch (Exception ex) {
            return false;
        }
       }   
       
       
       public boolean EditarTipoDocumento(int id, String documento, String descripcion){
               
       objTipoDocumento.setIdTipoDocumento(id);
       objTipoDocumento.setNombreTipoDocumento(documento);
       objTipoDocumento.setDescripcionTipoDocumento(descripcion);
       objTipoDocumento.setActivoTipoDocumento(true);

            
        try {
            daoTipoDocumento.edit(objTipoDocumento);
            return true;

        } catch (Exception ex) {
            return false;
        }
        }
       
       
       // Tipo de Pago
       
       public boolean EditarTipoPago(int id, String nombre, String descripcion){
                  
        objTipoDePago.setIdTipoDePago(id);
        objTipoDePago.setNombreTipoDePago(nombre);
        objTipoDePago.setDescripcionTipoDePago(descripcion);
        objTipoDePago.setActivoTipoDePago(true);
       
        try {
            daoTipoDePago.edit(objTipoDePago);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
        
       }
               
       public boolean LlenarTipoPago(String nombre, String descripcion){
        
       objTipoDePago.setIdTipoDePago(IdTipoPago());
       objTipoDePago.setNombreTipoDePago(nombre);
       objTipoDePago.setDescripcionTipoDePago(descripcion);
       objTipoDePago.setActivoTipoDePago(true);
        
        try {
            daoTipoDePago.create(objTipoDePago);
            return true;
        } catch (Exception ex) {
            return false;
        
       }   
       }    
        
        
        public static int IdTipoPago(){
      
             String select = "SELECT Max(idTipoDePago)+1 FROM TipoDePago";
   
             Query query = em.createQuery(select);
             
             if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        }
        
       
        // Usuario
        
        public static int IdUsuarios(){
      
             String select = "SELECT Max(idUsuario)+1 FROM Usuarios";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
          
        
        public boolean EditarUsuario(int id, String nombre, String contrasena, int idEmpleados){
        
            objUsuario.setIdUsuario(id);
            objUsuario.setNombreUsuario(nombre);
            objUsuario.setContrasena(contrasena);
            objUsuario.setNumeroDeIntentos(0);
            objUsuario.setAdmin(false);
            objUsuario.setIdEmpleados(idEmpleados);
            objUsuario.setActivoUsuario(true);       
            
        try {
            daoUsuario.edit(objUsuario);
            return true;
            
        } catch (Exception ex) {
            return false;
        }
                  
            }
    
     
     
     public boolean LlenarUsuario(String nombre, String contrasena, int idEmpleados){
                      
            objUsuario.setIdUsuario(IdUsuarios());
            objUsuario.setNombreUsuario(nombre);
            objUsuario.setContrasena(contrasena);
            objUsuario.setNumeroDeIntentos(0);
            objUsuario.setAdmin(false);
            objUsuario.setIdEmpleados(idEmpleados);
            objUsuario.setActivoUsuario(true);
            
            
        try {
            daoUsuario.create(objUsuario);
            return true;
        } catch (Exception ex) {
            return false;
        }
         
       } 
        
        
     // Ventas
     
     public static int IdVenta(){
      
             String select = "SELECT Max(idVenta)+1 FROM Venta";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
      
      public static int IdDetalleVenta(){
      
             String select = "SELECT Max(idDetalleVenta)+1 FROM DetalleVenta";
   
             Query query = em.createQuery(select);
        
              if(query.getSingleResult() == null){
             
             return 1;
             
             }else{
                 
             return 2;
             
             }
        
        }
     
      
      public boolean LlenarVenta(double impuesto, double subtotal, double total, int idParametro, int idEmpleado, int idTipoPago, int idCliente, double montoEfectivo){
        
            objVenta.setIdVenta(IdVenta());
            objVenta.setFechaVenta(Timestamp.valueOf(fecha_Hora_Actual()));
            objVenta.setImpuesto(impuesto);
            objVenta.setSubTotal(subtotal);
            objVenta.setTotal(total);
            objVenta.setIdParametros(idParametro);
            objVenta.setIdEmpleados(idEmpleado);
            objVenta.setIdTipoDePago(idTipoPago);
            objVenta.setIdCliente(idCliente);
            objVenta.setIdEstado(3);         
            objVenta.setFormato(FormatoFactura(IdVenta()));
            objVenta.setMontoEfectivo(montoEfectivo);
            objVenta.setMontoTarjeta(0.0);
            objVenta.setNumTarjeta("0");
                   
        try {
            daoVenta.create(objVenta);
            return true;            
        } catch (Exception ex) {
            return false;
        
       }   
       } 
        
        
         public boolean LlenarDetalleVenta(int cantidad, int idArticulo){
              
            objDetalleVenta.setIdDetalleVenta(IdDetalleVenta());
            objDetalleVenta.setCantidad(cantidad);
            objDetalleVenta.setIdVenta(IdVenta()-1);
            objDetalleVenta.setIdArticulo(idArticulo);   
            
        try {
            daoDetalleVenta.create(objDetalleVenta);
            return true;
        } catch (Exception ex) {
            return false;
        
       }   
          }
        
        
       
      
    private static String fecha_Hora_Actual(){
            
    Date fecha = new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
    
    LocalTime hora = LocalTime.now();
    
    String FechaCompleta = formatofecha.format(fecha)+" "+hora.toString().substring(0,8) ; 
    return FechaCompleta;
    
    }
     
            }
          
            

        
       
       
         
     

