package Suberwey.Carne;

import Suberwey.Abstratos.Adicional;
import Suberwey.Abstratos.Lanche;

public class Rosbife extends Adicional {

    public Rosbife(Lanche adicional) {
        super(adicional);
    }

    @Override
    public double preco() {
        return lanche.preco() + 7;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Rosbife";
    }
}
