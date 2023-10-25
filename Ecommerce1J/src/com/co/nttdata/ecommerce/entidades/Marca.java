package com.co.nttdata.ecommerce.entidades;

public enum Marca {
	
	LG(1, "Marca LG de TVs"),
	SAMSUNG(2, "Marca SAMSUNG de TVs"),
	KIA(3, "Marca HIUNDAY de TVs");
	
	private int id;
	private String descripcion;
	
	private Marca(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
}

