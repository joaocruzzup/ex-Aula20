package EX02_IN;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a opção:");
        System.out.println("1. Calcular tributos da Conta Poupança");
        System.out.println("2. Calcular tributos da Conta Corrente");
        System.out.println("3. Calcular tributos do Seguro de Vida");
        System.out.print("Digite o número da opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                ContaPoupanca cp1 = new ContaPoupanca("123", 5400);
                System.out.println("Saldo da Conta Poupança: R$" + cp1.getSaldo());
                System.out.println("Tributos da Conta Poupança: R$" + cp1.calcularTributos());
                break;
            case 2:
                ContaCorrente cc1 = new ContaCorrente("111", 4500);
                System.out.println("Saldo da Conta Corrente: R$" + cc1.getSaldo());
                System.out.println("Tributos da Conta Corrente: R$" + cc1.calcularTributos());
                break;
            case 3:
                SeguroDeVida sv1 = new SeguroDeVida();
                System.out.println("Tributos do Seguro de Vida: R$" + sv1.calcularTributos());
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

