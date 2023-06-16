package EX02_IN;

public class ContaPoupanca extends Conta implements Tributavel{
    public ContaPoupanca(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public double calcularTributos() {
        return 0.0;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

}
