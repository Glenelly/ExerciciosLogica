package volume_lata_oleo;

import java.util.Scanner;

public class LataDeOleo {
    /*
    Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
    seu raio e sua altura.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da lata de óleo: ");
        double raio = scan.nextDouble();

        System.out.println("Informe a altura da lata de óleo: ");
        double altura = scan.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é de: " + volume);

    }
}
