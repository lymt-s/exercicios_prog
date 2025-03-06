package ficha04.exercicio2;

public abstract class Figura {

    private String cor;
    private static final String COR_POR_OMISSAO = "cinzento";

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
        cor = COR_POR_OMISSAO;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();  // Método abstrato para calcular a área

    @Override
    public String toString() {
        return String.format("cor=%s", cor);
    }
}
