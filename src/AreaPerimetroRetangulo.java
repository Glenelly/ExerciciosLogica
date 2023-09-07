import java.util.Scanner;

public class AreaPerimetroRetangulo {
    public static void main(String[] args) {

        /* Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        int base = scan.nextInt();

        System.out.println("Informe a altura do retângulo: ");
        int altura = scan.nextInt();

        int perimetro = base + altura;
        int area = base * altura;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);
    }
}