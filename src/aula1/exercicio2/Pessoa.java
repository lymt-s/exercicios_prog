package aula1.exercicio2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularIMC() {
        return peso /(altura*altura);
    }

    public String getClassIMC() {
        double IMC = calcularIMC();
        if (IMC < 18.5) {
            return "Baixo Peso";
        } else if (IMC >=  18.5 && IMC <= 24.9) {
            return "Peso Normal";
        } else if (IMC >= 25 && IMC <= 29.9) {
            return "Sobrepeso";
        } else if (IMC >= 30 && IMC <= 34.9) {
            return "Obesidade Classe I";
        } else if (IMC >= 35 && IMC <= 39.9) {
            return "Obesidade Classe II";
        } else {
            return "Valor inválido. Tente novamente";
        }

    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.printf("IMC: %.2f\n", calcularIMC());
    }
}
