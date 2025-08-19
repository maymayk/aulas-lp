import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Exercício 3
        System.out.println("Nome do aluno: ");
        String name = entrada.nextLine();
        System.out.println("Informe a nota da Prova 1: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Peso da nota 1: ");
        float peso1 = entrada.nextFloat();
        System.out.println("Informe a nota da Prova 2: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Peso da nota 2: ");
        float peso2 = entrada.nextFloat();
        System.out.println("Informe a nota da Prova 3: ");
        float nota3 = entrada.nextFloat();
        System.out.println("Peso da nota 3: ");
        float peso3 = entrada.nextFloat();

        //cálculo da média ponderada:
        float mediapond = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) /
                (peso1 + peso2 + peso3);
        String situacao = "";
        float notamin = 0f;

        if (mediapond >= 7.0f) {
            situacao = "Aprovado";
        } else if (mediapond >= 4.0f && mediapond < 7.0f) {
            situacao = "Exame";
            notamin = 10.0f - mediapond;
        } else {
            situacao = "Reprovado";
        }
        System.out.println("BOLETIM");
        System.out.println("\nNome do aluno: " + nome);
        System.out.println("\nMédia Ponderada: " + mediapond);
        System.out.println("\nSituação: " + situacao);

        if (situacao.equals("Exame")) {
            System.out.println("Nota mínima no exame para aprovação: " + notamin);
        }
    }
}
