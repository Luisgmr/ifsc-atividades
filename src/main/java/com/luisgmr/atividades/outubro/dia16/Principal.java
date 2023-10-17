package com.luisgmr.atividades.outubro.dia16;

import javax.swing.*;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        Medicamento[] medicamentos = new Medicamento[10];
        Integer index = 0;
        Integer opcao = menu();
        while (opcao != 0) {
            if (opcao == 1) {
                if (index < 10) {
                    String title = "Cadastro do " + (index + 1) + "º medicamento\n\n";
                    medicamentos[index] = new Medicamento(
                            JOptionPane.showInputDialog(title + "Digite o nome do medicamento"),
                            Integer.parseInt(JOptionPane.showInputDialog(title + "Digite a quantidade desse medicamento")),
                            Integer.parseInt(JOptionPane.showInputDialog(title + "Digite a quantidade por dose desse medicamento")),
                            LocalTime.now()
                    );
                    JOptionPane.showMessageDialog(null, "O medicamento " + medicamentos[index].getNome() + " foi adicionado");
                    index++;
                } else {
                    JOptionPane.showMessageDialog(null, "O limite de 10 medicamentos já foi atingido.");
                }
            } else if (opcao == 2) {
                String listaMed = "";
                for (int i = 0; i < 10; i++) {
                    if (medicamentos[i] != null) {
                        listaMed += medicamentos[i] + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, "Lista de medicamentos cadastrados:\n\n" + listaMed);
            } else if (opcao == 3) {
                String listaMed = "";
                for (int i = 0; i < 10; i++) {
                    if (medicamentos[i] != null) {
                        listaMed += "Posição " + i + ": " + medicamentos[i] + "\n";
                    }
                }
                Integer posicao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o medicamento através da posição\n\n" + listaMed));
                if (medicamentos[posicao] != null) {
                    medicamentos[posicao].administracao();
                } else {
                    JOptionPane.showMessageDialog(null, "Esse medicamento não existe.");
                }
            } else if (opcao == 4) {
                for (Medicamento m : medicamentos) {
                    if (m != null) {
                        m.reset();
                    }
                }
                JOptionPane.showMessageDialog(null, "O status de todos os medicamentos foram resetados.");
            }
            opcao = menu();
        }
    }

    public static Integer menu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "Menu de medicamentos:\n" +
                        "1- Cadastrar medicamentos\n" +
                        "2- Listar medicamentos\n" +
                        "3- Administrar um medicamento\n"+
                        "4- Reiniciar o status dos medicamentos\n\n0- Sair"));
    }


}
