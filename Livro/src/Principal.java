import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new LivroFisico(
                "A Ilha Perdida",
                "Maria José Dupré",
                102,
                1
        ));

        livros.add(new Ebook(
                "Perdido em Marte",
                "Andy Weir",
                210,
                3
        ));

        for (Livro livro : livros) {
            livro.descricao();
            System.out.println("------------------------------------");
        }
    }
}
