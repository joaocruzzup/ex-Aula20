package Ex01_CA;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> listaProdutos =new ArrayList<>();

        Produtos livro1 = new Livros("Harry Potter", 54.3F, "J.K");
        Produtos livro2 = new Livros("Senhor dos anéis - Anéis do poder", 44.5F, "R. R. Tolkien" );
        Produtos Dvd1 = new DVDs("Xuxa só para baixinhos", 20.5F, 54.3F);
        Produtos Cd1 = new CDs("Anavitoria - O tempo é agora", 28.5F, 20);
        Produtos Cd2 = new CDs("Rubel - Pearl", 30.5F, 30);

        listaProdutos.add(livro1);
        listaProdutos.add(livro2);
        listaProdutos.add(Dvd1);
        listaProdutos.add(Cd1);
        listaProdutos.add(Cd2);

        Cd1.mostrarDetalhesDoItem();
    }
}
