package com.luisgmr.atividades.outubro.dia24.atleta;

public class Atleta {
    private String nome;
    private int idade;
    private char sexo;
    private int numeroCamisa;
    private int numeroGols;

    public Atleta(String nome, int idade, char sexo, int numeroCamisa, int numeroGols) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numeroCamisa = numeroCamisa;
        this.numeroGols = numeroGols;
    }

    public char getSexo() {
        return sexo;
    }

    private String getSexoStr() {
        return sexo == 'M' ? "Homem" : "Mulher";
    }


    public int getNumeroGols() {
        return numeroGols;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + getSexoStr() + ", Gols: " + numeroGols + ", Camisa: " + numeroCamisa;
    }
}
