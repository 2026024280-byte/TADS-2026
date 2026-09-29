import java.util.Scanner;

public class L02Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite a região de entrega (S - Sul / SE - Sudeste / CO - Centro-Oeste): ");
        String regiao = sc.nextLine().toUpperCase(); 

        double valorFrete = 0;
        String nomeRegiao = "";
        boolean regiaoValida = true;

        // Definição do valor do frete por região
        switch (regiao) {
            case "S":
                valorFrete = 20.00;
                nomeRegiao = "Sul";
                break;
            case "SE":
                valorFrete = 30.00;
                nomeRegiao = "Sudeste";
                break;
            case "CO":
                valorFrete = 40.00;
                nomeRegiao = "Centro-Oeste";
                break;
            default:
                regiaoValida = false;
                break;
        }

        // Validação da região e exibição dos resultados
        if (!regiaoValida) {
            System.out.println("Erro: Região de entrega inválida!");
        } else {
            // Aplicação da regra de frete grátis
            if (valorCompra >= 500.00) {
                valorFrete = 0.00;
                nomeRegiao += " (Frete Grátis aplicado)";
            }

            double totalFinal = valorCompra + valorFrete;

            // Exibição dos resultados formatados
            System.out.println("\n--- RESUMO DO PEDIDO ---");
            System.out.printf("Valor da compra: R$ %.2f\n", valorCompra);
            System.out.println("Região de entrega: " + nomeRegiao);
            System.out.printf("Valor do frete: R$ %.2f\n", valorFrete);
            System.out.printf("Total final: R$ %.2f\n", totalFinal);
        }

        sc.close();
    }
}
