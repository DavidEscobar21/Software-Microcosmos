/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author david
 */
public class Logs {
    
    
    
    public void Logs(String NombreArchivo, String error) {
        java.util.Date fecha = new java.util.Date();
        DateFormat f = new SimpleDateFormat("YYYYMMdd-hhmmss");
        String fileName = "src\\main\\java\\Logs\\"+NombreArchivo+ " "+f.format(fecha)+".log";

        try {
            PrintStream ps = new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(new File(fileName), true)), true);
            java.util.Date fecha2 = new java.util.Date();
            DateFormat f2 = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
            String fechaActual = f2.format(fecha2);
            ps.println(fechaActual + " - " + error);

            ps.close();

            System.setOut(ps);
            System.setErr(ps);

        } catch (FileNotFoundException ex) {
            System.err.println(ex);

        }

    }
    
    
    
    
}
