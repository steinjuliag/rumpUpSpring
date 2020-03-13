package br.com.julia.ui;


import br.com.julia.dominio.Coluna;
import br.com.julia.dominio.Estribo;
import br.com.julia.dominio.Ferro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    Coluna coluna;
    Estribo estribo;
    CalcularFerroColuna cfc = new CalcularFerroColuna();
    List<Coluna> colunas = new ArrayList<>();

    private List<Coluna> criarColunas() {

        coluna = new Coluna(3.00, 0.30, 0.15);
        coluna.setProfundidade(0.15);
        coluna.setLargura(0.30);
        coluna.setAltura(2.80);
        coluna.setQuantidadeBarraPorColuna(4);
        coluna.setFerro(Ferro.CINCOOITAVOS);
        colunas.add(coluna);

        cfc.setColunas(colunas);
        return colunas;
    }

    private void criarEstribo() {
        estribo = new Estribo(Ferro.UMQUARTO, 0.20, coluna);
        double total = CalcularFerroColuna.calcularEstribo(estribo);

    }

    public static void main(String[] args) {
        CalcularFerroColuna cfc;
        List<Coluna> colunas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Teste t = new Teste();
       colunas = t.criarColunas();
        for (int i = 0; i < colunas.size(); i++) {
            System.out.println(colunas.get(i));

        }


    }
}