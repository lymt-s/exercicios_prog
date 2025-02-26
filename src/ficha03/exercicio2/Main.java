package ficha03.exercicio2;

public class Main {
    public static void main(String[] args) {
        //(d) Crie dois objetos (p1 e p2), um para cada tipo de pedido, e mostre para o ecrã o estado de cada
        //um.
        Delivery p1 = new Delivery("25/02/2025", "14:30", 12.0, "Rua 2, 123");
        System.out.println(p1.toString());
        System.out.print("Custo Final: " + p1.calcularCusto());

        TakeAway p2 = new TakeAway("25/02/2025", "14:00", 10.0, "15:00");
        System.out.println("\n" + p2.toString());
        System.out.println("Custo Final: " + p2.calcularCusto());

        //e) Altere o custo base do pedido p1 e verifique se essa alteração foi bem realizada.
        p1.setCustoBase(15.0);
        System.out.println("\nNovo Custo do p1: " + p1.calcularCusto());

        // g) Usando o construtor de cópia, crie um objeto (p3) com o mesmo conteúdo de p2 e mostre para o
        //ecrã o estado dos objetos p2 e p3.
        TakeAway p3 = new TakeAway(p2);
        System.out.println("\np2: " + p2.toString());
        System.out.println("p3: " + p3.toString());

        //h) Altere a data de realização do pedido p2 e mostre para o ecrã a data do pedido p2 e do p3.
        p2.setData("26/02/2025");
        System.out.println("\nNova data do p2: " + p2.getData());
        System.out.println("Data de p3: " + p3.getData());// nao sei se temo de mudar tambem aa data de p3 com construtor copia
    }
}
