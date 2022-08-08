import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        float num1 = sc.nextInt();
        System.out.println("Digite um segundo número: ");
        float num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }


        sc.close();
    }
}
