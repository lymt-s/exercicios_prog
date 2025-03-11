package ficha05.exercicio1;

/**
 * Class representing a residence that implements Cores and Imposto interfaces.
 */
public class Moradia implements Cores, Imposto {

    private String morada;
    private float area;
    private String cor;

    /**
     * Constructs a new Moradia instance.
     *
     * @param morada the address of the residence
     * @param area the area of the residence
     * @param cor the color of the residence
     */
    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    /**
     * Gets the address of the residence.
     *
     * @return the address of the residence
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Gets the area of the residence.
     *
     * @return the area of the residence
     */
    public float getArea() {
        return area;
    }

    /**
     * Gets the color of the residence.
     *
     * @return the color of the residence
     */
    public String getCor() {
        return cor;
    }

    /**
     * Sets the address of the residence.
     *
     * @param morada the new address of the residence
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Sets the area of the residence.
     *
     * @param area the new area of the residence
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Sets the color of the residence.
     *
     * @param cor the new color of the residence
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Returns a string representation of the residence.
     *
     * @return a string representation of the residence
     */
    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s",
                morada, area, cor);
    }

    /**
     * Calculates the tax for the residence.
     *
     * @return the calculated tax
     */
    @Override
    public float calculaImposto() {
        return area * 2.0f;
    }
}