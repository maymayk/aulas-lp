import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];
        float[][] medidas = new float[10][7];
        int cont = 0;
        int soma = 0;
        int somapaciente = 0;
        int somatotal = 0;
        int pmma = 0; // pmma = paciente com maior média arterial


        //leitura de dados, soma das medidas e contagem
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do(a) " + (i+1) +"º paciente: ");
            nome[i] = sc.next();
            somapaciente = 0;
            System.out.println("Informe as medições: ");
            for (int j = 0; j < 7; j++) {
                System.out.print((j + 1) + "º dia: ");
                medidas[i][j] = sc.nextInt();
                somapaciente += medidas[i][j];
                somatotal += medidas[i][j];
                if (medidas[i][j] > 140) {
                    cont = cont + 1;
                }
            }
        }

        //exibição dos dados
        System.out.println("TABELA DE DADOS");
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + nome[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(medidas[i][j] + "  ");
            }
        }

        int mediatotal = somatotal / 7;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                int mediapaciente = somapaciente / 7;
                if (mediapaciente > pmma){
                    pmma = mediapaciente;
                    System.out.println("\n\nPaciente com maior média de pressão arterial: " + nome[i]);
                }
            }
        }
        System.out.println("Número de medições acima de 140mmHg: " + cont);
        System.out.println("Média de pressão arterial por dia (considerando todos os pacientes): " + mediatotal + "mmHg");
    }
}