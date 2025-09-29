public class intercalaçaovet {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[10];
        System.out.println("Vetor 1: ");
        for(int i=0; i<5; i++){
            vet1[i] = (int) (Math.random() * 11);
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\n\nVetor 2: ");
        for(int i=0; i<5; i++){
            vet2[i] = (int) (Math.random() * 21);
            System.out.print(vet2[i] + " ");
        }
        int i1 = 0; int i2 = 0;
        for(int i=0; i<10; i++){
            if(i % 2 == 0){
                vet3[i] = vet1[i1]; i1++;
            }
            else {
                vet3[i] = vet2[i2]; i2++;
            }
        }
        System.out.println("\n\nVetor 3: ");
        for(int i=0; i<10; i++){
            System.out.print(vet3[i] + " ");
        }
    }
}
