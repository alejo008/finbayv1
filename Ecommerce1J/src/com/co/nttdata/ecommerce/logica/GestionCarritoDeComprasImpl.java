package com.co.nttdata.ecommerce.logica;

import java.util.List;

import com.co.nttdata.ecommerce.entidades.*;
import com.co.nttdata.ecommerce.interfaces.GestionCarritoDeCompras;


public class GestionCarritoDeComprasImpl implements GestionCarritoDeCompras{
	double total = 0.0;

	@Override
	public CarritoDeCompras añadirAlCarrito(CarritoDeCompras cdc, List<Producto> list) {
		// TODO Auto-generated method stub
		cdc.setProductos(list);
		return cdc;

	}


	
	@Override
	public CarritoDeCompras calcularTotalConIva(CarritoDeCompras cdc) {
		
		for (int i = 0; i < cdc.getProductos().size(); i++) {
			//1100           2000
			total = total + cdc.getProductos().get(i).getPrecio() +
			(cdc.getProductos().get(i).getPrecio() *
			(cdc.getProductos().get(i).getIva()/100));

			}
			cdc.setSubTotalConIva(total);
			return cdc;

	}

	

	@Override
	public CarritoDeCompras calcularCostoEnvio(CarritoDeCompras cdc, Ciudades ciudad) {
		//Para el calculo del envio se debe tener en cuenta la ubicacion del cliente
				//Si se encuentra en ciudades principales se debe cobrar el 5%
				//Si se encuentra en ciudades no principales se debe cobrar el 10%
               
				double total = 0;
				double totalEnvio = 0;
           
                
				for (int i = 0; i < cdc.getProductos().size(); i++) {
				//1100           2000
				total = total + cdc.getProductos().get(i).getPrecio() +
				(cdc.getProductos().get(i).getPrecio() *
				(cdc.getProductos().get(i).getIva()/100));
				}

				if(ciudad.isPrincipal()) {
				System.out.println("🍔Se debe cobrar el 5% del envio Total, porque es Ciudad Principal🍔" );
				totalEnvio= (total * 5)/100;
				
				}else  {

				System.out.println("🥟🥟Se debe cobrar el  10 % envio total, porque es Ciudad No  Principal🥐🥐");
				totalEnvio= (total * 10)/100;
				}


				System.out.println("🚚🚚El valor del envio es:💒💒 "+ totalEnvio);
				cdc.setValorEnvio(totalEnvio);
				return cdc;
	}


}	
	

