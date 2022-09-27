package exercicio2;

public class Circuito {

    private static final int CIRCUITO_PEQUENO_MENOR_IDADE = 1300;
    private static final int CIRCUITO_MEDIO_MENOR_IDADE = 2000;

    private static final int CIRCUITO_PEQUENO_MAIOR_IDADE = 1500;
    private static final int CIRCUITO_MEDIO_MAIOR_IDADE = 2300;
    private static final int CIRCUITO_GRANDE_MAIOR_IDADE = 2800;


    public static int getCircuitoPequenoMenorIdade() {
        return CIRCUITO_PEQUENO_MENOR_IDADE;
    }

    public static int getCircuitoMedioMenorIdade() {
        return CIRCUITO_MEDIO_MENOR_IDADE;
    }

    public static int getCircuitoPequenoMaiorIdade() {
        return CIRCUITO_PEQUENO_MAIOR_IDADE;
    }

    public static int getCircuitoMedioMaiorIdade() {
        return CIRCUITO_MEDIO_MAIOR_IDADE;
    }

    public static int getCircuitoGrandeMaiorIdade() {
        return CIRCUITO_GRANDE_MAIOR_IDADE;
    }
}
