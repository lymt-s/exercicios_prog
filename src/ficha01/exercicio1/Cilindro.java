package ficha01.exercicio1;

public class Cilindro { //classes sempre c/letra maiuscula, permitem criar objeto
    private double raio;
    private double altura;

    public double getRaio() { //pode ser invocado fora do objeto (public)
        return raio;
    }

    public void setRaio(double raio) { //metodo de modificacao (set): altera o valor do atributo
        this.raio = raio; // "this" referência para o proprio objeto - o raio DESTE objeto
    }
    //recebem um valor por parametro que coincide com o valor do atributo
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //todos os acima sao metodos de instância: estao associados a um objeto
    //o valor dos atributos distingue os objetos da classe

    public double calcularVolume() {
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
}
