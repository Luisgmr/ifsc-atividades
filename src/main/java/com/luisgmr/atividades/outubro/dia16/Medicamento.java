package com.luisgmr.atividades.outubro.dia16;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Medicamento {

    private String nome;
    private Integer quantia;
    private Integer quantiaPorDose;
    private LocalTime hora;
    private String status;

    public Medicamento() {
    }

    public Medicamento(String nome, Integer quantia, Integer quantiaPorDose, LocalTime hora) {
        this.nome = nome;
        this.quantia = quantia;
        this.quantiaPorDose = quantiaPorDose;
        this.hora = hora;
        this.status = "AGUARDANDO";
    }

    public void administracao() {
        if (this.quantia >= quantiaPorDose) {
            this.status = "ADMINISTRADO";
            this.quantia = this.quantia-quantiaPorDose;
            JOptionPane.showMessageDialog(null, "Medicamento: " + nome + "\n\nSobraram " + this.quantia + " de medicamentos");
        } else {
            // Não pode
            JOptionPane.showMessageDialog(null, "Quantidade insuficiente.");
        }
    }

    public void reset() {
        this.status = "AGUARDANDO";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantia() {
        return quantia;
    }

    public void setQuantia(Integer quantia) {
        this.quantia = quantia;
    }

    public Integer getQuantiaPorDose() {
        return quantiaPorDose;
    }

    public void setQuantiaPorDose(Integer quantiaPorDose) {
        this.quantiaPorDose = quantiaPorDose;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = hora.format(formatter);
        return nome + ", com a quantia de " + quantia + " (" + quantiaPorDose + "/dose)" + ", status " + status + ", às " + horaFormatada;
    }

}
