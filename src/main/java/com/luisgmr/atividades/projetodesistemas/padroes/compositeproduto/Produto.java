package com.luisgmr.atividades.projetodesistemas.padroes.compositeproduto;

public class Produto implements Component {

    public String nome;
    public Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + '}';
    }

    @Override
    public Double execute() {
        return valor;
    }
}
