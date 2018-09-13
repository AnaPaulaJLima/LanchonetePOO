package Suberwey.Carne;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Peixe extends Adicional {

    public Peixe(Lanche lanche) {
        super(lanche);
    }

    @Override
    public double preco() {
        return lanche.preco() + 8;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Peixe";
    }
}
