package Suberwey.Salada;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Alface extends Adicional {

    public Alface(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 2;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Alface";
    }
}
