package Suberwey.Abstratos;

public abstract class Lanche {

    public abstract double preco();

    public abstract String getDescricao();

    @Override
    public String toString() {
        return getDescricao() + "\nR$"+ preco();
    }
}
