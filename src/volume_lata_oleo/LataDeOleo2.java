package volume_lata_oleo;

import java.math.BigDecimal;
import java.util.Scanner;

public class LataDeOleo2 {
    /*
    Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
    seu raio e sua altura.
    */
    public static void main(String[] args) {

        calcularVolume();

    }
    public static void calcularVolume(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da lata de óleo: ");
        BigDecimal raio = BigDecimal.valueOf(scan.nextDouble());

        System.out.println("Informe a altura da lata de óleo: ");
        BigDecimal altura = BigDecimal.valueOf(scan.nextDouble());

        BigDecimal volume = raio.pow(2).multiply(BigDecimal.valueOf(Math.PI)).multiply(altura);

        System.out.println("O volume da lata de óleo é de: " + volume);
    }
}
