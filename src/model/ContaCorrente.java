package model;

import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.50;
        if (super.sacar(valor + taxa)){
            System.out.println("Saque de R$" + valor +" com taxa de R$" + taxa + " realizado com sucesso!");
            return true;
        }else {
            System.out.println("Saldo em conta insuficiente!");
            return false;
        }
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.10;
    }

    @Override
    public String toString() {
        return "Conta Corrente - " + super.toString();
    }
}