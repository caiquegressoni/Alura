import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO: cirar as seguintes funções; recebeTransferencia(), fazTransferencia(), enviaPix(), recebePix()
        String nomeCliente;
        String[] tipoConta = {"Corrente", "Poupança"};
        double saldoInicial = 2500;

        System.out.println("****************Cadastro****************");
        System.out.println("Digite o nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Informe o tipo da conta:");
        System.out.println("[C] - Conta corrente");
        System.out.println("[P] - Conta Poupança");
        System.out.println("Digite sua opção: ");
        String opcao = sc.nextLine().toUpperCase();

        String tipoSelecionado = "";

        if (opcao.equals("C")) {
            tipoSelecionado = tipoConta[0];
        } else if (opcao.equals("P")) {
            tipoSelecionado = tipoConta[1];
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("\nCadastro realizado com sucesso\n");

        String menu = """
                "1 - Consultar dados
                "2 - Receber valor
                "3 - Transferir valor
                "4 - Sair"
                """;

        int op = 0;
        while (op != 4) {
            System.out.println(menu);
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("Nome do cliente: " + nomeCliente);
                System.out.println("Tipo da conta: " + tipoSelecionado);
                System.out.println("Saldo: " + saldoInicial);
            } else if (op == 2) {
                System.out.println("Informe o valor a ser recebido");
                double valorRecebido = sc.nextDouble();
                saldoInicial += valorRecebido;
                System.out.println("Saldo após recebimento: "+saldoInicial);

            } else if (op == 3) {
                System.out.println("Qual valor deseja transferir");
                double valorTranferido = sc.nextDouble();
                if (valorTranferido > saldoInicial) {
                    System.out.println("Você não possui saldo suficiente");
                } else {
                    saldoInicial -= valorTranferido;
                    System.out.println("Saldo após transferencia: " + saldoInicial);
                }
            } else if (op != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}