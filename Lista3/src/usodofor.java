import java.util.Scanner;

public class usodofor {
    public static void main (String[] args){
        //Exercício 1 - Tabuada personalizada
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Informe um número para visualizar a tabuada: ");
        num = sc.nextInt();
        int mult;
        for(int i=1; i<=10; i++){
            mult = i*num;
            System.out.println(num + "x" + i + "=" + mult );
        }
    }
}