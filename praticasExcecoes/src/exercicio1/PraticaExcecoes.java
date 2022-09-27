package exercicio1;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            double result = b/a;
        } catch (ArithmeticException arithmeticException){
            System.out.println("Não se pode dividir um número por zero.");
        }
    }
}
