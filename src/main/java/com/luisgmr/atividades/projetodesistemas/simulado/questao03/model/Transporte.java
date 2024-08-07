package com.luisgmr.atividades.projetodesistemas.simulado.questao03.model;

import com.luisgmr.atividades.projetodesistemas.simulado.questao03.interfaces.EstrategiaDeTransporte;

public class Transporte {
    private EstrategiaDeTransporte strategy;

    public Transporte() {
    }

    public Transporte(EstrategiaDeTransporte strategy) {
        this.strategy = strategy;
    }

    public Double calcularCusto() {
        return strategy.calcularCusto();
    }

    public Integer calcularTempoDeEntrega() {
        return strategy.calcularTempoDeEntrega();
    }

    public void setStrategy(EstrategiaDeTransporte strategy) {
        this.strategy = strategy;
    }

    public EstrategiaDeTransporte getStrategy() {
        return strategy;
    }
}
