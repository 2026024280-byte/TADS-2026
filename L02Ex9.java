/*
Senha simples
Leia uma senha inteira. Se a senha digitada for 4321, 
mostre "Acesso permitido". Caso contrário, mostre "Senha incorreta".
*/

import java.util.Scanner;

public class L02Ex9 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Digite uma senha de 4 numeros:");

int senha = sc.nextInt(); 

if (senha == 4321) {
    System.out.println("Acesso permitido.");
    
}else {
    System.out.println("Senha incoreta. ");
}

}    
}
