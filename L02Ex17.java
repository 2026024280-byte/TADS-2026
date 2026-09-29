/*
Faixa de temperatura
Leia uma temperatura em graus Celsius e classifique:
    • abaixo de 0: Congelante;
    • de 0 a 15: Frio;
    • acima de 15 até 25: Agradável;
    • acima de 25 até 35: Quente;
    • acima de 35: Muito quente.
*/

import java.util.Scanner;

public class L02Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        float temp =  sc.nextFloat();
       
        if (temp < 0) {
            System.out.println("A temperatura está congelante.");
        } else if (temp >= 0 && temp <= 15) {
            System.out.println("A temperatura está entre zero e quinze graus: Frio.");
        } else if (temp > 15 && temp <= 25) {
            System.out.println("A temperatura está entre dezesseis e vinte e cinco graus: Agradável.");
        } else if (temp > 25 && temp <= 35) {
            System.out.println("A temperatura está entre vinte e seis e trinta e cinco graus: Quente.");
        } else {
            System.out.println("A temperatura está acima de trinta e cinco graus: Muito quente.");
        }
    
    }
}