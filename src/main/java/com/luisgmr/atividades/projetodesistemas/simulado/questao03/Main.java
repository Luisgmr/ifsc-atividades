package com.luisgmr.atividades.projetodesistemas.simulado.questao03;

import com.luisgmr.atividades.projetodesistemas.simulado.questao03.model.Transporte;
import com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies.Aereo;
import com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies.Maritmo;
import com.luisgmr.atividades.projetodesistemas.simulado.questao03.strategies.Rodoviario;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção de transporte \n\n" +
                "1- Transporte aéreo\n" +
                "2- Transporte marítmo\n" +
                "3- Transporte rodoviário\n\n" +
                "0- Sair"));

        while (opcao != 0) {
            if (opcao == 1) {
                transporte.setStrategy(new Aereo());
                break;
            } else if (opcao == 2) {
                transporte.setStrategy(new Maritmo());
                break;
            } else if (opcao == 3) {
                transporte.setStrategy(new Rodoviario());
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

        JOptionPane.showMessageDialog(null,
                "Tipo de transporte escolhido: " + transporte.getStrategy().getClass().getSimpleName() + "\n" +
                "O custo do transporte é: " + transporte.calcularCusto() + "\n" +
                "O tempo de entrega: " + transporte.calcularTempoDeEntrega());

    }

}
