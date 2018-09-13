package Suberwey.Carne;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Frango extends Adicional {

    public Frango(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 3;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Frango";
    }
}
