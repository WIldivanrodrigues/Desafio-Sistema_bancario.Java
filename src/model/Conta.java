package model;

public abstract class Conta {
    private int agencia;
    private int numero;
    protected double saldo;

    public Conta(int agencia, int numero, double saldoInicial) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " Realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para depósito!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor && valor > 0) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("Agência: %s | Conta: %s | Saldo: R$ %.2f", agencia, numero, saldo);
    }
}
