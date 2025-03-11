package ficha05.exercicio1;


/**
 * Class representing a vehicle that implements Cores and Imposto interfaces.
 */
public class Veiculo implements Cores, Imposto {
    private String matricula;
    private int cilindrada;
    private String cor;

    private static float IMPOSTO_BAIXO = 15.0f;
    private static float IMPOSTO_ALTO = 40.0f;

    /**
     * Constructs a new Veiculo instance.
     *
     * @param matricula the license plate of the vehicle
     * @param cilindrada the engine displacement of the vehicle
     * @param cor the color of the vehicle
     */
    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    /**
     * Gets the license plate of the vehicle.
     *
     * @return the license plate of the vehicle
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Gets the engine displacement of the vehicle.
     *
     * @return the engine displacement of the vehicle
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Gets the color of the vehicle.
     *
     * @return the color of the vehicle
     */
    public String getCor() {
        return cor;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param matricula the new license plate of the vehicle
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Sets the engine displacement of the vehicle.
     *
     * @param cilindrada the new engine displacement of the vehicle
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param cor the new color of the vehicle
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Returns a string representation of the vehicle.
     *
     * @return a string representation of the vehicle
     */
    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    /**
     * Calculates the tax for the vehicle.
     *
     * @return the calculated tax
     */
    @Override
    public float calculaImposto() {
        if (cilindrada < 1500) {
            return IMPOSTO_BAIXO;
        } else {
            return IMPOSTO_ALTO;
        }
    }
}