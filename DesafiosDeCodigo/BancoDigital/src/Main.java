import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO: cirar as seguintes funções; recebeTransferencia(), fazTransferencia(), enviaPix(), recebePix()
        String nomeCliente;
        String[] tipoConta = {"Corrente", "Poupança"};
        double saldoInicial = 2.500;

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

        System.out.println("Cadastro realizado com sucesso");

        System.out.println("1 - Consultar Dados");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        int op = 1;
        switch (op) {
            case 1:
                System.out.println("Nome do cliente: " + nomeCliente);
                System.out.println("Tipo da conta: " + tipoSelecionado);
                System.out.println("Saldo: " + saldoInicial);
                break;
            case 2:
                //Passar as funções resposaveis por receber tranferencias
                break;
        }
    }
}