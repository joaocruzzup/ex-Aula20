package Ex01_CA;

public class CDs extends Produtos{
    private int numeroDeFaixas;

    public CDs(String codigoDeBarras, String nome, float preco, int numeroDeFaixas) {
        super(codigoDeBarras, nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.printf(
                "Código de barras: %s %n" +
                "Nome: %s %n" +
                "Preço: R$ %.2f %n" +
                "Número de Faixas: %d %n",
                getCodigoDeBarras(), getNome(), getPreco(), getNumeroDeFaixas());
    }
}
