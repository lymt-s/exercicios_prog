package ficha05.exercicio2;

public class TesteSistema {
    public static void main(String[] args) {
        Gestor gestor = new Gestor("Carlos", "gestor123", "biometria123");
        Administrativo admin = new Administrativo("Ana", "admin123");
        Visitante visitante = new Visitante("Pedro", "codigo123");

        // Testes Gestor
        System.out.println("Gestor - Autenticação correta: " + gestor.autenticar("gestor123", "biometria123"));
        System.out.println("Gestor - Password errada: " + gestor.autenticar("errado", "biometria123"));
        System.out.println("Gestor - Biometria errada: " + gestor.autenticar("gestor123", "errado"));

        // Testes Administrativo
        System.out.println("Administrativo - Autenticação correta: " + admin.autenticar("admin123"));
        System.out.println("Administrativo - Password errada: " + admin.autenticar("errado"));

        // Testes Visitante
        System.out.println("Visitante - Autenticação correta: " + visitante.autenticar("codigo123"));
        System.out.println("Visitante - Código errado: " + visitante.autenticar("errado"));
    }
}
