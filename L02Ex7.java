/*
Desconto simples
Leia o valor de uma compra. Se o valor for maior ou igual a 200, aplique 10% de desconto. Caso contrário, mantenha o valor original. Mostre o valor final da compra.
*/

import java.util.Scanner;

public class L02Ex7 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Valor da compra:");

    float compra = sc.nextFloat();

    float desconto = compra * 0.1f;
    float valorFinal = compra - desconto;;


    if (compra >= 200) {
        System.out.println("Valor final: " + valorFinal);
        
    } else{
        System.out.println("Valor da compra: " + compra);
    }

    sc.close();

    }
}