import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] somasLinhas = new int[l];
        int[] somasColunas = new int[c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somasLinhas[i] += matriz[i][j];
                somasColunas[j] += matriz[i][j];
            }
        }

        int indiceMaiorLinha = 0;
        int indiceMaiorColuna = 0;

        for (int i = 1; i < l; i++) {
            if (somasLinhas[i] > somasLinhas[indiceMaiorLinha]) {
                indiceMaiorLinha = i;
            }
        }

        for (int j = 1; j < c; j++) {
            if (somasColunas[j] > somasColunas[indiceMaiorColuna]) {
                indiceMaiorColuna = j;
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println("Soma da linha " + i + ": " + somasLinhas[i]);
        }

        for (int j = 0; j < c; j++) {
            System.out.println("Soma da coluna " + j + ": " + somasColunas[j]);
        }

        System.out.println("Linha com maior soma: " + indiceMaiorLinha);
        System.out.println("Coluna com maior soma: " + indiceMaiorColuna);

        scanner.close();
    }
}