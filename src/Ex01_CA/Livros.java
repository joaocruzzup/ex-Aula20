package Ex01_CA;

import java.util.Objects;

public class Livros extends Produtos{
    private String autor;

    public Livros(String codigoDeBarras, String nome, float preco, String autor) {
        super(codigoDeBarras, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Código de barras: %s %n" +
                "Nome: %s %n" +
                "Preço: R$ %.2f %n" +
                "Autor: %s %n",
                getCodigoDeBarras(), getNome(), getPreco(),getAutor());
    }
}
