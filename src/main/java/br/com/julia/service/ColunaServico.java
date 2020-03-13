package br.com.julia.service;

import br.com.julia.dominio.Coluna;

import java.util.List;


public interface ColunaServico {
    Coluna salvar(Coluna coluna);
    List listarPorId();
    void  delete (Long idColuna);
}
