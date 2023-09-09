package quociente_resto_divisao;

import java.util.Scanner;

public class QuocienteRestoDivisao {
    //Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        int segundoNumero = scan.nextInt();

        int quociente = primeiroNumero / segundoNumero;
        int restoDivisao = primeiroNumero % segundoNumero;

        System.out.println("O quociente é: " + quociente);
        System.out.println("O resto da divisão é: " + restoDivisao);
    }
}
