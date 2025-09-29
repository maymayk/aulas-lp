import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os 16 números da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Elementos que não se repetem: ");
        boolean primeiro = true;

        // Verifica cada elemento da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int atual = matriz[i][j];
                int cont = 0;

                // Conta quantas vezes o valor aparece na matriz inteira
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        if (matriz[x][y] == atual) cont++;
                    }
                }

                if (cont == 1) { // aparece só uma vez
                    if (!primeiro) System.out.print(", ");
                    System.out.print(atual);
                    primeiro = false;
                }
            }
        }

        if (primeiro) { // nenhum elemento único
            System.out.print("nenhum");
        }
        System.out.println();
    }
}
