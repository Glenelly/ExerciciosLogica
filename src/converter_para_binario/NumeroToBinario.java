package converter_para_binario;

import java.util.Scanner;

public class NumeroToBinario {
    //Converter um inteiro informado menor que 32 para sua representação em binário

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro até 32: ");
        int numero = scan.nextInt();

        if (numero < 32 && numero >= 0){

            String binario = Integer.toBinaryString(numero);

            System.out.println("O número que você informou em binário: " + binario);
        }else {
            System.out.println("Valor inválido!!");
        }
    }
}
