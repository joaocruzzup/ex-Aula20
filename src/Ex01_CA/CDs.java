package Ex01_CA;

public class CDs extends Produtos{
    private int numeroDeFaixas;

    public CDs(String nome, float preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Nome: %s %n" +
                "Preço: R$ %.2f %n" +
                "Número de Faixas: %d %n"
                ,getNome(), getPreco(), getNumeroDeFaixas());
    }
}
