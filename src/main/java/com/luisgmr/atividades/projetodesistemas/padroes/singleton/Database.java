package com.luisgmr.atividades.projetodesistemas.padroes.singleton;

public class Database {

    private static Database db;

    public void getConnection() {
        System.out.println("Conexão aberta");
    }

    public static synchronized Database getInstance() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

}
