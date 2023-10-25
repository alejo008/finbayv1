package com.co.nttdata.ecommerce.entidades;

public class Usuario {

	private int id;
	private String nombreUsuario;
	private String contrasenia;
	private Ciudades ciudad;
	
	
	public Usuario() {
		
	}

	public Usuario(int id, String nombreUsuario, String contrasenia, Ciudades ciudad) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Ciudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudades ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
}
