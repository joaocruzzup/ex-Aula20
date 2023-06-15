package Ex01_CA;

public class DVDs extends Produtos{
    private float duracao;

    public DVDs(String nome, float preco, float duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Nome: %s %n" +
                "Preço: R$%.2f %n" +
                "Duração: %.2f %n minutos",
                getNome(), getPreco(), getDuracao());
    }
}
