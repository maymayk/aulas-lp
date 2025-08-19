import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Exercício 2; leitura dos dados:
        System.out.println("Insira o nome do produto: ");
        String produto = entrada.nextLine();
        System.out.println("Insira a quantidade comprada: ");
        int quant = entrada.nextInt();
        System.out.println("Informe o preço unitário: ");
        float precoun = entrada.nextFloat();
        System.out.println("Selecione a forma de pagamento: \n1 - Pix; \n2-Cartão; \n3-Boleto");
        int pagto = entrada.nextInt();
        //cálculo do subtotal:
        float subtotal = quant * precoun;
        //desconto por faixa
        float desconto = 0f;
        if(subtotal >=100.00f && subtotal <300.00f){
            desconto = 5f;
        } else if(subtotal >=300.00f){
            desconto = 10f;
        }
        float valordesc = subtotal - (subtotal * (desconto/100));
        float ajuste;

        //if (pagto == 1) { // Pix
        //  ajuste = -2f;
        //formapagto = "Pix";
        //} else if (pagto == 2) { // Cartão
        //  ajuste = 1.5f;
        //formapagto = "Cartão";
        //} else if (pagto == 3) { // Boleto
        //ajuste = 0f;
        //formapagto = "Boleto";
        //}
        //float totalfinal = valordesc + (valordesc * (ajuste / 100f));

        //Exibição de resultados
        switch (pagto){
            case 1: ajuste = valordesc - valordesc*2/100;
                break;
            case 2: ajuste = valordesc + valordesc*1.5f/100;
                break;
            case 3: ajuste = valordesc;
                break;
            default: ajuste = valordesc;
        }
        System.out.println("RESUMO DA COMPRA\n");
        System.out.println("Produto: " + produto + "\nQuantidade comprada: " +
                quant + "\nSubtotal: " + subtotal + "\nDesconto: " + desconto +
                "\nForma de pagamento: " + formapagto + "\nAjuste: " +
                ajuste + "\nTotal Final: " + totalfinal);
    }
}
