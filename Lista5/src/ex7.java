import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = 3;
        int colunas = 2;
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz 3x2:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Criação da transposta 2x3
        int[][] transposta = new int[colunas][linhas];
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        // Exibe a matriz original
        System.out.println("\nMatriz original (3x2):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibe a matriz transposta
        System.out.println("\nMatriz transposta (2x3):");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
