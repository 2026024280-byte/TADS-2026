/*
Nota suficiente
Leia a nota final de um aluno. Informe APROVADO quando a 
nota for maior ou igual a 6.0 e REPROVADO caso contrário.
*/

import java.util.Scanner;

public class L02Ex5 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a nota final do aluno:");
    
    float nota = sc.nextFloat();
    
    if (nota >= 6.0) {
        System.out.println("APROVADO");
    } else {
        System.out.println("REPROVADO");
    }   
}

}
