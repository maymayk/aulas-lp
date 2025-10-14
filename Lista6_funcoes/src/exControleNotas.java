import java.util.Scanner;

public class exControleNotas {
    public static void aplicarBonus(float[] notas){
        for (int i = 0; i < notas.length; i++) {
            notas[i] += 0.5f;
            if (notas[i] > 10.0f) {
                notas[i] = 10.0f;
            }
        }
    }
    public static float calcularMedia(float[] media){
        float soma = 0;
        for (int i = 0; i < media.length; i++) {
            soma += media[i];
        }
        return (soma / media.length);
    }
    public static void exibirRelatorio(String nome, float[] notas, float media){
        System.out.println("Relatório do aluno: " + nome);

        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nMédia: " + media);
    }
    public static void main(String[] args) {
        float[] notas = new float[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe as notas do aluno: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i+1) + "ª nota: ");
            notas[i] = sc.nextFloat();
        }
        aplicarBonus(notas);
        float media = calcularMedia(notas);
        exibirRelatorio(nome, notas, media);
    }
}
