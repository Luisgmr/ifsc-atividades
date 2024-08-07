package com.luisgmr.atividades.projetodesistemas.simulado.questao01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
public class Local {
    private String cidade;
    private String uf;
    private String endereco;
    private String complemento;
}
