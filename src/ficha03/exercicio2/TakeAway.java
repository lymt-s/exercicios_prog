package ficha03.exercicio2;

public class TakeAway extends Pedido {
    private String horaPrevista;

    // Construtor sem parâmetros
    public TakeAway() {
        super();
        this.horaPrevista = STRING_POR_OMISSAO;
    }

    // Construtor completo
    public TakeAway(String data, String hora, double custoBase, String horaPrevista) {
        super(data, hora, custoBase);
        this.horaPrevista = horaPrevista;
    }


    public String getHoraPrevista() {
        return horaPrevista;
    }


    public void setHoraPrevista(String horaPrevista) {
        this.horaPrevista = horaPrevista;
    }

    @Override
    public double calcularCusto() {
        return getCustoBase() * 0.95; // Desconto de 5%
    }

    @Override
    public String toString() {
        return super.toString() + ", horaPrevista=" + horaPrevista + "]";
    }

    //f) Crie o construtor de cópia em cada classe.
    public TakeAway(TakeAway outro) {
        super(outro.getData(), outro.getHora(), outro.getCustoBase());
        this.horaPrevista = outro.horaPrevista;
    }
}
