package exercicio2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){}

    public String toString(){
        return this.nome + " " + this.preco;
    }

    public double calcular(int quantidadeProdutos){
        return this.preco * quantidadeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
