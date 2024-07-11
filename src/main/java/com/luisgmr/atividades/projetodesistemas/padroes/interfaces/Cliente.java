package com.luisgmr.atividades.projetodesistemas.padroes.interfaces;

public class Cliente {
    public static void main(String[] args) {
        FormaGeometrica forma = new Quadrado(4F);

        FormaGeometrica[] formas = new FormaGeometrica[]{new Quadrado(4F), new Circulo(4F)};

        for (FormaGeometrica f : formas) {
            System.out.println(f.calcularArea());
        }
    }

}
