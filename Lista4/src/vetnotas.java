import java.util.Scanner;

public class vetnotas {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        float[] notas = new float[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do aluno: ");
            nomes[i] = sc.next();
            System.out.println("Informe a nota do aluno: ");
            notas[i] = sc.nextFloat();
        }
        float media = 0;
        for (int i = 0; i < 10; i++) {
            media += notas[i];
        }
        media = media / 10;
        for (int i = 0; i < 10; i++){
            if(notas[i] > media){
                System.out.println("Aluno(a): " + nomes[i] + " teve nota acima da média.");
            }
        }
    }
}
