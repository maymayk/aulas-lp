import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz: ");
        int N = sc.nextInt();
                /*System.out.println("Insira a quantidade de colunas: ");
                int col = sc.nextInt(); (tinha feito de outra forma)*/
        int[][] mat = new int[N][N];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 21);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j){
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}