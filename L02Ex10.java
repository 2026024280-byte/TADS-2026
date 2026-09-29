/*
Comparação entre dois valores
Leia dois números inteiros e informe qual deles é o maior. 
Caso sejam iguais, informe "Valores iguais".
*/

import java.util.Scanner;

public class L02Ex10 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Digite dois numeros inteiros:");

int num1 = sc.nextInt();
int num2 = sc.nextInt();

if (num1 > num2) {
    System.out.println("Este é o maior: " + num1); 
}if (num2 > num1) {
    System.out.println("Este é o maior: " + num2);
}if (num2 == num1) {
    System.out.println("Numeros iguais:");
}


}    
}
