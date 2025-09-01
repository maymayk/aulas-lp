import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int contador = 1;
        float nota;
        Scanner sc = new Scanner(System.in);
        float soma = 0;

        while (contador <=5){
            System.out.println("Informe a nota " + contador);
            nota = sc.nextFloat();
            soma += nota;
            contador++;
        }
        float media = soma/5;
        System.out.println("A média das notas é: " + media);
    }
}