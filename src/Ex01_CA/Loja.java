package Ex01_CA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> listaProdutos = new ArrayList<>();

        Produtos livro1 = new Livros("1", "Harry Potter", 54.3F, "J.K");
        Produtos livro2 = new Livros("2", "Senhor dos anéis - Anéis do poder", 44.5F, "R. R. Tolkien");
        Produtos Dvd1 = new DVDs("3", "Xuxa só para baixinhos", 20.5F, 54.3F);
        Produtos Cd1 = new CDs("4", "Anavitoria - O tempo é agora", 28.5F, 20);
        Produtos Cd2 = new CDs("5", "Rubel - Pearl", 30.5F, 30);

        listaProdutos.add(livro1);
        listaProdutos.add(livro2);
        listaProdutos.add(Dvd1);
        listaProdutos.add(Cd1);
        listaProdutos.add(Cd2);

        // Impressão da lista
        imprimirProdutos(listaProdutos);

        // Busca dos produtos
        System.out.println(buscarPorCodigo(listaProdutos));

    }

    public static String buscarPorCodigo(List<Produtos> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        String codigoDeBarras = sc.next();

        for (Produtos produto : lista) {
            boolean igual = produto.getCodigoDeBarras().equals(codigoDeBarras);
            if (igual) {
                int indice = lista.indexOf(produto);
                System.out.println("Indice: " + indice);
                return lista.get(indice).mostrarDetalhesDoItem();
            }
        }
        return "O código de barras informado não foi identificado";
    }

    public static void imprimirProdutos(List<Produtos> lista){
        int i = 1;
        for (Produtos produto : lista) {
            System.out.print("Produto " + i + ": ");
            System.out.println(produto.mostrarDetalhesDoItem());
            i++;
        }
    }
}
