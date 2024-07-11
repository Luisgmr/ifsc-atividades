package com.luisgmr.atividades.projetodesistemas.padroes.oldcomposite;

public class Circle implements Shape {

    public Circle() {

    }

    @Override
    public void draw(String cor) {
        System.out.println("Circle cor = " + cor);
    }

}
