package com.luisgmr.atividades.projetodesistemas.simulado.questao02.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Funcionario {

    private String nome;
    private String departamento;
    private Double salario;
    private List<Funcionario> subordinados;

    public Funcionario(String nome, String departamento, Double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        subordinados = new ArrayList<>();
    }

    public void add(Funcionario funcionario) {
        subordinados.add(funcionario);
    }

    public void remove(Funcionario funcionario) {
        subordinados.remove(funcionario);
    }

}
