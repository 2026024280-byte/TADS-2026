/*
Tipo de combustível
Leia o tipo de combustível ("G" para gasolina ou "E" para etanol) e a quantidade de litros abastecida.
Considere:
    • gasolina: R$ 6,20 por litro;
    • etanol: R$ 4,10 por litro.
Se forem abastecidos mais de 30 litros, conceda 5% de desconto. Informe o tipo, o valor antes do desconto, o desconto e o valor final. Caso o tipo informado seja inválido, mostre uma mensagem de erro.

*/

import java.util.Scanner;

public class L02Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (G para gasolina, E para etanol): ");
        String tipo = scanner.next().toUpperCase();

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        double precoPorLitro = 0;
        String nomeCombustivel = "";

        // Validação do tipo de combustível
        if (tipo.equals("G")) {
            precoPorLitro = 6.20;
            nomeCombustivel = "Gasolina";
        } else if (tipo.equals("E")) {
            precoPorLitro = 4.10;
            nomeCombustivel = "Etanol";
        } else {
            System.out.println("Erro: Tipo de combustível inválido!");
            scanner.close();
            return; // Encerra o programa
        }

        // Cálculos
        double valorAntesDesconto = litros * precoPorLitro;
        double desconto = 0;

        if (litros > 30) {
            desconto = valorAntesDesconto * 0.05;
        }

        double valorFinal = valorAntesDesconto - desconto;

        // Exibição dos resultados formatados
        System.out.println("\n--- Resumo do Abastecimento ---");
        System.out.println("Tipo: " + nomeCombustivel);
        System.out.printf("Valor antes do desconto: R$ %.2f\n", valorAntesDesconto);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
