package com.co.nttdata.ecommerce.entidades;

public enum Categoria {
	
	TECNOLOGIA(1,"Tvs","Plasma",true,0.10);
	

	private int idCategoria;
	private String nombre;
	private String descripcion;
	private boolean descuento;
	private double valorDescuento;

	

	private Categoria(int idCategoria, String nombre, String descripcion, boolean descuento, double valorDescuento) {
		
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.valorDescuento = valorDescuento;
		
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	public double getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;
	}
	
}
