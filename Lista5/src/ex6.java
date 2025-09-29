public class ex6 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = (int) (Math.random() * 101);
            }
        }
        int maior = mat[0][0];
        int iMaior = 0; int jMaior = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > maior){
                    maior = mat[i][j]; iMaior = i; jMaior = j;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("O maior elemento da matriz é: " + maior + " e sua posição é lin[" + iMaior + "] " +
                "col[" + jMaior + "]");
    }
}
