package br.com.julia.dominio;



public enum Ferro {
    COMPRIMENTO(12),
    UMQUARTO("1/4"),
    TRESOITAVOS("3/8"),
    CINCOOITAVOS("5/8");

    private String descricao;
    private int comprimento;

    Ferro() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    Ferro(String descricao) {
        this.descricao = descricao;
    }

    Ferro(int comprimento) {
        this.comprimento = comprimento;
    }
}
