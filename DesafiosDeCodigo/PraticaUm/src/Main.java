//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1- Crie um programa que realize a média de duas notas decimais e exiba o resultado (Ja inclui o 2)
        double nota1 = 7.5;
        double nota2 = 8.6;

        double media = (nota1 + nota2) / 2;

        System.out.println("A media das notas é " + media);

        int toInt = (int) media;

        System.out.println("Convertendo para inteiro: " + toInt);

        /*3- Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
         Atribua valores a essas variáveis e concatene-as em uma mensagem.*/

        char inicial = 'A';
        String name = "Ana";

        String mensage = "O nome dela é " + name + " e a letra inicial do seu nome é " + inicial;
        System.out.println(mensage);
    }
}