/*
Positivo, negativo e paridade
Leia um número inteiro. Primeiro informe se ele é positivo, negativo ou zero. 
Depois, caso seja diferente de zero, informe também se ele é par ou ímpar.
*/

import java.util.Scanner;

public class L02Ex11 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite um numero inteiro:");

int numero = sc.nextInt();

int divisao = numero / 2;
int restoDiv = numero % 2;

if (numero > 0) {
    System.out.println("Numero positivo.");   
}if (numero < 0 ) {
    System.out.println("Numero negativo.");
}if (numero == 0){
    System.out.println("Numero é zero.");
}if (restoDiv == 0) {
    System.out.println("Numero é Par.");
  
}else {
    System.out.println("Numero é Impar.");
}

sc.close();

}   
}

   

