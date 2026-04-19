import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean diagonalZeros = true;
        for (int i = 0; i < n; i++) {
            if (matriz[i][i] != 0) {
                diagonalZeros = false;
                break;
            }
        }

        int maiorValor = Integer.MIN_VALUE;
        int maiorI = -1;
        int maiorJ = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
            }
        }

        int[] somasLinhas = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                somasLinhas[i] += matriz[i][j];
            }
        }

        int indiceMenorLinha = 0;
        for (int i = 1; i < n; i++) {
            if (somasLinhas[i] < somasLinhas[indiceMenorLinha]) {
                indiceMenorLinha = i;
            }
        }

        System.out.println("Diagonal principal com zeros: " + (diagonalZeros ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maiorValor + " (" + maiorI + "," + maiorJ + ")");
        System.out.println("Linha com menor soma: " + indiceMenorLinha);

        scanner.close();
    }
}