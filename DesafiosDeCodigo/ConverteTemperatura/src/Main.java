//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tempCelsius = 30.4;
        double tempFahrenheit = (tempCelsius * 1.8) +32;

        System.out.println("A temperatura em Celsius é "+ tempCelsius +
                " convertendo para Fahrenheit é "+tempFahrenheit);

        int convertToInt = (int) tempFahrenheit;

        System.out.println("Fahrenheit em inteiro fica " +convertToInt);
    }
}