import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1. CDB; \n2. LCA/LCI; \n3. Poupança; \n4.Ações; \n5. Sair.");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Renda Fixa com IR sobre lucro.\n");
                    break;
                case 2:
                    System.out.println("Renda Fixa sem IR sobre lucro.\n");
                    break;
                case 3:
                    System.out.println("Rendimento baixo, liquidez imediata.\n");
                    break;
                case 4:
                    System.out.println("Renda variável, maior risco.\n");
                    break;
                case 5:
                    System.out.println("O programa será encerrado.");
                    break;
                default: System.out.println("Opção inválida.\n");
            }
        } while (opcao != 5);
    }
}