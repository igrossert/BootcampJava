import data.GerenciaContas;
import exception.ContaInexistenteException;
import exception.InvalidNumberException;
import modelo.Cliente;
import modelo.Conta;


public class Main {
    private static GerenciaContas contas = new GerenciaContas();

    public static void main(String[] args) {

        contas.novaContaCorrente(new Cliente());
        contas.novaContaPoupanca(new Cliente());
        contas.novaContaCorrente(new Cliente());

        try {
            contas.depositar(1, 100);
            contas.transferir(1, 2, 50);

            System.out.println(contas.listarContaCorrentePorNumero());

        } catch (Exception e) {
            System.out.println("Erro");
        }
    }

}