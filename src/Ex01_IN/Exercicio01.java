package Ex01_IN;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoLampada = sc.next();

        FabricaLampada fabricaLampada = new FabricaLampada();
        Lampada lampada = fabricaLampada.construir(tipoLampada);

        lampada.ligar();
        lampada.desligar();

    }
}
