package ficha02;

public class MainAutomovel {
    public static void main(String[] args) {

        Automovel a1 = new Automovel();
        a1.setMarca("Toyota");
        a1.setMatricula("11-11-AA");
        a1.setCilindrada(1400);
        System.out.println(a1);
        System.out.println("A matrícula do automóvel a1 é: " + a1.getMatricula());
        System.out.println("Total de automóveis criados: " + Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel();
        a2.setMarca("Fiat");
        a2.setMatricula("22-22-BB");
        System.out.println(a2);
        a2.setCilindrada(1800);
        System.out.println(a2);

        System.out.println("Total de automóveis criados: " + Automovel.getTotalAutomoveis());

        int diferenca = a1.calcularDiferencaCilindrada(a2);
        System.out.println("Diferença de cilindrada entre a1 e a2: " + diferenca + " cc");

        if (a1.isCilindradaMaior(a2)) {
            System.out.println("O automóvel com maior cilindrada tem a matrícula: " + a1.getMatricula());
        } else {
            System.out.println("O automóvel com maior cilindrada tem a matrícula: " + a2.getMatricula());
        }

        //System.out.println("O automóvel com maior cilindrada tem a matrícula: " +
        // (a1.isCilindradaMaior(a2) ? a1.getMatricula() : a2.getMatricula()));

        System.out.println("A cilindrada do automóvel a1 é superior a 2000 cc? " + a1.isCilindradaMaior(2000));
    }
}
