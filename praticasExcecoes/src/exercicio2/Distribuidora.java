package exercicio2;

public class Distribuidora {
    public static void main(String[] args) {
        Pereciveis[] pereciveis = new Pereciveis[5];

        pereciveis[0] = new Pereciveis("pao", 2.50, 8);
        pereciveis[1] = new Pereciveis("queijo", 10, 1);
        pereciveis[2] = new Pereciveis("ovo", 10, 2);
        pereciveis[3] = new Pereciveis("carne", 10, 3);
        pereciveis[4] = new Pereciveis("mortadela", 2.50, 46);

        for (int i = 0; i < 5; i++) {
            System.out.println(pereciveis[i].getNome() + " " + pereciveis[i].calcular(5));
        }

        NaoPereciveis[] naoPereciveis = new NaoPereciveis[5];

        naoPereciveis[0] = new NaoPereciveis("arroz", 5, "graos");
        naoPereciveis[1] = new NaoPereciveis("feijao", 10, "graos");
        naoPereciveis[2] = new NaoPereciveis("desodorante", 10, "higiene");
        naoPereciveis[3] = new NaoPereciveis("sabonete", 10, "higiene");
        naoPereciveis[4] = new NaoPereciveis("shampoo", 2.50, "higiene");

        for (int i = 0; i < 5; i++) {
            System.out.println(naoPereciveis[i].getNome() + " " + naoPereciveis[i].calcular(5));
        }
    }
}
