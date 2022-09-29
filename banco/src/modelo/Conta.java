package modelo;

import exception.InvalidNumberException;

public abstract class Conta{
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws InvalidNumberException {
        if(valor <= 0){
            throw new InvalidNumberException("Valor inválido para depósito");
        }
        saldo += saldo;
    }

    public boolean sacar(double valor) throws InvalidNumberException{
        if(valor <= 0){
            throw new InvalidNumberException("Valor inválido para saque");
        }

        saldo -= saldo;
        return true;
    }

    @Override
    public String toString() {
        return "numero=" + numeroConta +
                ", saldo=" + saldo +
                ", cliente=";
    }
}
