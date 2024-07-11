package com.luisgmr.atividades.projetodesistemas.padroes.interfaces;

public class Quadrado implements FormaGeometrica {

    Float lado;

    public Quadrado(Float lado) {
        this.lado = lado;
    }

    @Override
    public Float calcularArea() {
        return (float) Math.pow(lado, 2);
    }
}
