package Suberwey.Carne;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Presunto extends Adicional {

    public Presunto(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 4;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Presunto";
    }
}
