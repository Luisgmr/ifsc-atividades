package com.luisgmr.atividades.projetodesistemas.padroes.factory.model;

import com.luisgmr.atividades.projetodesistemas.padroes.factory.interfaces.Burger;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparando hamburger de carne...");
    }
}
