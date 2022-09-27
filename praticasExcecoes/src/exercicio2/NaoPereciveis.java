package exercicio2;

public class NaoPereciveis extends Produto {
    private String tipo;

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        setNome(nome);
        setPreco(preco);
        setTipo(tipo);
    }

    @Override
    public double calcular(int quantidadeProdutos) {
        return super.calcular(quantidadeProdutos);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
