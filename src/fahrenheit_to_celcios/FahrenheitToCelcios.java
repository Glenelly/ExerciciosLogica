package fahrenheit_to_celcios;

import java.util.Scanner;

public class FahrenheitToCelcios {
    /*
    conversão de Fahrenheit para Celsius, leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em fahrenheit:");
        double fahrenheit = scan.nextDouble();

        double conversao = (fahrenheit - 32) / 1.8;

        System.out.println("A temperatura em celsius é de: " + conversao);

    }
}
