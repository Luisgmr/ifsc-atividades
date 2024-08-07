package com.luisgmr.atividades.projetodesistemas.padroes.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Database.getInstance().getConnection();
    }

}
