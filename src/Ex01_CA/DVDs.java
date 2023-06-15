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
    public int hashCode() {
        return Objects.hash(duracao);
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Código de barras: %s %n" +
                "Nome: %s %n" +
                "Preço: R$ %.2f %n" +
                "Duração: %.2f minutos %n",
                getCodigoDeBarras(), getNome(), getPreco(), getDuracao());
    }
}
