/*
Maior entre três números
Leia três números inteiros e informe qual é o maior. 
O programa também deve identificar o caso em que os três valores são iguais.
*/

import java.util.Scanner;

public class L02Ex13 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite 3 numeros inteiros:");

int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();

if (num1 > num2) {
    System.out.println("Este numero é maior: " + num1);
}else if (num2 > num3) {
    System.out.println("Este numero é maior: " + num2);
}else if (num1 == num2 && num2 == num3) {
    System.out.println("Numeros iguais.");
}else {
    System.out.println("Este numero é maior: " + num3);    
}







}    
}
