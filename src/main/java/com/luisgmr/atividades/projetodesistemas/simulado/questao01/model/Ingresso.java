package com.luisgmr.atividades.projetodesistemas.simulado.questao01.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Ingresso {

    private String dia;
    private Float valor;
    private Integer numero;
    private boolean valido;
    private Float taxaServico;
    private Portador portador;

    public Ingresso(String dia, Float valor, Integer numero, Portador portador) {
        this.dia = dia;
        this.valor = valor;
        this.numero = numero;
        this.portador = portador;
    }

    public Float calculaValorIngresso() {
        return valor + taxaServico;
    }

}
