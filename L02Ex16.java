/*
        Desconto por faixa de compra
            Leia o valor de uma compra e aplique:

            abaixo de R$ 100,00: sem desconto;
            de R$ 100,00 até R$ 299,99: 5%;
            de R$ 300,00 até R$ 499,99: 10%;
            R$ 500,00 ou mais: 15%.
            Mostre o percentual aplicado, o valor do desconto e o valor final.
        */

import java.util.Scanner;

public class L02Ex16 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        float valor;
        float percentual, valorDesconto, valorFinal;

        // entrada
        System.out.println("Informe o valor da compra");
        valor = sc.nextFloat();

        // processamento
        if (valor < 100) {
            percentual = 0;
        } else if (valor < 300) {
            percentual = 0.05f;
        } else if (valor < 500) {
            percentual = 0.1f;
        } else {
            percentual = 0.15f;
        }

        valorDesconto = valor * percentual;
        valorFinal = valor - valorDesconto;

        // saida
        System.out.println("% aplicado = " + percentual);
        System.out.println("valor Desconto = " + valorDesconto);
        System.out.println("valor final = " + valorFinal);
    }
}