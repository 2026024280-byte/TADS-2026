/*
Número múltiplo de 5
Leia um número inteiro e informe se ele é ou não múltiplo de 5
*/

import java.util.Scanner;

public class L02Ex8 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite um numero:");

float numero = sc.nextFloat();

float multiplo = numero * 5 / 5;
float restMultiplo = numero % 5;

if (restMultiplo == 0 || restMultiplo == 1) {
    System.out.println("Multiplo de 5."); 
}else{
    System.out.println("Não é multiplo de 5.");
}

}    
}
