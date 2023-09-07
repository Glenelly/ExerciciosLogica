package area_perimetro_quadrado;

import java.math.BigDecimal;
import java.util.Scanner;

public class AreaPerimetroQuadradoComplexo {

    /*Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado: ");
        BigDecimal lado = BigDecimal.valueOf(scan.nextDouble());

        BigDecimal perimetro = lado.add(lado).multiply(BigDecimal.valueOf(2));
        BigDecimal area = lado.multiply(lado);

        System.out.println("O perímetro do quadrado é: " + perimetro);
        System.out.println("A área do quadrado é: " + area);

    }
}
