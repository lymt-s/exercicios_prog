package ficha05.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MainTributaveis {
    public static void main(String[] args) {
        // Criar uma instância da classe Veiculo
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "verde");
        System.out.println(v1);

        // Nova instância usando a interface Cores
        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println(v2);

        // Instância com cor definida diretamente
        Veiculo v3 = new Veiculo("11-22-BB", 1400, Cores.VERMELHO);
        System.out.println(v3);

        // Instância de moradia
        Moradia m1 = new Moradia("Rua do Dr. Plácido da Costa Bocage", 90, Cores.CINZENTO);
        System.out.println(m1);

        // Exercício m: Criar variável para guardar qualquer instância existente
        List<Object> instancias = new ArrayList<>();
        instancias.add(v1);
        instancias.add(v2);
        instancias.add(v3);
        instancias.add(m1);

        // Imprime o conteúdo da variável de instâncias
        System.out.println("\nConteúdo da variável de instâncias:");
        for (Object obj : instancias) {
            System.out.println(obj);
        }

        // Exercício o: Criar contentor de objetos Imposto
        List<Imposto> tributaveis = new ArrayList<>();
        tributaveis.add(v1);
        tributaveis.add(v2);
        tributaveis.add(v3);
        tributaveis.add(m1);

        // Mostra o total de impostos
        double totalImpostos = tributaveis.stream().mapToDouble(Imposto::calculaImposto).sum();
        System.out.println("\nTotal de impostos: " + totalImpostos + "€");

        // Imprime o imposto de cada objeto
        for (Imposto i : tributaveis) {
            imprimirImposto(i);
        }
    }
    public static void imprimirImposto(Imposto i) {
        if (i instanceof Veiculo) {
            Veiculo v = (Veiculo) i;
            System.out.println("Imposto do Veiculo com matrícula " + v.getMatricula() + ": " + v.calculaImposto() + "€");
        } else if (i instanceof Moradia) {
            Moradia m = (Moradia) i;
            System.out.println("Imposto da Moradia com morada " + m.getMorada() + ": " + m.calculaImposto() + "€");
        }
    }
}
