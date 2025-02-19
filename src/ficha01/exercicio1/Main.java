package ficha01.exercicio1;

public class Main {
    public static void main(String[] args) {
        Cilindro c1 = new Cilindro();
        double volume;

        c1.setRaio(5);
        c1.setAltura(10);
        volume = c1.calcularVolume();
        System.out.println("O volume do cilindro é: " + volume);


        Cilindro c2 = new Cilindro();

        c2.setRaio(6);
        c2.setAltura(12);
        volume = c2.calcularVolume();
        System.out.println("O volume do novo cilindro é: " + volume);

    }
}
