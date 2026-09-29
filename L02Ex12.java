/*
Classificação por idade
Leia a idade de uma pessoa e classifique-a como:
    • Criança: de 0 a 11 anos;
    • Adolescente: de 12 a 17 anos;
    • Adulto: de 18 a 59 anos;
    • Idoso: 60 anos ou mais.
Caso a idade seja negativa, informe que o valor é inválido.
*/

import java.util.Scanner;

public class L02Ex12 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Qual sua idade:");

int idade = sc.nextInt();

if (idade < 0) {
    System.out.println("Valor inválido.");
} else if (idade <= 11) {
    System.out.println("Criança");
} else if (idade <= 17) {
     System.out.println("Adolescente");
} else if (idade <= 59) {
    System.out.println("Adulto");
} else {
    System.out.println("Idoso");
        
sc.close();

    } 
}
}   





