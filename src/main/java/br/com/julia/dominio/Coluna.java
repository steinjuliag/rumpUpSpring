package br.com.julia.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coluna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Ferro ferro;


    private Long idColuna;
    private double altura;
    private double largura;
    private double profundidade;
    private int quantidadeBarraPorColuna;


    public Coluna(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;

    }

    public Long getIdColuna() {
        return idColuna;
    }

    public void setIdColuna(Long idColuna) {
        this.idColuna = idColuna;
    }


    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }


    public Ferro getFerro() {
        return ferro;
    }

    public void setFerro(Ferro ferro) {
        this.ferro = ferro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getQuantidadeBarraPorColuna() {
        return quantidadeBarraPorColuna;
    }

    public void setQuantidadeBarraPorColuna(int quantidadeBarraPorColuna) {
        this.quantidadeBarraPorColuna = quantidadeBarraPorColuna;
    }

    @Override
    public String toString() {
        return "Coluna{" +
                "ferro=" + ferro +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                ", quantidadeBarraPorColuna=" + quantidadeBarraPorColuna +
                '}';
    }
}
