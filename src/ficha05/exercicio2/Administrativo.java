package ficha05.exercicio2;

class Administrativo extends Utilizador implements AutenticacaoPassword {
    private String password;

    Administrativo(String nome, String password) {
        super(nome);
        this.password = password;
    }

    public boolean autenticarPassword(String password) {
        return this.password.equals(password);
    }

    public boolean autenticar(String... credenciais) {
        return credenciais.length == 1 && autenticarPassword(credenciais[0]);
    }
}