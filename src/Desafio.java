import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "Rafael";
        String tipoConta = "Corrente";
        double saldo = 15000.00;

        String msgMenu = """
                [1] Consultar saldo
                [2] Transferência
                [3] Receber
                [4] Sair
                → Selecione uma opção: """;

        int opcao = 0;

        System.out.println("\n-----------------|");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("-----------------|\n");

        while (opcao != 4) {
            System.out.print(msgMenu + ' ');
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("\nO seu saldo é: " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.print("Insira o valor para realizar a transferência: ");
                double valorTransferencia = input.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("\nNovo saldo disponível: " + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.print("Valor recebido: ");
                double valorRecebido = input.nextDouble();
                saldo += valorRecebido;
                System.out.println("\nNovo saldo disponível: " + saldo + "\n");
            } else if (opcao == 4) {
                return;
            } else {
                System.out.println("\nOpção Inválida\n");
            }
        }
    }
}
