import java.util.Scanner;

public class somapares {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;
        System.out.println("Insira um número positivo para fazer a operação: ");
        num = sc.nextInt();
        if(num<0){
            System.out.println("Digite um número positivo!");
            num = sc.nextInt();
        }
        else{
            for (int i=1; i<=num; i++){
                if (i  % 2 == 0){
                    soma = soma + i;
                }
            }
        System.out.println("A soma dos números pares contidos em " +
                num + " é : " + soma);
        }
    }
}