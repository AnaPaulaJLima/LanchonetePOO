package Suberwey.Pao;

import Suberwey.Abstratos.Lanche;

public class Tradicional extends Lanche {
    @Override
    public double preco() {
        return 4;
    }

    @Override
    public String getDescricao() {
        return "Pão Tradicional";
    }
}
