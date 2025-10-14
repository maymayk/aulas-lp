import java.util.Scanner;

public class exCNcorrecao {
    public static String entradaDados(float[] vet){
        String no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        no = sc.next();
        System.out.println("Digite as três notas do aluno: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextFloat();
        }
        return no;
    }
    public static float calcularMedia(float[] vet){
        float soma = 0;
        for (float v : vet) {
            soma += v;
        }
        return soma/vet.length;
    }
    public static void aplicarBonus(float[] vet){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = vet[i] + 0.5f;
        }
    }
    public static void exibirRelatorio(String no, float[] vet, float me){
        System.out.println("Notas do aluno " + no + ": ");
        for (float v : vet){
            System.out.print(v + " ");
        }
        System.out.println("A média é: " + me);
    }
    public static void main(String[] args) {
        float[] notas = new float[3];
        String nome = entradaDados(notas);
        aplicarBonus(notas);
        float media = calcularMedia(notas);
        System.out.println("A média das notas é: " + media);
        exibirRelatorio(nome, notas, media);
    }
}
