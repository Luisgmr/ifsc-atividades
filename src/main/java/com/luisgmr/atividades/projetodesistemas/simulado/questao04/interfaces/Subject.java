package com.luisgmr.atividades.projetodesistemas.simulado.questao04.interfaces;

public interface Subject {
    public void register(Observer s);
    public void unregister(Observer s);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}
