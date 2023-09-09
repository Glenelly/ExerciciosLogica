package perimetro_triangulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class PerimetroTriangulo2 {

    //Dado os três lados de um triângulo determinar o perímetro do mesmo.

    public static void main(String[] args) {
        retornarPerimetro();
    }
    public static void retornarPerimetro(){

        Scanner scan = new Scanner(System.in);

        BigDecimal perimetro = BigDecimal.valueOf(0);

        for(int i = 0; i < 3; i++){

            System.out.print("Informe o " + (i + 1) + " lado do triângulo: ");
            BigDecimal lados = BigDecimal.valueOf(scan.nextInt());

            perimetro = lados.add(lados).add(lados);
        }

        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
}
