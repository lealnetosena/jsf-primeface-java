package com.leal.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.leal.erp.model.Empresa;
import com.leal.erp.repository.Empresas;
import com.leal.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Empresas empresas;

    @Transacional
    public void salvar(Empresa empresa) {
        empresas.guardar(empresa);
    }

    @Transacional
    public void excluir(Empresa empresa) {
        empresas.remover(empresa);
    }

}