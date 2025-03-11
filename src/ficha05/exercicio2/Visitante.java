package ficha05.exercicio2;

class Visitante extends Utilizador implements AutenticacaoCodigoTemporario {
    private String codigoTemporario;

    Visitante(String nome, String codigoTemporario) {
        super(nome);
        this.codigoTemporario = codigoTemporario;
    }

    public boolean autenticarCodigo(String codigo) {
        return this.codigoTemporario.equals(codigo);
    }

    public boolean autenticar(String... credenciais) {
        return credenciais.length == 1 && autenticarCodigo(credenciais[0]);
    }
}