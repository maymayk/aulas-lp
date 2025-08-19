import java.util.Scanner;

// todo programa Java começa definindo uma classe
public class Main {
    //definição da função "main", executada quando o programa roda
    public static void main(String[] args) {
        // comando de saída - a função "println" pertence a classe "System"
        // função é sempre escrita com letra inicial minúscula, enquanto as classes são escritas com iniciais maiúsculas
        System.out.println("\nOlá mundo!");
        System.out.println("Bom dia!");

        //Java é fortemente tipado (float, char, int, double, boolean)
        // declara variável e atribui valor a ela
        // diferença entre float e double: double consegue armazenar números maiores (64 bits), enquanto float vai até 32bits
        // double é mais usado para notação científica
        char letra = 'A';
        float nota = 6.5f;
        int idade = 19;
        boolean resposta = true;
        String nome = "Maria";

        //exibe os dados das variáveis para o usuário
        System.out.println("\nLetra: " + letra + "\nNota: " + nota +
                "\nIdade: " + idade + "\nResposta: " + resposta);

        //comando de entrada:
        //utilização da classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite seu nome: ");
        String name = entrada.next();

        //calcula a soma das notas
        float soma = nota1 + nota2;
        float media = soma / 2;
        System.out.println("Soma das notas: " + soma);
        System.out.println("A média de " + name + " foi " + media);

        //exercício 1:
        System.out.println("\nDigite seu nome: ");
        String funcionario = entrada.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        float hrstrab = entrada.nextFloat();
        System.out.println("Digite o valor da hora de trabalho: R$ ");
        float valorhr = entrada.nextFloat();
        float salario = hrstrab * valorhr;

        System.out.println("O funcionário " + funcionario + " trabalhou durante " + hrstrab +
                " horas e receberá R$ " + salario);
    }
}