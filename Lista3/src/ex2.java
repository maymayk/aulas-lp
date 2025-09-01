import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        float valor = sc.nextFloat();
        float soma = 0;
        float contclient = 0;
        while (valor > 0){
            soma = soma + valor;
            contclient++;
            System.out.println("Digite o valor da compra (negativo para encerrar): ");
            valor = sc.nextFloat();
        }
        float media = 0;
        if (contclient !=0){
            media = soma/contclient;
        }

        System.out.println("Total de vendas: R$ " + soma + "\nClientes atendidos: "
            + contclient + "\nMédia de valor gasto por cliente: R$ " + media);
    }
}
