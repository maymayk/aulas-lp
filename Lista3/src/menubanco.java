import java.util.Scanner;

public class menubanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        float saldo = 1000f;
        do {
            System.out.println("\n ===== MENU BANCÁRIO ===== \n" +
                    "Escolha uma opção: \n" +
                    "1 - Consultar saldo \n" +
                    "2 - Depositar \n" +
                    "3 - Sacar \n" +
                    "4 - Extrato\n" + //adição da opção "extrato"
                     "0 - Sair \n" );
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("\tO SEU SALDO É R$ " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("\tDIGITE O VALOR (MAIOR QUE 0) " +
                            "QUE SERÁ DEPOSITADO: R$ ");
                    float dep = sc.nextFloat(); /*variável local "dep": não é necessário declarar lá em cima,
                                                bem como a variável usada para armazenar os valores de saque*/
                    saldo = saldo + dep;
                    //System.out.println("\tO SEU SALDO ATUAL É R$ " + saldo + "\n"); (CORREÇÃO)
                    break;
                case 3:
                    System.out.println("\tINFORME O VALOR DO SAQUE: R$ ");
                    float saque = sc.nextFloat();
                    if (saque < saldo){ //também poderia ser: "if(saldo>=saque)"
                        saldo = saldo - saque;
                        //System.out.println("\tSALDO ATUAL É R$ " + saldo + "\n"); (CORREÇÃO)
                    }
                    else {
                        System.out.println("\tNÃO É POSSÍVEL REALIZAR O SAQUE DO VALOR DESEJADO" +
                                " POIS O SALDO É INSUFICIENTE\n\tSALDO DISPONÍVEL PARA EFETUAR SAQUE É R$ " + saldo + "\n");
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