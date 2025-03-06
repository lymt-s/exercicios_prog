package ficha04.exercicio3;

import java.time.LocalDate;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int quantidadeEmStock;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadeEmStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.quantidadeEmStock = quantidadeEmStock;
    }

    // Método para calcular idade do livro
    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.anoPublicacao;
    }

    // Método para calcular o valor total do stock
    public double calcularValorTotalStock() {
        return this.preco * this.quantidadeEmStock;
    }

    // Método toString para representar o livro como uma string
    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Ano: %d, Preço: %.2f, Quantidade em Stock: %d",
                titulo, autor, anoPublicacao, preco, quantidadeEmStock);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;  // Setter que permite alterar o título
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;  // Setter que permite alterar o autor
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;  // Setter que permite alterar o ano de publicação
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;  // Setter que permite alterar o preço
    }

    public int getQuantidadeEmStock() {
        return quantidadeEmStock;
    }

    public void setQuantidadeEmStock(int quantidadeEmStock) {
        this.quantidadeEmStock = quantidadeEmStock;  // Setter que permite alterar a quantidade em estoque
    }
}
