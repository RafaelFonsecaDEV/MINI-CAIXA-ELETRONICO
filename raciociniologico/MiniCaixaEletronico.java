package raciociniologico;

import raciociniologico.CaixaEletronico;
import java.util.Scanner;

public class MiniCaixaEletronico {
    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    caixa.verSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    caixa.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    caixa.sacar(valorSaque);
                    break;
                case 4:
                    caixa.sair();
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}

