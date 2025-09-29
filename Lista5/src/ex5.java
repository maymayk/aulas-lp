import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        float[][] notas = new float[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o nome do(a) aluno(a): ");
            nome[i] = sc.next();
            System.out.println("Informe as notas: ");
            for (int j = 0; j < 4; j++) {
                System.out.print((j+1) + "º nota: ");
                notas[i][j] = sc.nextFloat();
            }
        }
        float soma = 0;
        for (int i = 0; i < 3; i++) {
            soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            System.out.println("A média do(a) aluno(a) " + nome[i] + " é " + soma/4);
        }
    }
}
