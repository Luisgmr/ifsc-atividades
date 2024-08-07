package com.luisgmr.atividades.projetodesistemas.simulado.questao04.model;

import com.luisgmr.atividades.projetodesistemas.simulado.questao04.interfaces.Observer;
import com.luisgmr.atividades.projetodesistemas.simulado.questao04.interfaces.Subject;

public class Funcionario implements Observer {

    private String name;
    private Subject topic;

    @Override
    public void update() {
    }

    @Override
    public void setSubject(Subject subject) {

    }
}
