package exercicios.loops;

import java.util.Scanner;

public class Desafio_Contagem_Pares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 2; i <= N ; i += 2){
            System.out.println(i);
        }

    }
}

