import java.util.Scanner;

public class vetordobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[5];
        int vet2[] = new int[5];

        for(int i=0; i< 5; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            vet1[i] = sc.nextInt();
        }
        for (int i=0; i<5; i++){
            vet2[i] = (vet1[i] * 2);
        }
        System.out.println("O vetor criado com os números informados: ");
        for (int i=0; i<5; i++){
            System.out.println(vet1[i]);
        }
        System.out.println("Vetor com o dobro dos elementos: ");
        for (int i=0; i<5; i++){
            System.out.println(vet2[i]);
        }
    }
}
