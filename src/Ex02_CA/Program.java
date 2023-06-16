package Ex02_CA;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Forma[] arrayFormas = gerarListaFormasAleatorias();

        // Printando as formas com áreas e perímetros
        int i = 1;
        for (Forma forma: arrayFormas) {
            System.out.print("Forma " + i + ": ");
            System.out.println(forma.mostrarInformacao());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("-------------------------------------------------------");
            i++;
        }

    }

    public static float gerarNumero(int minRange, int maxRange){
        Random random = new Random();
        return random.nextFloat() * (maxRange - minRange) + minRange;
    }

    public static Forma[] gerarListaFormasAleatorias(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas formas você deseja gerar? ");
        System.out.print("Digite aqui: ");
        int quantidade = sc.nextInt();

        Random random = new Random();
        Forma[] arrayFormas = new Forma[quantidade];
        for (int i = 0; i < quantidade; i++){
            int numAleatorio = random.nextInt(3) + 1;
            if (numAleatorio == 1){
                arrayFormas[i] = new Circulo(gerarNumero(1, 10));
            }
            if (numAleatorio == 2){
                arrayFormas[i] = new Quadrado(gerarNumero(1, 10));
            }
            if (numAleatorio == 3){
                arrayFormas[i] = new Retangulo(gerarNumero(1, 10), gerarNumero(1, 10));
            }
        }
        sc.close();
        return arrayFormas;
    }
}
