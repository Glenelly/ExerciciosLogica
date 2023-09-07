package area_perimetro_circulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class AreaPerimetroCirculoComplexo {

    /*Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência: ");
        BigDecimal raio = BigDecimal.valueOf(scan.nextDouble());

        retornarPerimetro(raio);

        retornarArea(raio);
    }

    public static void retornarPerimetro(BigDecimal raio){

        BigDecimal perimetro = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.PI)).multiply(raio);
        System.out.println("O perímetro do círculo é: " + perimetro);
    }

    public static void retornarArea(BigDecimal raio){

        BigDecimal area = BigDecimal.valueOf(Math.PI).multiply(raio).multiply(raio);
        System.out.println("A área do círculo é: " + area);
    }

}
