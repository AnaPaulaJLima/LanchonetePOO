package Suberwey.Salada;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Rucula extends Adicional {

    public Rucula(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 4;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Rucula";
    }
}
