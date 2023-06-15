package Ex01_CA;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> listaProdutos =new ArrayList<>();

        Produtos livro1 = new Livros("1","Harry Potter", 54.3F, "J.K");
        Produtos livro2 = new Livros("1", "Senhor dos anéis - Anéis do poder", 44.5F, "R. R. Tolkien" );
        Produtos Dvd1 = new DVDs("3", "Xuxa só para baixinhos", 20.5F, 54.3F);
        Produtos Cd1 = new CDs("4", "Anavitoria - O tempo é agora", 28.5F, 20);
        Produtos Cd2 = new CDs("5", "Rubel - Pearl", 30.5F, 30);

        listaProdutos.add(livro1);
        listaProdutos.add(livro2);
        listaProdutos.add(Dvd1);
        listaProdutos.add(Cd1);
        listaProdutos.add(Cd2);

        for (Produtos produto: listaProdutos) {
            produto.mostrarDetalhesDoItem();
        }

        System.out.println(livro1.equals(livro2));
    }
}
