import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mat.length; i++){
            System.out.println("Informe os valores da linha " + (i+1));
            for (int j = 0; j < mat.length; j++) {
                System.out.println("Informe os valores da coluna " + (j+1));
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}