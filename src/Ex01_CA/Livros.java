package Ex01_CA;

public class Livros extends Produtos{
    private String autor;

    public Livros(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Nome: %s %n" +
                "Preço: R$ %.2f %n" +
                "Autor: %s %n",
                getNome(), getPreco(),getAutor());
    }
}
