package ficha04.exercicio2;

public class MainFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);
        System.out.println("Área: " + c1.calcularArea());

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);
        System.out.println("Área: " + c2.calcularArea());

        Retangulo r1 = new Retangulo();
        System.out.println(r1);
        System.out.println("Área: " + r1.calcularArea());

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);
        System.out.println("Área: " + r2.calcularArea());

        System.out.println("\n### Variável do Tipo Object ###");
        Object obj;
        obj = c1;
        System.out.println(obj.toString());
        System.out.println("Área: " + ((Figura) obj).calcularArea());

        obj = r1;
        System.out.println(obj.toString());
        System.out.println("Área: " + ((Figura) obj).calcularArea());

        // Armazenamento de objetos num contentor do tipo array
        Object[] figuras = new Object[10];

        figuras[0] = c1;
        figuras[1] = c2;
        figuras[2] = r1;
        figuras[3] = r2;

        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i]);
                // Calcula e mostra a área apenas para instâncias de Figura (impede o erro)
                if (figuras[i] instanceof Figura) {
                    System.out.println("Área: " + ((Figura) figuras[i]).calcularArea());
                }
            }
        }

        // Verifica se é possível adicionar uma String ao contentor
        figuras[4] = "Texto";  // Isso gerará um erro de tipo em runtime ao tentar calcular a área

        // Exibe listas separadas
        System.out.println("\n### Listagem de Instâncias Retângulo ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Retangulo) {
                System.out.println(figuras[i]);
                System.out.println("Área: " + ((Figura) figuras[i]).calcularArea());
            }
        }

        System.out.println("\n### Listagem de Instâncias Círculo ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo) {
                System.out.println(figuras[i]);
                System.out.println("Área: " + ((Figura) figuras[i]).calcularArea());
            }
        }
    }
}
