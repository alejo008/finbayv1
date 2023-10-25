package com.co.nttdata.ecommerce.entidades;

public enum Ciudades {
	MEDELLIN(true),
	GUAJIRA(false);
	
	private boolean principal;
	
	private Ciudades (boolean principal) {
		this.principal = principal;
	}
	public boolean isPrincipal() {
		return principal;
	}
	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}
	
}
