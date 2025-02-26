package ficha03.exercicio2;

public class Delivery extends Pedido {
    private String enderecoEntrega;

    // Construtor sem parâmetros
    public Delivery() {
        super();
        this.enderecoEntrega = STRING_POR_OMISSAO;
    }

    // Construtor completo
    public Delivery(String data, String hora, double custoBase, String enderecoEntrega) {
        super(data, hora, custoBase);
        this.enderecoEntrega = enderecoEntrega;
    }


    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }


    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    // c) Implemente o método de cálculo do custo de um pedido adequado a cada situação.
    @Override
    public double calcularCusto() {
        return getCustoBase() * 1.0; // Taxa de entrega de 5%
    }

    @Override
    public String toString() {
        return super.toString() + ", Endereço de entrega: " + enderecoEntrega;
    }

    // f) Crie o construtor de cópia em cada classe.
    public Delivery(Delivery outro) {
        super(outro.getData(), outro.getHora(), outro.getCustoBase());
        this.enderecoEntrega = outro.enderecoEntrega;
    }
}
