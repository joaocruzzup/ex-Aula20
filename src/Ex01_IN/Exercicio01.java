package Ex01_IN;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        imprimirMenu();
    }

    public static void imprimirMenu(){
        System.out.println("---------------------------------------");
        System.out.println("Boas vindas ao controlador de lâmpadas!");
        System.out.println("---------------------------------------");

        System.out.println("Você gostaria de controlar qual tipo de lâmpada? ");
        System.out.println("Digite 'F' para Fluorescente");
        System.out.println("Digite 'I' para Incandescente");
        System.out.print("Digite aqui: ");
        Scanner sc = new Scanner(System.in);
        String digito = sc.next();

        while (!(digito.equalsIgnoreCase("f") || digito.equalsIgnoreCase("i"))){
            System.out.println("Digite 'F' para Fluorescente");
            System.out.println("Digite 'I' para Incandescente");
            System.out.print("Digite aqui: ");
            digito = sc.next();
        }

        if (digito.equalsIgnoreCase("f")){
            FabricaLampada fabricaLampada = new FabricaLampada();
            Lampada lampada = (Lampada) fabricaLampada.construir("fluorescente");

            System.out.println("------------------------------------------------");
            System.out.println("Perfeito, vamos alterar sua lâmpada Fluorescente");
            System.out.println("1- ligar\n2- desligar\nDigite a opção: ");
            int opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("***************");
                lampada.ligar();
                System.out.println("**************");
            } else {
                System.out.println("***************");
                lampada.desligar();
                System.out.println("***************");
            }
        }
        else if (digito.equalsIgnoreCase("i")){
            FabricaLampada fabricaLampada = new FabricaLampada();
            Lampada lampada = (Lampada) fabricaLampada.construir("incandescente");

            System.out.println("------------------------------------------------");
            System.out.println("Perfeito, vamos alterar sua lâmpada Fluorescente");
            System.out.println("1- ligar\n2- desligar\nDigite a opção: ");
            int opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("***************");
                lampada.ligar();
                System.out.println("***************");
            } else {
                System.out.println("***************");
                lampada.desligar();
                System.out.println("***************");
            }
        }
    }
}
