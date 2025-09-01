import java.util.Scanner;

public class ex2teams {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;
        System.out.println("Insira um número para fazer a operação: ");
        num = sc.nextInt();
        for (int i=1; i<=num; i++){
            if (i  % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("A soma dos números pares contidos em " +
                num + " é : " + soma);
    }
}
