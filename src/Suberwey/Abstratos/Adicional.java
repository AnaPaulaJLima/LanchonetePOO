package Suberwey.Abstratos;

public abstract class Adicional extends Lanche {

    protected Lanche lanche;

    public Adicional(Lanche adicional) {
        this.lanche = adicional;
    }
}
