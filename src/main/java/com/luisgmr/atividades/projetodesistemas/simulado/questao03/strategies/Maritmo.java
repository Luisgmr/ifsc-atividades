package com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies;

import com.luisgmr.atividades.projetodesistemas.simulado.questao03.interfaces.EstrategiaDeTransporte;

public class Maritmo implements EstrategiaDeTransporte {
    @Override
    public Double calcularCusto() {
        return 1000.0;
    }

    @Override
    public Integer calcularTempoDeEntrega() {
        return 4;
    }
}
