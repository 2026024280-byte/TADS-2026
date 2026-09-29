import java.util.Scanner;

public class L02Ex33 {
    public static void main(String[] args) {
        /*
        Leia o valor da compra e a forma de pagamento:

        "PIX";
        "DINHEIRO";
        "CARTAO".
        Regras:

        PIX: 10% de desconto;
        dinheiro: 5% de desconto;
        cartão: sem desconto.
        Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de 2%.

        Mostre desconto, taxa e valor final. Formas de pagamento diferentes das três indicadas devem ser rejeitadas.
        */

        Scanner sc = new Scanner(System.in);
        String formaPagamento;
        float valor, desconto = 0, taxa = 0, valorFinal = 0;
        boolean mostrarSaida = true;

        // entrada
        System.out.println("informe o valor e a forma de pagamento (PIX, DINHEIRO, CARTAO)");
        valor = sc.nextFloat();
        formaPagamento = sc.next();

        // processamento
        if (formaPagamento.equals("PIX")) {
            desconto = 0.1f * valor;
            valorFinal = valor - desconto;
        } else if (formaPagamento.equals("DINHEIRO")) {
            desconto = 0.05f * valor;
            valorFinal = valor - desconto;
        } else if (formaPagamento.equals("CARTAO")) {
            if (valor > 1000) {
                taxa = 0.02f * valor;
            }
            valorFinal = valor + taxa;
            
        } else { 
            System.out.println("FORMA DE PAGAMENTO INVALIDA");
            mostrarSaida = false;
        }

        // flag
        if (mostrarSaida) {
            System.out.println("VALOR DO PRODUTO " + valor);
            System.out.println("DESCONTO: " + desconto);
            System.out.println("TAXA: " + taxa);
            System.out.println("VALOR FINAL " + valorFinal);
        }
    }
}
