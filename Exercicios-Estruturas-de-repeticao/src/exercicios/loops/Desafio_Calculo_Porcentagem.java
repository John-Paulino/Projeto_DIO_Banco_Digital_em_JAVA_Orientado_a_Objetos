package exercicios.loops;

import java.util.Scanner;

public class Desafio_Calculo_Porcentagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica

        double calculo = ((B / A) - 1) * 100);
        System.out.print(String.format("%.2f", calculo) + "%");
    }
}

