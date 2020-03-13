package br.com.julia.ui;

import br.com.julia.dominio.Coluna;
import br.com.julia.dominio.Estribo;
import br.com.julia.dominio.Ferro;

import java.util.ArrayList;
import java.util.List;

public class CalcularFerroColuna {

    List<Coluna> colunas;

    public List<Coluna> getColunas() {
        return colunas;
    }

    public void setColunas(List<Coluna> colunas) {
        this.colunas = colunas;
    }

    public List<Ferro> getBitolaFerroColuna() {
        return bitolaFerroColuna;
    }

    public void setBitolaFerroColuna(List<Ferro> bitolaFerroColuna) {
        this.bitolaFerroColuna = bitolaFerroColuna;
    }


    List<Ferro> bitolaFerroColuna = new ArrayList<>();

    public static double calcularEstribo(Estribo estribo) {
        double totalFerroEstribo;
        totalFerroEstribo = estribo.getColuna().getAltura() / estribo.getEspacamento();
        return totalFerroEstribo;
    }



}
