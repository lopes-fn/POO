package ads.poo;

import java.util.HashMap;
import java.util.ArrayList;

public class AppLivraria {
    private HashMap<String, Livro> livros;

    public AppLivraria()
    {
        this.livros = new HashMap<>();
    } 
    public static void main(String[] args) {
        
        AppLivraria app = new AppLivraria();
        
        ArrayList<Autor> a1 = new ArrayList();
        a1.add(new Autor("Machado de Assis", "Brasileiro"));

        Livro l1 = new Livro("Dom Casmurro", 30.0, a1, "9788594318602");

        app.livros.put(l1.getIsbn(), l1);

        ArrayList<Autor> a2 = new ArrayList();
        a2.add(new Autor("Graciliano Ramos", "Brasileiro"));

        Livro l2 = new Livro("Vidas Secas", 30.0, a2, "9788501114785");

        app.livros.put(l2.getIsbn(), l2);


        app.livros.forEach((c,v)->{
            System.out.println("Titulo do Livro: " + v.getTitulo());
            System.out.println("Autores do Livro: " + v.getAutores());
            System.out.println("Preço do Livro: " + v.getPreco());
            System.out.println("ISBN do Livro: " + v.getIsbn());
        });

    }

}
