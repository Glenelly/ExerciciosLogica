package numero_sucessor;

import java.util.Scanner;

public class NumeroSucessor {
    // Ler um número inteiro e exibir o seu sucessor.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        System.out.println("O número que você escolheu foi " + numero + " e o seu sucessor é: " + (numero + 1));
    }
}
