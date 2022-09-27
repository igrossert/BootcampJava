package exercicio2;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        setNome(nome);
        setPreco(preco);
        setDiasParaVencer(diasParaVencer);
    }

    public String toString() {
        return getNome() + " " + getPreco() + " " + diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeProdutos) {
        double valor = super.calcular(quantidadeProdutos);

        if (this.diasParaVencer == 1) return valor - (valor * 0.04);
        if (this.diasParaVencer == 2) return valor - (valor * 0.03);
        if (this.diasParaVencer == 3) return  valor / 2;
        return valor;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
