package numero_sucessor;

import java.util.Scanner;

public class NumeroSucessor2 {
    public static void main(String[] args) {
        numeroSucessor();
    }

    public static void numeroSucessor(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        System.out.println("O número que você escolheu foi " + numero + " e o seu sucessor é: " + (numero + 1));
    }
}
