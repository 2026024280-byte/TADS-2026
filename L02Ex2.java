/*
Maior de idade
Leia a idade de uma pessoa e informe se ela é maior de idade (idade >= 18) ou menor de idade.
*/

import java.util.Scanner; 

public class L02Ex2 {
public static void main(String[] args) {

Scanner sc = new  Scanner(System.in);

System.out.println("Digite sua idade:");

int idade = sc.nextInt();

if (idade >= 18) {
  System.out.println("Maior de idade.");  
} else {
    System.out.println("Menor de idade:");
}


}
}
