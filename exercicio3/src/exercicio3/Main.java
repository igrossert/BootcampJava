package exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Iara");
        pessoa.setId("a1b2c3");
        pessoa.setAltura(1.53f);
        pessoa.setPeso(55.3f);
        pessoa.setIdade(22);

        int imc = pessoa.calcularIMC();
        boolean maiorIdade = pessoa.eMaiorIdade();

        if (imc == 0) System.out.println("Peso saudável");
        else if (imc == 1) System.out.println("Sobrepeso");
        else System.out.println("Abaixo do peso");

        if (maiorIdade) System.out.println("É maior de idade");
        else System.out.println("É menor de idade");

        System.out.println(pessoa);
    }
}
