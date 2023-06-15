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
    public String mostrarDetalhesDoItem() {
        return "[ Código de barras: " + getCodigoDeBarras() +
                " | Nome: " + getNome() + " | Preço: " + getPreco() +
                " | Número de faixas: " + getNumeroDeFaixas() + " ]";
    }
}
