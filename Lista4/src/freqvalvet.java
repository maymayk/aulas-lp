public class freqvalvet {
    public static void main(String[] args) {
     int[] vet = new int[10];
     for(int i=0; i<10; i++){
         vet[i] = (int) (Math.random() * 11);
     }
     boolean[] contado = new boolean[vet.length];
        System.out.println("Frequência de valores: ");
        for (int i = 0; i < vet.length; i++) {
            if (!contado[i]){
                int cont = 1;
                for (int j = i+1; j < vet.length; j++) {
                    if (vet[i] == vet[j]){
                        cont++;
                        contado[j] = true;
                    }
                }
                System.out.println("Número " + vet[i] + " aparece " + cont + " vez(es)");
            }
        }
    }
}
