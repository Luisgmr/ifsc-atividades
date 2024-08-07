package com.luisgmr.atividades.projetodesistemas.simulado.questao01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
public class Evento {
    private Integer codigo;
    private String nome;
    private String periodo;
    private Integer capacidade;
    private Local local;
    private Ingresso[] ingressos;
}
