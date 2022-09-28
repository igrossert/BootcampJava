package exercicio2;

import java.util.ArrayList;

public class Inscricao extends Participante{

    int numeroInscricao;

    public Inscricao(String RG, String nome, String sobrenome, String tipoSanguineo, String numeroCelular, String numeroEmergencia, int idade, int numeroInscricao, String categoria) throws Exception {
        super(RG, nome, sobrenome, tipoSanguineo, numeroCelular, numeroEmergencia, idade, categoria);
        this.numeroInscricao = numeroInscricao;

        Circuito.getValorInscricao(idade, categoria);
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "Numero Inscricao=" + numeroInscricao +
                ", RG='" + RG + '\'' +
                ", Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", Tipo Sanguineo='" + tipoSanguineo + '\'' +
                ", Numero Celular='" + numeroCelular + '\'' +
                ", NumeroEmergencia='" + numeroEmergencia + '\'' +
                ", Idade=" + idade +
                ", Nome Categoria='" + nomeCategoria + '\'' +
                '}';
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
}
