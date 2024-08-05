package com.luisgmr.atividades.projetodesistemas.padroes.factory;

import com.luisgmr.atividades.projetodesistemas.padroes.factory.abstracts.Restaurant;
import com.luisgmr.atividades.projetodesistemas.padroes.factory.model.BeefBurgerRestaurant;
import com.luisgmr.atividades.projetodesistemas.padroes.factory.model.VeggieBurgerRestaurant;

public class MainFactory {

    public static void main(String[] args) {
        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();

        Restaurant veggie = new VeggieBurgerRestaurant();
        veggie.orderBurger();
    }

}
