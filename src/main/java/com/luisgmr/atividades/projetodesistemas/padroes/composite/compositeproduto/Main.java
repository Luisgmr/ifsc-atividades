package com.luisgmr.atividades.projetodesistemas.padroes.composite.compositeproduto;

public class Main {

    public static void main(String[] args) {
        Caixa caixaMaior = new Caixa();
        Caixa caixaDoMartelo = new Caixa();
        Caixa caixaDupla = new Caixa();
        Caixa caixaCelular = new Caixa();
        Caixa caixaCarregador = new Caixa();
        Martelo martelo = new Martelo("Martelo", 20.0);
        Telefone telefone = new Telefone("Telefone", 4000.0);
        FoneDeOuvido foneDeOuvido = new FoneDeOuvido("Fone de Ouvido", 200.0);
        Carregador carregador = new Carregador("Carregador", 150.0);

        caixaDoMartelo.addChild(martelo);

        caixaCelular.addChild(telefone);
        caixaCelular.addChild(foneDeOuvido);

        caixaCarregador.addChild(carregador);

        caixaDupla.addChild(caixaCelular);
        caixaDupla.addChild(caixaCarregador);

        caixaMaior.addChild(caixaDoMartelo);
        caixaMaior.addChild(caixaDupla);

        System.out.println("Valor da caixa: " + caixaMaior.execute());
    }

}
