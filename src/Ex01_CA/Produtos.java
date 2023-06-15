package Ex01_CA;

import java.util.Objects;

public abstract class Produtos {
    private String codigoDeBarras;
    private String nome;
    private float preco;

    public Produtos(String codigoDeBarras, String nome, float preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public abstract String mostrarDetalhesDoItem();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(getCodigoDeBarras(), produtos.getCodigoDeBarras());
    }
}
