package ficha04.exercicio3;

public class LivroInfantil extends Livro {

    private int idadeMinima;
    private int idadeMaxima;

    public LivroInfantil(String titulo, String autor, int anoPublicacao, double preco, int quantidadeEmStock, int idadeMinima, int idadeMaxima) {
        super(titulo, autor, anoPublicacao, preco, quantidadeEmStock);
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade mínima: " + idadeMinima + ", Idade máxima: " + idadeMaxima;
    }

    // Getters and Setters
    public int getIdadeMinima() { return idadeMinima; }
    public int getIdadeMaxima() { return idadeMaxima; }
}
