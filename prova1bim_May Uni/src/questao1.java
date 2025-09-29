import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] guiche1 = new int[5];
        int[] guiche2 = new int[5];
        int[] intersenhas = new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Senha de atendimento atual Guichê 1: ");
            guiche1[i] = sc.nextInt();
            System.out.println("Senha de atendimento atual Guichê 2: ");
            guiche2[i] = sc.nextInt();
        }
        int i1 = 0; int i2 = 0;
        for(int i=0; i<10; i++){
            if(i % 2 == 0){
                intersenhas[i] = guiche1[i1]; i1++;
            }
            else {
                intersenhas[i] = guiche2[i2]; i2++;
            }
        }
        System.out.println("\nFila final de atendimento: ");
        for(int i=0; i<10; i++){
            System.out.print(intersenhas[i] + " ");
        }
    }
}