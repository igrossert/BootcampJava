package exercicio3;

public class Pessoa {
    private String nome, id;
    private int idade;
    private float peso, altura;

    public Pessoa(){}

    public Pessoa(String nome, String id, int idade){}

    public Pessoa(String nome, String id, int idade, float peso, float altura){}

    public int calcularIMC(){
        double result = this.peso/Math.pow(this.altura, 2);

        if(result < 20) return -1;
        if(result > 25) return 1;

        return 0;
    }

    public boolean eMaiorIdade(){
        return this.idade >= 18;
    }

    public String toString(){
        return "Nome: "+ this.nome
                + "\nID: " + this.id
                + "\nIdade: " + this.idade
                + "\nPeso: " + this.peso
                + "\nAltura: " + this.altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

