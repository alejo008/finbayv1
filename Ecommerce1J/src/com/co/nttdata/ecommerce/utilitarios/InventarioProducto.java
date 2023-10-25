package com.co.nttdata.ecommerce.utilitarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Factura;
import com.co.nttdata.ecommerce.entidades.Producto;


//Instancia
public class InventarioProducto{
	
	private File archivo;
	private FileWriter fw;
	private FileReader fr;
	private BufferedReader br;
	private BufferedWriter bw;
	private String mensaje;
	
	
	
	
	public void traerProductos(CarritoDeCompras cdc) {
		
	    	try {
	            FileWriter archivo = new FileWriter("C:/EcommercePrueba/Producto.txt");

	            archivo.write(  
	            		
	            		
	            		"--------------------------------------------" + "\n" +
	                    "Ls productos son: "  + "\n" +cdc.getProductos()  + "\n" 
	            		
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
	
	public void mostrarProductos(){
		
		File archivo = new File("C:/EcommercePrueba/Producto.txt" );
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
	
	
	public void eliminarProducto(CarritoDeCompras cdc) {
		List<Producto> p = null;
		cdc.setProductos( p);
		try {
            FileWriter archivo = new FileWriter("C:/EcommercePrueba/Producto.txt");

            archivo.write(  
            		
            		
            		"--------------------------------------------" + "\n" +
                    "Los productos a eliminar son: "  + "\n" +cdc.getProductos()  + "\n" 
                 
                 );

            
            for (int i = 0; i <= 10; i++) {
                archivo.write(i + "\n");
            }
            	System.out.println("El archivo se ha escrito con exito");
            	archivo.close();
        	}
        	catch(Exception e) {
        		System.out.println("Error al escribir el archivo: " + e.getMessage());
        	}

}
		
		
	}
	
	





