package ficha04.exercicio3;

public class LivroRomance extends Livro {

    private String editora;

    public LivroRomance(String titulo, String autor, int anoPublicacao, double preco, int quantidadeEmStock, String editora) {
        super(titulo, autor, anoPublicacao, preco, quantidadeEmStock);
        this.editora = editora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Editora: " + editora;
    }

    // Getter and Setter
    public String getEditora() { return editora; }
}
