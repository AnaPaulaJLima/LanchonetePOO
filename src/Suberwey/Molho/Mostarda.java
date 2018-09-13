package Suberwey.Molho;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Mostarda extends Adicional {

    public Mostarda(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 2;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Mostarda";
    }
}
