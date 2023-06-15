package Ex01_CA;

public class Livros extends Produtos{
    private String autor;

    public Livros(String codigoDeBarras, String nome, float preco, String autor) {
        super(codigoDeBarras, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String mostrarDetalhesDoItem() {
        return "[ Código de barras: " + getCodigoDeBarras() +
                " | Nome: " + getNome() + " | Preço: " + getPreco() +
                " | Autor: " + getAutor() + " ]";
    }
}
