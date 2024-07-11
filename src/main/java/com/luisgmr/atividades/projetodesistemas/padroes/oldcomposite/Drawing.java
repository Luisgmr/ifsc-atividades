package com.luisgmr.atividades.projetodesistemas.padroes.oldcomposite;

import java.util.List;

public class Drawing implements Shape {

    private List<Shape> children;

    public void addChildren(Shape children) {
        this.children.add(children);
    }

    public void removeChildren() {
        this.children.remove(children);
    }

    public List<Shape> getChildren() {
        return children;
    }

    public Drawing() {
    }

    @Override
    public void draw(String cor) {
        for (Shape child : children) {
            child.draw(cor);
        }
    }

    public void clear() {
        children.clear();
    }

}
