package exercicio2;

public class Participante extends Circuito{
    String RG, nome, sobrenome, tipoSanguineo, numeroCelular, numeroEmergencia;
    int idade;

    public Participante(String RG, String nome, String sobrenome, String tipoSanguineo, String numeroCelular, String numeroEmergencia, int idade, String categoria) {
        super(categoria);
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipoSanguineo = tipoSanguineo;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.idade = idade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
