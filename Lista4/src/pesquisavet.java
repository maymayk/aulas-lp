import java.util.Scanner;

public class pesquisavet {
    public static void main(String[] args) {
        int vet[] = new int[15];
        for (int i=0; i<15; i++){
            vet[i] = (int) (Math.random() * 21);
        }
        for (int i=0; i<15; i++){
            System.out.println(vet[i]);
        }
        System.out.println("Pesquise um número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean encontrado = false;
        for (int i=0; i<15; i++){
            if (num == vet[i]){
                System.out.println("O número buscado está na posição: " + i);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Número não encontrado.");
        }
    }
}