import java.util.Scanner;

public class alunosaprep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[10];
        float[] notas = new float[10];
        String[] aprovados = new String[alunos.length];
        String[] reprovados = new String[alunos.length];
        int qtdAprov = 0;
        int qtdReprov = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Informe o nome do aluno: ");
            alunos[i] = sc.next();
            System.out.println("Informe a primeira nota: ");
            notas[i] = sc.nextFloat();
            if (notas[i] >= 7.0f) {
                aprovados[qtdAprov++] = alunos[i];
            } else {
                reprovados[qtdReprov++] = alunos[i];
            }
        }
        System.out.print("\nAprovados: ");
        for (int i = 0; i < qtdAprov; i++) {
            System.out.print(aprovados[i]);
            if (i < qtdAprov - 1) System.out.print(", ");
        }

        System.out.print("\nReprovados: ");
        for (int i = 0; i < qtdReprov; i++) {
            System.out.print(reprovados[i]);
            if (i < qtdReprov - 1) System.out.print(", ");
        }
    }
}
