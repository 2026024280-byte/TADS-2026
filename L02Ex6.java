import java.util.Scanner; 

public class L02Ex6 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em C°:");

    float temperatura = sc.nextFloat();

    if (temperatura > 30) {
        System.out.println("Temperatura elevada");
    } else  {
        System.out.println("Temperatura normal");
    } 

    
}    
}

        