/*
Pode dividir?
Leia dois números reais. Antes de realizar a divisão do primeiro pelo segundo, verifique se o segundo número é diferente de zero. Se for zero, apresente uma mensagem informando que a divisão não pode ser realizada.
*/

import java.util.Scanner; 

public class L02Ex4 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Digite dois numeros reais:");

float primeiro = sc.nextFloat();
float segundo = sc.nextFloat();

float divisao = primeiro / segundo;
    

if (segundo == 0) {
    System.out.println("A divisão não podera ser realizada.");
}else  {
    System.out.println("Divisão dos dois numeros:" + divisao);

} 
    
    
}    
}
