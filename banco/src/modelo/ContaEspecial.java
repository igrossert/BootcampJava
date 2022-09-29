package modelo;

import exception.InvalidNumberException;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numeroConta, Cliente cliente, double limite) {
        super(numeroConta, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor))
            return false;
        return super.sacar(valor);
    }

    private boolean saldoInsuficiente(double valor){
        return getSaldo() + limite < valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
