package com.co.nttdata.ecommerce.utilitarios;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.logica.*;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReporteFactura{
	
    public  void escribirArchivo(Cliente cliente, CarritoDeCompras cdc,Factura f ) {
    	
    
   
       
    	try {
            FileWriter archivo = new FileWriter("C:/EcommercePrueba/Factura.txt" );

            archivo.write(  
            		"    -------FACTURA------" + "\n" +
            		f.getEmpresa() + "\n" +
            		"Id Factura : " + "\n" +f.getIdFactura()  + "\n" +
            		"Los Datos del Cliente son:" + "\n" 
            		+f.getCliente()+ "\n"+
            		"--------------------------------------------" + "\n" +
                    "Ls productos son: "  + "\n" +cdc.getProductos()  + "\n" +
            		"El valor total es: "+ f.getValorEnvio()+ "\n" +
                    "valor total con Iva: "+f.getValorTotalConIva()+ "\n" +
            		"Valor total "+	f.getValorEnvio()
                 );

            
            for (int i = 0; i <= 0; i++) {
                archivo.write(i + "\n");
            }
            	System.out.println("El archivo se ha escrito con exito");
            	archivo.close();
        	}
        	catch(Exception e) {
        		System.out.println("Error al escribir el archivo: " + e.getMessage());
        	}


    }

    public  void leerArchivo() {
    	
    	File archivo = new File("C:/EcommercePrueba/Factura.txt");
    	Scanner s =null;
    	
    	try {
    		s = new Scanner(archivo);
    		while(s.hasNextLine()) {
    			String linea = s.nextLine();
    			System.out.println(linea);
    		}
    		
    	}catch(Exception e) {
    		System.out.println("Error al leer el archivo" + e.getMessage());
    	}finally {
    		try {
    			if(s !=null ) {
    				s.close();
    			}
    			
    		}catch(Exception e) {
    			System.out.println("Error al cerrar el archivo" + e.getMessage());
    		}
    	}
    	
    	
    }
}
