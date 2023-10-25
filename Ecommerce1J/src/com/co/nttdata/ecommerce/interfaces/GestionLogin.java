package com.co.nttdata.ecommerce.interfaces;


import com.co.nttdata.ecommerce.entidades.Ciudades;

import com.co.nttdata.ecommerce.entidades.Usuario;

public interface GestionLogin {
	
	public Usuario registrar(String nombreUsuario, String contrasenia, Ciudades ciudad,String tipoIdentificacion, String numeroIdentificacion,
			String telefono, String direccion, boolean estado, String metodoDePago);
	
	public boolean  ingreso(String nusu, String contra);
	
	public Usuario logout();
	
	public Usuario cambioContraseña(String contrasenia);

	
	
}

