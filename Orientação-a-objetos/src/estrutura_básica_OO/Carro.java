package estrutura_básica_OO;

import java.util.Scanner;

public class Carro {
    Scanner scan = new Scanner(System.in);

    String cor;
    String modelo;
    int capacidadeDoTanque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;

    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor (){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    }
}
