import java.util.Scanner;
public class ex1 {
    public static void mostrarDobro(int x){
    System.out.println("O dobro de " + x +" é " + (x * 2));
    }

    public static int calcularQuadrado(int x){
        return  x * x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();
        mostrarDobro(num);
        System.out.println("O quadrado de " + num + " é " + calcularQuadrado(num));
    }

}