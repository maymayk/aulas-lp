import java.util.Scanner;

public class ex3teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.println("Digite um número para testar se é primo: ");
        num = sc.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                soma = soma + 1;
            }
        }
        if (soma == 2){
            System.out.println("O número " + num + " é primo.");
        }
         else {
            System.out.println("O número " + num + " não é primo.");
        }
    }
}
