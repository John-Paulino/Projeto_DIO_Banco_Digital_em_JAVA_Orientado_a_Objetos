package entendendo.metodos;

/**
 *Classe principal para o exercicio da Aula 1 de métodos.
 */

public class Main {

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

    }
}
