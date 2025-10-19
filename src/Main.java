
import model.*;
import service.CalculadorImposto;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Wildivan Rodrigues", "125.177.184-07");
        ContaCorrente cCorrente = new ContaCorrente(1, 1001, 1000.0);
        ContaPoupanca cPoupanca = new ContaPoupanca(1, 4567, 500.0);
        cliente1.adicionarConta(cCorrente);
        cliente1.adicionarConta(cPoupanca);

        System.out.println("Bem-vindo ao Santander, " + cliente1.getNome() + "!");
        int opcao;

        do {
            System.out.println("\n=== MENU DE SERVIÇOS ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver Saldo");
            System.out.println("5 - Calcular Imposto Conta Corrente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double dep = teclado.nextDouble();
                    cCorrente.depositar(dep);
                    break;

                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = teclado.nextDouble();
                    cCorrente.sacar(saque);
                    break;

                case 3:
                    System.out.println("De qual conta deseja transferir?");
                    System.out.println("1 - Corrente para Poupança");
                    System.out.println("2 - Poupança para Corrente");
                    int tipo = teclado.nextInt();

                    System.out.print("Valor da transferência: ");
                    double valor = teclado.nextDouble();

                    if (tipo == 1) {
                        cCorrente.transferir(cPoupanca, valor);
                    } else if (tipo == 2) {
                        cPoupanca.transferir(cCorrente, valor);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.println("Saldo Conta Corrente: R$" + cCorrente.getSaldo());
                    System.out.println("Saldo Conta Poupança: R$" + cPoupanca.getSaldo());
                    break;

                case 5:
                    CalculadorImposto calc = new CalculadorImposto();
                    calc.calcular(cCorrente);
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
