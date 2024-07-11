package com.luisgmr.atividades.projetodesistemas.padroes.observer.model;

import com.luisgmr.atividades.projetodesistemas.padroes.observer.interfaces.Observer;
import com.luisgmr.atividades.projetodesistemas.padroes.observer.interfaces.Subject;

import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers;
    private String message;

    public ConcreteSubject(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
}
