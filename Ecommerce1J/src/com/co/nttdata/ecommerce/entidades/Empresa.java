package com.co.nttdata.ecommerce.entidades;

public enum Empresa {
	
	ELECTROMEDELLIN(1,1003566340);

	private int idEmpresa;
	private int nit;
	
	


	Empresa(int idEmpresa, int nit) {

		this.idEmpresa = idEmpresa;
		this.nit = nit;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	
	
}