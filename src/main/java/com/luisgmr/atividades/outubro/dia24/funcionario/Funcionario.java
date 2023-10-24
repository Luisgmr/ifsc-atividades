package com.luisgmr.atividades.outubro.dia24.funcionario;

public class Funcionario {
    private String nome;
    private char sexo;
    private String cargo;
    private double salarioBase;
    private int horasExtras;
    private int numeroFilhos;

    public Funcionario(String nome, char sexo, String cargo, double salarioBase, int horasExtras, int numeroFilhos) {
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.numeroFilhos = numeroFilhos;
    }

    public double calcularSalario() {
        double salario = salarioBase + 23.50 * numeroFilhos + 39.50 * horasExtras;
        return salario;
    }

    public void mostrarDados() {
        System.out.println(nome + ", " + getSexoStr() + ", " + numeroFilhos + " filhos, no cargo " + cargo + ", ganhando R$" + calcularSalario() + ", com " + horasExtras + " horas extras.");
    }

    private String getSexoStr() {
        return sexo == 'M' ? "homem" : "mulher";
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getSalario() {
        return calcularSalario();
    }

    public char getSexo() {
        return sexo;
    }
}
