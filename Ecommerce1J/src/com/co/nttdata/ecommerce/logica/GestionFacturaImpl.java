package com.co.nttdata.ecommerce.logica;

import com.co.nttdata.ecommerce.entidades.CarritoDeCompras;
import com.co.nttdata.ecommerce.entidades.Cliente;
import com.co.nttdata.ecommerce.entidades.Empresa;
import com.co.nttdata.ecommerce.entidades.Factura;

public class GestionFacturaImpl {
Factura f = new Factura();
	public Factura pagar(Cliente cliente, CarritoDeCompras cdc) {
		
		f.getCarritoDeCompras();
		f.setEmpresa(Empresa.ELECTROMEDELLIN);
		f.setDescripcion("Factura");
		f.setCliente(cliente);
		f.setIdFactura(123123);
		f.setProductos(cdc);
		f.setValorEnvio(cdc.getValorEnvio());
		f.setValorTotalConIva(cdc.getSubTotalConIva() + cdc.getValorEnvio());
		
		return f;
	}

	public void ImprimirFactura() {
		System.out.println("\n          "+f.getEmpresa()+f.getCarritoDeCompras()+" \n " +f.getDescripcion()+"\n"+"Id ->"+f.getIdFactura()+"\n"+f.getCliente()+"\n"+
		f.getProductos().getProductos()+"\n"+f.getValorTotalConIva()+"\n"+f.getValorEnvio()+"\n"+f.getValorTotalConIva());
	}
	
}

