package com.co.nttdata.ecommerce.logica;


import java.util.*;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.interfaces.GestionLogin;

public class GestionLoginImpl implements GestionLogin{
	
	Scanner teclado = new Scanner(System.in);
	Cliente cliente = new Cliente();
	Cliente usr = new Cliente();
	

	public Usuario registrar(String nombreUsuario, String contrasenia, Ciudades ciudad, String numeroIdentificacion,String tipoIdentificacion,
			String telefono, String direccion, boolean estado, String metodoDePago) {
		
		
		
		usr.setNombreUsuario(nombreUsuario);
		usr.setContrasenia(contrasenia);
		usr.setCiudad(ciudad);
		usr.setNumeroIdentificacion(numeroIdentificacion);
		usr.setTipoIdentificacion(tipoIdentificacion);
		usr.setTelefono(telefono);
		usr.setDireccion(direccion);
		usr.setEstado(estado);
		usr.setMetodoDePago(metodoDePago);
		
		return usr;
	
	}
	

	public boolean ingreso(String nusu, String contra) {
		
		int u = 0;
		
		System.out.println("ingreso al login");
		do{
			
			if (usr.getNombreUsuario().equals(nusu)) {
				System.out.println("Usuario Correcto!");
				break ;
			}else {
				System.out.println("El usuario es incorrecto!"+"\n"+"Vuelvalo a intentar!!☻☠");
				
			}
			
		}while(u <= 3);
			
		 do{
			
			if (usr.getContrasenia().equals(contra)) {
				System.out.println("Contraseña Correcta!");
				break;
			}else {
				System.out.println("La contraseña es incorrecta!"+"\n"+"Vuelvalo a intentar!!☻☠");
			}
			
		}while(u <= 3);
		
		System.out.println("Bienvenido "+usr.getNombreUsuario()+" al Sistema ECOMMERCE");
		return true;
		
	}
	


	public Usuario logout() {
		System.out.print("Salida del Sistema Exitoso ⛔😽👾");
		System.exit(0);
		
		return null;
	}


	public Usuario cambioContraseña(String contrasenia) {
		String opcion;
		System.out.println("Desea cambiar contraseña? si/no");
		opcion = teclado.next();
		if(opcion.equals("si")){
			System.out.println("Escriba la nueva contraseña: ");
			contrasenia = teclado.nextLine();
			System.out.println("Contraseña guardada con Exito"+"\n"+"La nueva contraseña es: "+ contrasenia);	
		}else if (opcion.equals("no")) {
			System.out.println("No desea cambiar contraseña");
			
		}
		
		return null;
	}


	public Usuario mostrarRegistro(String nombreUsuario, String contrasenia, Ciudades ciudad,
			String numeroIdentificacion, String tipoIdentificacion, String telefono, String direccion, boolean estado,
			String metodoDePago) {
		
		System.out.println("Los datos de Usuario registrados son: ");
		System.out.println("El nombre Usuario es: " + usr.getNombreUsuario());
		System.out.println("La contraseña es: "+ usr.getContrasenia());
		System.out.println(usr.getCiudad());
		System.out.println(usr.getTipoIdentificacion());
		System.out.println("EL numero de Identificacion es: "+ usr.getNumeroIdentificacion());
		System.out.println("El numero de Telefono es: " + usr.getTelefono());
		System.out.println("La direccion es: "+ usr.getDireccion());
		System.out.println("EL estado es: " + usr.isEstado());
		System.out.println("El "+ usr.getMetodoDePago());
		System.out.println("Bienvedido newUser");
		
		return cliente;
	}


	

	
	

	
	
}
