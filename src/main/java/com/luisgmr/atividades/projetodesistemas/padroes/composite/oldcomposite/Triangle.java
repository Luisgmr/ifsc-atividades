package com.luisgmr.atividades.projetodesistemas.padroes.composite.oldcomposite;

public class Triangle implements Shape {

    public Triangle() {}

    @Override
    public void draw(String cor) {
        System.out.println("Triangle: cor = " + cor);
    }
}
