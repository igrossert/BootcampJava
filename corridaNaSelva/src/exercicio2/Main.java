package exercicio2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        int cont = 1;

        ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();

        try {
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 17, cont, Categorias.PEQUENO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 19, cont, Categorias.PEQUENO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 17, cont, Categorias.MEDIO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 19, cont, Categorias.MEDIO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 19, cont, Categorias.AVANCADO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 17, cont, Categorias.PEQUENO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 19, cont, Categorias.PEQUENO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 17, cont, Categorias.MEDIO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 19, cont, Categorias.MEDIO.name()));
            cont++;
            inscricoes.add(new Inscricao("12345678", "Teste1", "da Silva", "O+", "123456789", "987654321", 17, cont, Categorias.AVANCADO.name()));

        } catch (Exception e) {
            System.out.println(e);
        }

        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.PEQUENO.name());
        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.MEDIO.name());
        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.AVANCADO.name());

        Circuito.deletarInscricao(inscricoes, 5);

        System.out.println("\n");
        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.PEQUENO.name());
        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.MEDIO.name());
        Circuito.getInscricoesPorCategoria(inscricoes, Categorias.AVANCADO.name());

    }
}