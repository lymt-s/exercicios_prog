package aula1.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Sara");
        pessoa.setIdade(19);
        pessoa.setAltura(1.66);
        pessoa.setPeso(60);
        pessoa.exibirInformacoes();
        System.out.println(pessoa.getClassIMC());

    }
}
