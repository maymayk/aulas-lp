import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];
        int[][] matrizSoma = new int[tamanho][tamanho];

        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        // Leitura da segunda matriz
        System.out.println("\nDigite os elementos da segunda matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Soma das matrizes
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibe a matriz resultante
        System.out.println("\nMatriz resultante (soma de A + B):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

