package ficha03.exercicio1;

public class Main {
    public static void main(String[] args) {

        //(a) Crie na classe de teste (Main) dois objetos, um de cada um dos tipos de consulta usando o
        //construtor vazio (sem parâmetros).

        ConsultaPresencial c1 = new ConsultaPresencial();
        ConsultaOnline c2 = new ConsultaOnline();

        //(b) Mostre para o ecrã o estado (conteúdo) de cada um dos objetos criados na alínea anterior.
        System.out.println("Consulta Presencial: " + c1);
        System.out.println("Consulta Online: " + c2);

        //(c) Crie na classe de teste dois objetos, um de cada um dos tipos de consulta usando agora o
        //construtor com parâmetros.
        ConsultaPresencial c3 = new ConsultaPresencial("2025/02/25", "14:30", "João Silva", "Dr. Carlos", 12, "Rua de Silvosa, 123");
        ConsultaOnline c4 = new ConsultaOnline("2025/02/25", "21:00", "Maria Santos", "Dra. Ana", "Zoom", "www.zoom.com/consulta123");

        //(d) Mostre para o ecrã o estado (conteúdo) de cada um dos objetos criados na alínea anterior.
        System.out.println("Consulta Presencial: " + c3);
        System.out.println("Consulta Online: " + c4);

        //(e) Mostre para o ecrã o custo de cada uma das consultas criadas nas alíneas anteriores.
        System.out.println("\nCusto da consulta presencial: " + c3.calcularCustoConsulta());
        System.out.println("Custo da consulta online: " + c4.calcularCustoConsulta());

        // f) Criar array (lista) e adicionar consultas
        Consulta vec [] = new Consulta[4];
        vec[0] = c1; vec[1] = c2; vec[2] = c3; vec[3] = c4;

        //(g) Implemente um método na classe de teste que receba por parâmetro um array de consultas e
        //  mostre para o ecrã o estado (conteúdo) de todas as consultas existentes no array. Teste o método
        //  usando o array construído na alínea f).
        mostrarConsulta(vec);

        mostrarOnline(vec);
    }

    public static void mostrarConsulta(Consulta vec [])  {
        System.out.println("\nLista de consultas: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }

    // h) Implemente um método na classe de teste que receba por parâmetro um array de consultas e
    // mostre para o ecrã o estado (conteúdo) só das consultas online. Teste o método usando o array
    // construído na alínea f).
    public static void mostrarOnline (Consulta vec []) {
        System.out.println("\nLista de consultas online: ");
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] instanceof ConsultaOnline) { // verifica se é do tipo ConsultaOnline
                System.out.println(vec[i]);
            }
        }
    }
}