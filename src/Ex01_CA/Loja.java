package Ex01_CA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> listaProdutos = new ArrayList<>();

        // Instanciando Objetos e Adicionando os objetos na lista
        listaProdutos.add(new Livros("1", "Harry Potter", 54.3F, "J.K"));
        listaProdutos.add(new Livros("2", "Senhor dos anéis - Anéis do poder", 44.5F, "R. R. Tolkien"));
        listaProdutos.add(new DVDs("3", "Xuxa só para baixinhos", 20.5F, 54.3F));
        listaProdutos.add(new CDs("4", "Anavitoria - O tempo é agora", 28.5F, 20));
        listaProdutos.add(new CDs("5", "Rubel - Pearl", 30.5F, 30));

        System.out.println("-------------------------------------------");
        System.out.println("Boas vindas ao seu gerenciador de estoques!");
        System.out.println("-------------------------------------------");

        System.out.println("Escolha a opção que você deseja!");
        System.out.println("1. Ver estoque \n2. Buscar produto \n3. Duplicar Produtos");
        System.out.println("Digite a opção: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("--------------------------- Menu Estoque ---------------------------");
                imprimirProdutos(listaProdutos);
                break;
            case 2:
                System.out.println("---------- Menu Buscar por Código de Barras ----------");
                System.out.println(buscarPorCodigo(listaProdutos));
                break;
            case 3:
                System.out.println("---------- Menu Duplicar Produtos ----------");
                System.out.println("Digite o indíce do produto que deseja duplicar: ");
                int indice = sc.nextInt();
                escolherProdutoEDuplicar(indice, listaProdutos);
                System.out.println("Produto duplicado!");
                System.out.println("Digite enter para ver a nova lista");
                sc.nextLine(); sc.nextLine();
                imprimirProdutos(listaProdutos);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
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

    public static void escolherProdutoEDuplicar(int indice, List<Produtos> lista){
        Produtos prod = lista.get(indice);
        Produtos produtoNovo1 = null;
        Produtos produtoNovo2 = null;
        if (prod instanceof Livros){
            produtoNovo1 = new Livros(prod.getCodigoDeBarras(), prod.getNome(), prod.getPreco(), ((Livros) prod).getAutor());
            produtoNovo2 = new Livros("52241", prod.getNome(), prod.getPreco(), ((Livros) prod).getAutor());
        }
        else if (prod instanceof CDs){
            produtoNovo1 = new CDs(prod.getCodigoDeBarras(), prod.getNome(), prod.getPreco(), ((CDs) prod).getNumeroDeFaixas());
            produtoNovo2 = new CDs("52241", prod.getNome(), prod.getPreco(), ((CDs) prod).getNumeroDeFaixas());
        }
        else if (prod instanceof DVDs){
            produtoNovo1 = new DVDs(prod.getCodigoDeBarras(), prod.getNome(), prod.getPreco(), ((DVDs) prod).getDuracao());
            produtoNovo2 = new DVDs("52241", prod.getNome(), prod.getPreco(), ((DVDs) prod).getDuracao());
        }
        if (produtoNovo1 != null && produtoNovo1.equals(prod) && produtoNovo2 != null ){
            lista.add(produtoNovo1);
            lista.add(produtoNovo2);
        }
    }
}
