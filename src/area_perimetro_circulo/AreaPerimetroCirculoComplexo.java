package area_perimetro_circulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class AreaPerimetroCirculoComplexo {

    /*Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência: ");
        BigDecimal raio = BigDecimal.valueOf(scan.nextDouble());

        BigDecimal perimetro = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.PI)).multiply(raio);
        BigDecimal area = BigDecimal.valueOf(Math.PI).multiply(raio).multiply(raio);

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

    }
}
