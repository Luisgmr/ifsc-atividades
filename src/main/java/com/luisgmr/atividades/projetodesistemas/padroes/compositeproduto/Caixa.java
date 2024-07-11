package com.luisgmr.atividades.projetodesistemas.padroes.compositeproduto;


import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {

    List<Component> children = new ArrayList<>();

    public void addChild(Component child) {
        children.add(child);
    }

    public void removeChild(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public Double execute() {
        Double valor = 0.0;
        for (Component child : children) {
            valor += child.execute();
        }
        return valor;
    }
}
