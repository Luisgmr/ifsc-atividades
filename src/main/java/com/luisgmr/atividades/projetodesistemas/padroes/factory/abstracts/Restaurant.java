package com.luisgmr.atividades.projetodesistemas.padroes.factory.abstracts;

import com.luisgmr.atividades.projetodesistemas.padroes.factory.interfaces.Burger;

import javax.swing.*;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Novo pedido de hamburger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();

}
