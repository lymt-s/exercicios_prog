package ficha04.exercicio3;

public class MainLivraria {

    public static void main(String[] args) {

        // Cria objetos para cada tipo de livro
        LivroRomance romance1 = new LivroRomance("Orgulho e Preconceito", "Jane Austen", 1813, 29.90, 10, "Penguin");
        LivroRomance romance2 = new LivroRomance("O Grande Gatsby", "F. Scott Fitzgerald", 1925, 34.90, 5, "Scribner");

        LivroInfantil infantil1 = new LivroInfantil("O Menino Maluquinho", "Ziraldo", 1980, 19.90, 15, 5, 10);
        LivroInfantil infantil2 = new LivroInfantil("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 49.90, 8, 9, 12);

        LivroFiccaoCientifica ficcao1 = new LivroFiccaoCientifica("Dune", "Frank Herbert", 1965, 59.90, 12, "Espaço e Política");
        LivroFiccaoCientifica ficcao2 = new LivroFiccaoCientifica("1984", "George Orwell", 1949, 24.90, 20, "Totalitarismo");

        // Criando o contentor de objetos
        Livro[] livros = new Livro[10];
        livros[0] = romance1;
        livros[1] = romance2;
        livros[2] = infantil1;
        livros[3] = infantil2;
        livros[4] = ficcao1;
        livros[5] = ficcao2;

        // Listagem das representações textuais dos livros
        System.out.println("### Listagem dos Livros ###");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println(livros[i]);
            }
        }

        // Listagem dos livros infantis
        System.out.println("\n### Livros Infantis ###");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] instanceof LivroInfantil) {
                System.out.println(livros[i]);
            }
        }

        // Listagem dos títulos com idade e valor total de stock
        System.out.println("\n### Títulos com Idade e Valor Total de Stock ###");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                Livro livro = livros[i];
                System.out.printf("Título: %s, Idade: %d anos, Valor Total em Stock: %.2f\n",
                        livro.getTitulo(), livro.calcularIdade(), livro.calcularValorTotalStock());
            }
        }
    }
}
