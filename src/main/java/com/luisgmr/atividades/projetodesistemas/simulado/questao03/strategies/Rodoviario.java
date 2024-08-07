package com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies;

import com.luisgmr.atividades.projetodesistemas.simulado.questao03.interfaces.EstrategiaDeTransporte;

public class Rodoviario implements EstrategiaDeTransporte {
    @Override
    public Double calcularCusto() {
        return 500.0;
    }

    @Override
    public Integer calcularTempoDeEntrega() {
        return 10;
    }
}
