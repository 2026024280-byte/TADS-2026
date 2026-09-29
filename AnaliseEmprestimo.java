 /*
Leia:
salário mensal;
valor solicitado de empréstimo;
quantidade de parcelas.
Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.

O empréstimo será aprovado somente se:
a parcela não ultrapassar 30% do salário;
o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida.
*/

import java.util.Scanner;

public class AnaliseEmprestimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o salário mensal: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor solicitado de empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        // 1. Validação de valores nulos ou negativos
        if (salario <= 0 || valorEmprestimo <= 0 || parcelas <= 0) {
            System.out.println("Erro: Nenhum dos valores informados pode ser zero ou negativo.");
            sc.close();
            return; // Encerra o programa
        }

        // 2. Cálculo do valor da parcela
        double valorParcela = valorEmprestimo / parcelas;

        // Limites para aprovação
        double limiteParcela = salario * 0.30;
        double limiteEmprestimoTotal = salario * 10;

        boolean aprovado = true;

        System.out.println("\n--- Resultado da Análise ---");

        // 3. Verificação das condições de aprovação
        if (valorParcela > limiteParcela) {
            System.out.printf("- Reprovado: O valor da parcela (R$ %.2f) ultrapassa 30%% do salário (R$ %.2f).\n", 
                    valorParcela, limiteParcela);
            aprovado = false;
        }

        if (valorEmprestimo > limiteEmprestimoTotal) {
            System.out.printf("- Reprovado: O valor solicitado (R$ %.2f) ultrapassa 10 vezes o salário (R$ %.2f).\n", 
                    valorEmprestimo, limiteEmprestimoTotal);
            aprovado = false;
        }

        // 4. Conclusão
        if (aprovado) {
            System.out.println("Empréstimo APROVADO!");
            System.out.printf("Serão %d parcelas de R$ %.2f\n", parcelas, valorParcela);
        } else {
            System.out.println("Empréstimo REPROVADO pelos motivos listados acima.");
        }

        sc.close();
    }
}