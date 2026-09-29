/*
Média de duas notas
Leia duas notas, calcule a média e informe:
    • Aprovado: média >= 7;
    • Recuperação: média >= 5 e < 7;
    • Reprovado: média < 5.
Antes do cálculo, verifique se ambas as notas estão entre 0 e 10. Caso alguma seja inválida, não calcule a média.
*/

import java.util.Scanner;

public class L02Ex18 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);  

System.out.println("Digite as duas nota do aluno:");

float nota1 = sc.nextFloat();
float nota2 = sc.nextFloat();

float media = (nota1 + nota2) / 2;

if (nota1 < 0 || nota2 < 0) { 
System.out.println("Calculo inválido.");
}else if (media >= 7) {
    System.out.println("Aprovado: " );
}else if (media >= 5 && media < 7) {
    System.out.println("Recuperação: ");
}else if (media < 5) {
    System.out.println("Reprovado. ");
}
 
sc.close();

}    
}
