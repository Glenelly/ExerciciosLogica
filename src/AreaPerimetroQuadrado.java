import java.util.Scanner;

public class AreaPerimetroQuadrado {

    /*Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado: ");
        int lado = scan.nextInt();

        int perimetro = (lado + lado) * 2;
        int area = lado * lado;

        System.out.println("O perímetro do quadrado é: " + perimetro);
        System.out.println("A área do quadrado é: " + area);

    }


}
