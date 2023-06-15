package Ex01_CA;

public abstract class Produtos {
    private String nome;
    private float preco;

    public Produtos(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public abstract void mostrarDetalhesDoItem();
}
