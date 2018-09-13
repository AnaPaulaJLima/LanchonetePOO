package Suberwey.Salada;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Tomate extends Adicional {

    public Tomate(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 3;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Tomate";
    }
}
