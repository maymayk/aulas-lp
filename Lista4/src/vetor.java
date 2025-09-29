//import java.util.Scanner;

public class vetor {
    public static void main (String[] args){
        int vetor[] = new int[10]; //criação do vetor
        for (int i = 0; i < 10; i++){
            //gera um número entre 0 a 9 e converte para inteiro
            vetor[i] = (int) (Math.random() * 10);
        }
        //mostra o resultado
        System.out.println("Elementos do vetor: ");
        for(int i=0; i<10; i++){
            System.out.println(vetor[i] + " ");
        }
    }
}
