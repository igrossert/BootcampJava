package exemplo1;

public class Main {
    public static void main(String[] args) {
        String[] cidades = new String[]{"Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asuncion",
                "Sao Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperaturas = new int[10][2];
        temperaturas[0][0] = -2;
        temperaturas[1][0] = -3;
        temperaturas[2][0] = -8;
        temperaturas[3][0] = 4;
        temperaturas[4][0] = 6;
        temperaturas[5][0] = 5;
        temperaturas[6][0] = 0;
        temperaturas[7][0] = -7;
        temperaturas[8][0] = -1;
        temperaturas[9][0] = -10;

        temperaturas[1][1] = 33;
        temperaturas[2][1] = 32;
        temperaturas[0][1] = 27;
        temperaturas[3][1] = 37;
        temperaturas[4][1] = 42;
        temperaturas[5][1] = 43;
        temperaturas[6][1] = 39;
        temperaturas[7][1] = 26;
        temperaturas[8][1] = 31;
        temperaturas[9][1] = 35;


        int menorTemperatura = temperaturas[0][0],
                maiorTemperatura = temperaturas[0][0],
                indiceMaiorTemperatura = 0,
                indiceMenorTemperatura = 0;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                if (menorTemperatura > temperaturas[i][j]) {
                    menorTemperatura = temperaturas[i][j];
                    indiceMenorTemperatura = i;
                }

                if (maiorTemperatura < temperaturas[i][j]) {
                    maiorTemperatura = temperaturas[i][j];
                    indiceMaiorTemperatura = i;
                }
            }
        }

        System.out.println(cidades[indiceMenorTemperatura] + " com " + menorTemperatura + " graus");
        System.out.println(cidades[indiceMaiorTemperatura] + " com " + maiorTemperatura + " graus");
    }
}