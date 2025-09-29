public class questao2 {
    public static void main(String[] args) {
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int[] codscomuns = new int[10];
        System.out.println("Lista de códigos Oficina 1: ");
        for(int i=0; i<10; i++){
            lista1[i] = (int) (Math.random() * 11);
            System.out.print(lista1[i] + " ");
        }
        System.out.println("\n\nLista de códigos Oficina 2: ");
        for(int i=0; i<10; i++){
            lista2[i] = (int) (Math.random() * 21);
            System.out.print(lista2[i] + " ");
        }
        int iC = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(lista1[i] == lista2[j]){
                    codscomuns[iC] = lista1[i]; iC++;
                }
            }
        }
        //não sei como faz pra não repetir os elementos
        System.out.println("\n\nParticipantes inscritos em ambas as oficinas: ");
        for(int i=0; i<10; i++){
            System.out.print(codscomuns[i] + " ");
        }
        }
    }

