/*
ingresso de cinema
Leia a idade do cliente, informe se ele é estudante ("S" ou "N") e leia o preço normal do ingresso.
Regras:
    • menores de 12 anos pagam 50%;
    • pessoas com 60 anos ou mais pagam 50%;
    • entre 12 e 59 anos, estudantes pagam 50%;
    • demais clientes pagam o preço integral.
A idade não pode ser negativa e a opção de estudante deve ser válida.
*/

import java.util.Scanner;

public class L02Ex23 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

// Entrada de dados
        System.out.print("Digite a idade do cliente: ");
        int idade = sc.nextInt();

        System.out.print("O cliente é estudante? (S - Sim / N - Não): ");
        String estudante = sc.next().toUpperCase(); // Lê e converte para maiúsculo

        System.out.print("Digite o preço normal do ingresso (R$): ");
        double precoNormal = sc.nextDouble();

        // 1. Validação dos dados de entrada
        boolean idadeValida = idade >= 0;
        boolean estudanteValido = estudante.equals("S") || estudante.equals("N");
        boolean precoValido = precoNormal > 0;

        if (!idadeValida) {
            System.out.println("Erro: A idade não pode ser negativa.");
        } else if (!estudanteValido) {
            System.out.println("Erro: Opção de estudante inválida. Digite 'S' ou 'N'.");
        } else if (!precoValido) {
            System.out.println("Erro: O preço do ingresso deve ser maior que zero.");
        } else {
            // 2. Processamento das regras de desconto
            double precoFinal = precoNormal;
            String tipoIngresso = "Inteira";

            // Menores de 12 ou maiores de 59 anos pagam meia automaticamente
            if (idade < 12 || idade >= 60) {
                precoFinal = precoNormal * 0.50;
                tipoIngresso = "Meia-Entrada (Idade)";
            } 
            // Entre 12 e 59 anos, precisa ser estudante para pagar meia
            else if (estudante.equals("S")) {
                precoFinal = precoNormal * 0.50;
                tipoIngresso = "Meia-Entrada (Estudante)";
            }

            // 3. Exibição dos resultados formatados
            System.out.println("\n--- DETALHES DO INGRESSO ---");
            System.out.println("Idade do cliente: " + idade + " anos");
            System.out.println("Tipo de ingresso: " + tipoIngresso);
            System.out.printf("Valor final a pagar: R$ %.2f\n", precoFinal);
        }

        sc.close();
    }
}
