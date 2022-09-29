package modelo;

import exception.InvalidNumberException;

public class ContaPoupanca extends Conta{
    private static double taxa;

    public ContaPoupanca(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor)) {
            return false;
        }
        return super.sacar(valor + taxa);
    }

    private boolean saldoInsuficiente(double valor) {
        return getSaldo() < valor + taxa;
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
