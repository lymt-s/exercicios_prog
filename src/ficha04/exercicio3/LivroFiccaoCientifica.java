package ficha04.exercicio3;

public class LivroFiccaoCientifica extends Livro {

    private String tema;

    public LivroFiccaoCientifica(String titulo, String autor, int anoPublicacao, double preco, int quantidadeEmStock, String tema) {
        super(titulo, autor, anoPublicacao, preco, quantidadeEmStock);
        this.tema = tema;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tema: " + tema;
    }

    // Getter and Setter
    public String getTema() { return tema; }
}

