package Suberwey.Carne;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Peru extends Adicional {

    public Peru(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 10;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Peru";
    }
}
