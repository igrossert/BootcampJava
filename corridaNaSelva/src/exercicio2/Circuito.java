package exercicio2;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

enum Categorias {
    PEQUENO, MEDIO, AVANCADO;

}
public class Circuito{

    String nomeCategoria;

    public Circuito(String categoria) {
        this.nomeCategoria = categoria;
    }

    public static int getValorInscricao(int idade, String nomeCategoria) throws Exception {

        if (nomeCategoria.equalsIgnoreCase(Categorias.PEQUENO.name())){
            if(idade < 18) return 1300; else return 1500;
        }

        if (nomeCategoria.equalsIgnoreCase(Categorias.MEDIO.name())){
            if(idade < 18) return 2000; else return 2300;
        }

        if (nomeCategoria.equalsIgnoreCase(Categorias.AVANCADO.name())){
            if(idade < 18) {
                throw new Exception("Menores de 18 anos não podem se inscrever nesta modalidade.");
            }
            return 2800;
        }
        return -1;
    }

    public static void getInscricoesPorCategoria(ArrayList<Inscricao> inscricoes, String categoria) throws Exception {
        for (Inscricao inscricao : inscricoes) {
            if (inscricao.nomeCategoria == categoria){
                System.out.println(inscricao.toString());
            }
        }
    }

    public static void deletarInscricao(ArrayList<Inscricao> inscricoes, int numeroInscricao){
        for (int i = 0; i < inscricoes.size(); i++) {
            if (inscricoes.get(i).numeroInscricao == numeroInscricao){
                inscricoes.remove(i);
            }
        }
    }
}

