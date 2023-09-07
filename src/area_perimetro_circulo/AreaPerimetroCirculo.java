package area_perimetro_circulo;

import java.util.Scanner;

public class AreaPerimetroCirculo {

    /*Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência: ");
        double raio = scan.nextInt();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

    }
}
