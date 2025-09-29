import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 21);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            soma = 0;
            for (int j = 0; j < mat.length; j++) {
                soma += mat[i][j];
            }
            System.out.print("\nA soma dos elementos da linha " + i + " é = " + soma);
        }
    }
}
