package exercicios.loops;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme uma tabuada.
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada desejada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada: " + tabuada);

        for (int i = 1;i <= 10; ++i){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
