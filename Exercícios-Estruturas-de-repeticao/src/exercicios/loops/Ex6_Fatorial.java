package exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * ex: 5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja o fatorial: ");
        int fatorial = scan.nextInt();
        int produto = 1;

        for (int i = fatorial; i >= 1; --i){
            produto = produto * i;
        }
        System.out.println("Fatorial de " + fatorial + "! é igual a:" + produto);
    }

}
