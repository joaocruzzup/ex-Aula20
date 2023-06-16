package EX02_IN;

public class MainConta {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca("123", 5400);
        System.out.println(cp1.calcularTributos());

        ContaCorrente cc1 = new ContaCorrente("111", 4500);
        System.out.println(cc1.calcularTributos());

        SeguroDeVida sv1 = new SeguroDeVida();
        System.out.println(sv1.calcularTributos());
    }
}
