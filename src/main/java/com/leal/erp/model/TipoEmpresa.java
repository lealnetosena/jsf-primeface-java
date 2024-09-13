package com.leal.erp.model;

public enum TipoEmpresa {
	MEI("Microempreendedor Individual"),
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;

	TipoEmpresa(String descricao) {
		// TODO Auto-generated constructor stub
	}
	
	public String getDescricao() {
		return descricao;
	}
}
