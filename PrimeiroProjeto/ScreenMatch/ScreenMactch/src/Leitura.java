import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = sc.nextLine();
        System.out.println("Ano de lançamento");
        int anoQueLancou = sc.nextInt();
        System.out.println("Qual é a avalição do filme");
        double avaliacaoDoFilme = sc.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano que lançou: " + anoQueLancou);
        System.out.println("Avaliação: " + avaliacaoDoFilme);

    }
}
