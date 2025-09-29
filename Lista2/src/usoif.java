import java.util.Scanner;
public class usoif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Exercício 1; leitura dos dados:
        System.out.println("Digite o nome do paciente: ");
        String nome = entrada.nextLine();
        System.out.println("Insira seu peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Insira sua altura (em metro): ");
        float altura = entrada.nextFloat();
        //cálculo do IMC:
        float IMC = peso / (altura * altura);
        String classificacao = "";
        if(IMC < 18.5f){
            classificacao = "Abaixo do peso";
        } else if(IMC>=18.5f && IMC<25f){
            classificacao = "Peso normal";
        } else if(IMC >= 25f && IMC < 30f) {
            classificacao = "Sobrepeso";
        } else if(IMC >=30f){
            classificacao = "Obesidade";
        } else {
            classificacao = "Não foi possível classificar."
        }
        System.out.println("Paciente " + nome + " tem IMC = " + IMC +
                "e está classificado como " + classificacao);
    }
}