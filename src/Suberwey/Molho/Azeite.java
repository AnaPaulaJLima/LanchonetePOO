package Suberwey.Molho;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Azeite extends Adicional {

    public Azeite(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 1;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Azeite";
    }
}
