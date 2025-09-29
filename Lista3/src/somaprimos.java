import java.util.Scanner;

public class somaprimos {
    public static void main(String[] args) {
        /* meu código:
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
        }*/
         //correção
         Scanner sc = new Scanner(System.in);
        int num = 0;
        if (num == 0 && num == 1){
            System.out.println("O número não é primo");
            return;
        }
        boolean primo = true;
        System.out.println("Digite um número positivo: ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println("O número " + num + " é primo.");
        }
        else {
            System.out.println("O número " + num + " não é primo.");
        }
        //o código se torna bem mais eficiente desta forma!
    }
}

