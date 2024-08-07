package com.luisgmr.atividades.projetodesistemas.simulado.questao04.model;

import com.luisgmr.atividades.projetodesistemas.padroes.interfaces.testemaluco.Pedido;
import com.luisgmr.atividades.projetodesistemas.simulado.questao04.interfaces.Observer;
import com.luisgmr.atividades.projetodesistemas.simulado.questao04.interfaces.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Servico implements Subject {

    private List<Observer> subscribers;
    private List<Pedido> pedido;

    @Override
    public void register(Observer s) {
        subscribers.add(s);
    }

    @Override
    public void unregister(Observer s) {
        subscribers.remove(s);
    }

    @Override
    public void notifyObservers() {
        for (Observer s : subscribers) {
            s.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return null;
    }
}
