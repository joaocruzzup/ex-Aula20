package Ex01_CA;

import java.util.Objects;

public class DVDs extends Produtos{
    private float duracao;

    public DVDs(String codigoDeBarras, String nome, float preco, float duracao) {
        super(codigoDeBarras, nome, preco);
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return "[ Código de barras: " + getCodigoDeBarras() +
                " | Nome: " + getNome() + " | Preço: " + getPreco() +
                " | Duração: " + getDuracao() + "min ]";
    }
}
