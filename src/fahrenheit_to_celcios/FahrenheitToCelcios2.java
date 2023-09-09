package fahrenheit_to_celcios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FahrenheitToCelcios2 {
    /*
    conversão de Fahrenheit para Celsius, leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius
    */

    public static void main(String[] args) {
        converterEscalas();
    }

    public static void converterEscalas(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em fahrenheit:");
        BigDecimal fahrenheit = BigDecimal.valueOf(scan.nextDouble());

        BigDecimal conversao = fahrenheit.subtract(BigDecimal.valueOf(32))
                .divide(BigDecimal.valueOf(1.8), 3, RoundingMode.HALF_UP);

        System.out.println("A temperatura em celsius é de: " + conversao);

    }
}
