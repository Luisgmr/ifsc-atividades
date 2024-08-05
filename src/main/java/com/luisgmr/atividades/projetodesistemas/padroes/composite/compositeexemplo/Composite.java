package com.luisgmr.atividades.projetodesistemas.padroes.composite.compositeexemplo;

import java.util.List;

public class Composite implements Component {

    List<Component> children;

    public void addChildren(Component child) {
        children.add(child);
    }

    public void removeChildren(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        for (Component child : children) {
            child.execute();
        }
    }
}
