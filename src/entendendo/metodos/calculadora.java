package entendendo.metodos;

/**
 *Classe de exemplo para o exercicio da Aula 1 de métodos.
 */

public class calculadora {
    public static void soma (double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao (double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao (double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao (double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

    public static void jurosSimples (double capital, double taxa, int periodo) {

        double montante = capital * ((1+taxa) * periodo);
        double jurosSimples = capital * taxa * periodo;

        System.out.println("A dívida total será de R$" + montante);
        System.out.println("Os juros a pagar serão de R$" + jurosSimples);
    }
}
/**
 * public static void jurosCompostos (double capital, double taxa, int periodo) {
 *
 *    double montante = capital * Math.pow(double(1 + taxa), int periodo);
 *    double jurosCompostos = capital * (Math.pow((double (1 + taxa), int periodo)) -1)
 *
 *    System.out.println("A dívida total será de R$" + montante);
 *    System.out.println("Os juros a pagar serão de R$" + jurosCompostos);
 *}
 */
