import java.sql.SQLOutput;
import java.util.Scanner;

public class ex4teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        float saldo = 1000f;
        float dep = 0;
        float saque = 0;
        do {
            System.out.println("\n ===== MENU BANCÁRIO ===== \n" +
                    "Escolha uma opção: \n" +
                    "1 - Consultar saldo \n" +
                    "2 - Depositar \n" +
                    "3 - Sacar \n" +
                    "0 - Sair \n" );
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("\tO SEU SALDO É R$ " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("\tDIGITE O VALOR (MAIOR QUE 0) " +
                            "QUE SERÁ DEPOSITADO: R$ ");
                    dep = sc.nextFloat();
                    saldo = saldo + dep;
                    System.out.println("\tO SEU SALDO ATUAL É R$ " + saldo + "\n");
                    break;
                case 3:
                    System.out.println("\tINFORME O VALOR DO SAQUE: R$ ");
                    saque = sc.nextFloat();
                    if (saque < saldo){
                        saldo = saldo - saque;
                        System.out.println("\tSALDO ATUAL É R$ " + saldo + "\n");
                    }
                    else {
                        System.out.println("\tNÃO É POSSÍVEL REALIZAR O SAQUE DO VALOR DESEJADO. \n" +
                                "\tSALDO DISPONÍVEL PARA EFETUAR SAQUE É R$ " + saldo + "\n");
                    }
                    break;
                case 0:
                    System.out.println("O SISTEMA SERÁ ENCERRADO. " +
                            "\nOBRIGADO POR USAR NOSSOS SERVIÇOS!");
                    break;
                default:
                    System.out.println("A OPÇÃO INFORMADA É INVÁLIDA \n" +
                            "TENTE NOVAMENTE\n");
            }

        }while (opcao != 0);
    }
}
