package com.luisgmr.atividades.projetodesistemas.simulado.questao01;

import com.luisgmr.atividades.projetodesistemas.simulado.questao01.model.Evento;
import com.luisgmr.atividades.projetodesistemas.simulado.questao01.model.Ingresso;
import com.luisgmr.atividades.projetodesistemas.simulado.questao01.model.Local;
import com.luisgmr.atividades.projetodesistemas.simulado.questao01.model.Portador;

public class Main {

    public static void main(String[] args) {
        Local local = new Local("Tubarão", "SC", "Antônio Hulse", "Nº 100");
        Portador portadorLuis = new Portador("123.456.789-10", "Luis Gustavo Miranda", "4002-8922");
        Portador portadorLorenzo = new Portador("101.456.790-10", "Lorenzo Uliano", "4112-8933");
        Ingresso ingresso1 = new Ingresso("06/08/2024", 150f, 1, portadorLuis);
        Ingresso ingresso2 = new Ingresso("06/08/2024", 150f, 2, portadorLuis);
        Ingresso ingresso3 = new Ingresso("06/08/2024", 75f, 3, portadorLorenzo);
        Evento evento = new Evento(1, "Jorge e Matheus", "?", 3000, local, new Ingresso[]{ingresso1, ingresso2, ingresso3});
        System.out.println(evento);
    }

}
