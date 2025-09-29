public class interseçaovet {
    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];
        System.out.println("Vetor A: ");
        for(int i=0; i<10; i++){
            vetA[i] = (int) (Math.random() * 11);
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\n\nVetor B: ");
        for(int i=0; i<10; i++){
            vetB[i] = (int) (Math.random() * 21);
            System.out.print(vetB[i] + " ");
        }
        int iC = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(vetA[i] == vetB[j]){
                    vetC[iC] = vetA[i]; iC++;
                }
            }
        }
        System.out.println("\n\nVetor C: ");
        for(int i=0; i<10; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}
