package com.luisgmr.atividades.projetodesistemas.padroes.interfaces;

public class Circulo implements FormaGeometrica {

    Float radius;

    public Circulo(Float radius) {
        this.radius = radius;
    }

    @Override
    public Float calcularArea() {
        return (float) (Math.PI * radius * radius);
    }

}
