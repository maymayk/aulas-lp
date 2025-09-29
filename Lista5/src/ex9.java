import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        int[][] C = new int[2][2]; // resultado

        // Leitura da matriz A
        System.out.println("Digite os elementos da matriz A (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Leitura da matriz B
        System.out.println("Digite os elementos da matriz B (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Cálculo de C = A x B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int soma = 0;
                for (int k = 0; k < 3; k++) { // número de colunas de A = número de linhas de B
                    soma += A[i][k] * B[k][j];
                }
                C[i][j] = soma;
            }
        }

        // Exibição da matriz resultante
        System.out.println("Matriz C (2x2) = A x B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}