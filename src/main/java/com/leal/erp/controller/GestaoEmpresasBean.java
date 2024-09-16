package com.leal.erp.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
//@RequestScoped
//@ViewScoped
//@SessionScoped
@SessionScoped
public class GestaoEmpresasBean implements Serializable {


	private static final long serialVersionUID = 1L;
	private static Integer NUMERO = 0;
	
	public GestaoEmpresasBean() {
		NUMERO++;
	}
	
	public Integer getNumero() {
		return NUMERO;
	}
}
