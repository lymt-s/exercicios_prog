package ficha03.exercicio2;

public abstract class Pedido {
    private int codigo; // gerado automaticamente e sequencial
    private String data; // Data da consulta aa/mm/dd
    private String hora; // Horário da consulta hh:mm
    private double custoBase;

    private static double valorBase = 9.0; // euros
    private static int contador = 0;
    protected static final String STRING_POR_OMISSAO = "-----";

    // Construtor sem parâmetros
    public Pedido() {
        this.codigo = ++contador;
        this.data = STRING_POR_OMISSAO;
        this.hora = STRING_POR_OMISSAO;
        this.custoBase = valorBase;
    }

    // Construtor completo
    public Pedido(String data, String hora, double custoBase) {
        this.codigo = ++contador;
        this.data = data;
        this.hora = hora;
        this.custoBase = custoBase;
    }


    public int getCodigo() { return codigo; }
    public String getData() { return data; }
    public String getHora() { return hora; }
    public double getCustoBase() { return custoBase; }


    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setData(String data) { this.data = data; }
    public void setHora(String hora) { this.hora = hora; }

    // Método para alterar o custoBase de um pedido específico
    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    public static void setValorBase(double valorBase) {
        Pedido.valorBase = valorBase;
    }

    // Método para calcular o custo
    public abstract double calcularCusto();

    @Override //usamos para implementar algo de novo ao método utilizado
    public String toString() {
        return " Nº: " + codigo + ", data: " + data + ", hora: " + hora + ", custo:" + custoBase ;
    }
}
