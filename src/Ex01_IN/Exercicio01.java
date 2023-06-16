package Ex01_IN;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de lampada: (Incandescente/Fluorescente)" );
        String tipoLampada = sc.next();

        FabricaLampada fabricaLampada = new FabricaLampada();
        Lampada lampada = (Lampada) fabricaLampada.construir(tipoLampada);

        lampada.ligar();
        lampada.desligar();

    }
}
