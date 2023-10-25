package com.co.nttdata.ecommerce.entidades;

import java.util.Date;

public class Factura {

	private int idFactura;
	private Date fecha;
	private Empresa empresa;
	private Cliente cliente;
	private String descripcion;
	private CarritoDeCompras carritoDeCompras;
	
	private double valorTotalConIva;
	private double valorEnvio;
	
	public Factura() {
		
	}
	
	public Factura(int idFactura, Date fecha, Empresa empresa, Cliente cliente, String descripcion,
			CarritoDeCompras carritoDeCompras, double valorTotalConIva, double valorEnvio) {
		super();
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.empresa = empresa;
		this.cliente = cliente;
		this.descripcion = descripcion;
		this.carritoDeCompras = carritoDeCompras;
		this.valorTotalConIva = valorTotalConIva;
		this.valorEnvio = valorEnvio;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CarritoDeCompras getProductos() {
		return carritoDeCompras;
	}
	public void setProductos(CarritoDeCompras carritoDeCompras) {
		this.carritoDeCompras = carritoDeCompras;
	}
	public double getValorTotalConIva() {
		return valorTotalConIva;
	}
	public void setValorTotalConIva(double valorTotalConIva) {
		this.valorTotalConIva = valorTotalConIva;
	}
	

	public CarritoDeCompras getCarritoDeCompras() {
		return carritoDeCompras;
	}

	public void setCarritoDeCompras(CarritoDeCompras carritoDeCompras) {
		this.carritoDeCompras = carritoDeCompras;
	}

	public double getValorEnvio() {
		return valorEnvio;
	}

	public void setValorEnvio(double valorEnvio) {
		this.valorEnvio = valorEnvio;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", empresa=" + empresa + ", cliente=" + cliente
				+ ", descripcion=" + descripcion + ", carritoDeCompras=" + carritoDeCompras + ", valorTotalConIva=" + valorTotalConIva + ", valorEnvio=" + valorEnvio + "]";
	}

	
}