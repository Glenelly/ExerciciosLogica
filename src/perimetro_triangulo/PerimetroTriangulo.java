package perimetro_triangulo;

import java.util.Scanner;

public class PerimetroTriangulo {
    //Dado os três lados de um triângulo determinar o perímetro do mesmo.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int perimetro = 0;

       for(int i = 0; i < 3; i++){

           System.out.print("Informe o " + (i + 1) + " lado do triângulo: ");
           int lados = scan.nextInt();

           perimetro += lados;
        }
        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
}
