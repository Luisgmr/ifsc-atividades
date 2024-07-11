package com.luisgmr.atividades.projetodesistemas.padroes.observer.model;

import com.luisgmr.atividades.projetodesistemas.padroes.observer.interfaces.Observer;
import com.luisgmr.atividades.projetodesistemas.padroes.observer.interfaces.Subject;

public class ConcreteObserver implements Observer {

    private String name;
    private Subject topic;

    public ConcreteObserver(Subject topic, String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
