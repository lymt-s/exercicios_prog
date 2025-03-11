package ficha05.exercicio2;

class Gestor extends Utilizador implements AutenticacaoPassword, AutenticacaoBiometrica {
    private String password;
    private String dadosBiometricos;

    Gestor(String nome, String password, String dadosBiometricos) {
        super(nome);
        this.password = password;
        this.dadosBiometricos = dadosBiometricos;
    }

    public boolean autenticarPassword(String password) {
        return this.password.equals(password);
    }

    public boolean autenticarBiometria(String dadosBiometricos) {
        return this.dadosBiometricos.equals(dadosBiometricos);
    }

    public boolean autenticar(String... credenciais) {
        return credenciais.length == 2 && autenticarPassword(credenciais[0]) && autenticarBiometria(credenciais[1]);
    }
}