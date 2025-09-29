public class maimenvet {
    public static void main(String[] args){
        int[] vet = new int[8];
        for(int i=0; i<8; i++){
            vet[i] = (int) (Math.random() * 21);
        }
        int menor = vet[0]; int posMenor = 0;
        int maior = vet[0]; int posMaior = 0;
        for (int i=1; i<8; i++){
            if (vet[i] < menor){
                menor = vet[i];
                posMenor = i;
            }
            if(vet[i] > maior){
                maior = vet[i];
                posMaior = i;
            }
        }
        System.out.println("Vetor gerado: ");
        for (int i=0; i<8; i++){
            System.out.println(vet[i]);
        }
        System.out.println("Menor elemento: " + menor + " \nPosição: " + posMenor);
        System.out.println("Maior elemento: " + maior + "  \nPosição: " + posMaior);
    }
}
