package com.co.nttdata.ecommerce.interfaces;

import java.util.List;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Ciudades;
import com.co.nttdata.ecommerce.entidades.Producto;

public interface GestionCarritoDeCompras {
	
	public CarritoDeCompras añadirAlCarrito(CarritoDeCompras cdc, List<Producto> p);
	
	public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc);

	public CarritoDeCompras calcularCostoEnvio(CarritoDeCompras cdc, Ciudades ciudad);
	
}
