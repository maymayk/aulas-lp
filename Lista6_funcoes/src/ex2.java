public class ex2 {
    public static void alterarNumero(int x){
        x = 100;
    }
    public static void alterarVetor(int[] v){
        v[0] = 100;
    }
    public static void main(String[] args) {
     int a = 100;
     alterarNumero(a);
     System.out.println("Valor de a = " + a);

     int[] vetor = {10, 20, 30};
     alterarVetor(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}