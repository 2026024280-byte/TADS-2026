/*
Validação de usuário e senha
Leia um nome de usuário e uma senha.
    • usuário correto: "admin";
    • senha correta: "java123".
O programa deve informar separadamente se o usuário está incorreto ou se a senha está incorreta. O acesso só deve ser permitido quando os dois estiverem corretos.

*/

import java.util.Scanner;

public class L02Ex19 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o usuário: ");
        String usuarioDigitado = sc.nextLine();

        System.out.println("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        // Validação separada
        boolean usuarioCorreto = usuarioDigitado.equals("admin");
        boolean senhaCorreta = senhaDigitada.equals("java123");

        if (!usuarioCorreto) {
            System.out.println("Usuário incorreto.");
        }

        if (!senhaCorreta) {
            System.out.println("Senha incorreta.");
        }

        // Verificação final de acesso
        if (usuarioCorreto && senhaCorreta) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado.");
        }


        sc.close();
        
         }
}

