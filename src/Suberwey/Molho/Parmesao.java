package Suberwey.Molho;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Parmesao extends Adicional {

    public Parmesao(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 3;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Parmesao";
    }
}
