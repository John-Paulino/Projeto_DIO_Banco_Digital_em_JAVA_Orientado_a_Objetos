package entendendo.metodos;

/**
 *Classe principal para o exercicio da Aula 1 de métodos.
 */

public class Metodos {

    public static void main(String[] args){

        //Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);
        calculadora.jurosSimples(1000, 0.03, 24);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

        //Quadrilátero
        /**
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(4,5);
        Quadrilatero.area(5,7,9);
        Quadrilatero.area(3f,7f);
        */

        //Retornoss
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(4, 5, 6);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
