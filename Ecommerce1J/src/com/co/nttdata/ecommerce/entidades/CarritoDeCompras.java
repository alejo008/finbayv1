package com.co.nttdata.ecommerce.entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

	private int idCarritoDeCompras;
	private Date fecha;
	private List<Producto> productos;
	//hecho
	private double subTotalConIva;
	
	private double valorEnvio;
	//Se debe cambiar los artibutos del subTotal a:
	// - subTotalConIva y subTotaSinIva
	
	public CarritoDeCompras() {
		this.productos = new ArrayList<>();	
	}
	
	public CarritoDeCompras(int idCarritoDeCompras, Date fecha, List<Producto> productos, double subTotalConIva, double valorEnvio) {
		super();
		this.idCarritoDeCompras = idCarritoDeCompras;
		this.fecha = fecha;
		this.productos = productos;
		this.subTotalConIva = subTotalConIva;
		
		this.valorEnvio = valorEnvio;
	}

	public int getIdCarritoDeCompras() {
		return idCarritoDeCompras;
	}

	public void setIdCarritoDeCompras(int idCarritoDeCompras) {
		this.idCarritoDeCompras = idCarritoDeCompras;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public double getSubTotalConIva() {
		return subTotalConIva;
	}

	public void setSubTotalConIva(double subTotalConIva) {
		this.subTotalConIva = subTotalConIva;
	}



	public double getValorEnvio() {
		return valorEnvio;
	}

	public void setValorEnvio(double valorEnvio) {
		this.valorEnvio = valorEnvio;
	}

	
}