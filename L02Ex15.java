/*
Classificação de nota
Leia uma nota de 0 a 10 e classifique:
    • >= 9: Excelente;
    • >= 7: Bom;
    • >= 6: Suficiente;
    • < 6: Insuficiente.
Se a nota estiver fora do intervalo de 0 a 10, mostre uma mensagem de erro.
*/

import java.util.Scanner;

public class L02Ex15 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite uma nota de 0 a 10:");

float nota = sc.nextFloat();

if (nota < 0) {
    System.out.println("Número inválido.");
}else if (nota >= 9) {  
    System.out.println("Excelente.");
}else if (nota >= 7) { 
    System.out.println("Bom.");
}else if (nota >= 6) { 
    System.out.println("Suficiente.");
}else if (nota >= 0 ) { 
    System.out.println("Insuficiente.");
} 
    

sc.close();

}    
}
