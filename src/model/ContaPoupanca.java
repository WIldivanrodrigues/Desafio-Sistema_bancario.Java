package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }

    }
}
