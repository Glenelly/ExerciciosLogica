package area_perimetro_retangulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class AreaPerimetroRetangulo2 {

    /* Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        BigDecimal base = BigDecimal.valueOf(scan.nextDouble());

        System.out.println("Informe a altura do retângulo: ");
        BigDecimal altura = BigDecimal.valueOf(scan.nextDouble());

        retornarPerimetro(base, altura);

        retornarArea(base, altura);
    }
    public static void retornarPerimetro(BigDecimal base, BigDecimal altura){

        BigDecimal perimetro = base.add(altura).multiply(BigDecimal.valueOf(2));
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
    public static void retornarArea(BigDecimal base, BigDecimal altura){

        BigDecimal area = base.multiply(altura);
        System.out.println("A área do retângulo é: " + area);
    }
}
