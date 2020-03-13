package br.com.julia.dominio;


public class Estribo {
    private double espacamento;
    private Coluna coluna;
    private Ferro ferro;


    public Estribo(Ferro ferro, double espacamento, Coluna coluna) {
        this.espacamento = espacamento;
        this.coluna = coluna;
    }

    public double getEspacamento() {
        return espacamento;
    }

    public void setEspacamento(double espacamento) {
        this.espacamento = espacamento;
    }

    public Coluna getColuna() {
        return coluna;
    }

    public void setColuna(Coluna coluna) {
        this.coluna = coluna;
    }

    public Ferro getFerro() {
        return ferro;
    }

    public void setFerro(Ferro ferro) {
        this.ferro = ferro;
    }
}
