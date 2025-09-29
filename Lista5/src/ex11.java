import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Leitura da matriz 5x5
        System.out.println("Digite os 25 números da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Solicita o número a ser buscado
        System.out.print("Digite o número X que deseja buscar: ");
        int X = sc.nextInt();

        boolean encontrado = false;

        // Percorre a matriz e verifica onde X aparece
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Número encontrado na posição: (" + i + ", " + j + ")");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
    }
}
