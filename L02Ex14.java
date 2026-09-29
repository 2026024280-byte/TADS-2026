/*
Menor e maior entre três valores
Leia três números inteiros e informe:
    • o maior valor;
    • o menor valor.
Considere que os valores podem ser iguais.
*/

import java.util.Scanner;

public class L02Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Verifica se todos são iguais
        if (a == b && b == c) {
            System.out.println("Todos os valores são iguais: " + a);
        } else {
            // Lógica normal para maior
            int maior = a;
            if (b > maior) maior = b;
            if (c > maior) maior = c;

            // Lógica normal para menor
            int menor = a;
            if (b < menor) menor = b;
            if (c < menor) menor = c;

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
        }

        scanner.close();
    }
}
