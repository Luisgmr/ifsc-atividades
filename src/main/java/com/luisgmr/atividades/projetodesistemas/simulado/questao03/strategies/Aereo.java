package com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies;

import com.luisgmr.atividades.projetodesistemas.simulado.questao03.interfaces.EstrategiaDeTransporte;

public class Aereo implements EstrategiaDeTransporte {
    @Override
    public Double calcularCusto() {
        return 2000.0;
    }

    @Override
    public Integer calcularTempoDeEntrega() {
        return 1;
    }
}
