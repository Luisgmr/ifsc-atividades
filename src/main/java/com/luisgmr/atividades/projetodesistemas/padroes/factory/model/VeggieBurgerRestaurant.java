package com.luisgmr.atividades.projetodesistemas.padroes.factory.model;

import com.luisgmr.atividades.projetodesistemas.padroes.factory.abstracts.Restaurant;
import com.luisgmr.atividades.projetodesistemas.padroes.factory.interfaces.Burger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Montando hamburger vegano...");
        return new VeggieBurger();
    }
}
