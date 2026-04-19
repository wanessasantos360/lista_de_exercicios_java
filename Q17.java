import java.util.Scanner;

public class Q17 {

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

        int maiorSomaLinha = Integer.MIN_VALUE;
        int indiceMaiorLinha = 0;

        for (int i = 0; i < l; i++) {
            int somaAtual = matriz[i][0];
            int maiorSomaAtual = matriz[i][0];

            for (int j = 1; j < c; j++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                maiorSomaAtual = Math.max(maiorSomaAtual, somaAtual);
            }

            if (maiorSomaAtual > maiorSomaLinha) {
                maiorSomaLinha = maiorSomaAtual;
                indiceMaiorLinha = i;
            }
        }

        int maiorSomaColuna = Integer.MIN_VALUE;
        int indiceMaiorColuna = 0;

        for (int j = 0; j < c; j++) {
            int somaAtual = matriz[0][j];
            int maiorSomaAtual = matriz[0][j];

            for (int i = 1; i < l; i++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                maiorSomaAtual = Math.max(maiorSomaAtual, somaAtual);
            }

            if (maiorSomaAtual > maiorSomaColuna) {
                maiorSomaColuna = maiorSomaAtual;
                indiceMaiorColuna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maiorSomaLinha);
        System.out.println("Linha da maior soma contigua: " + indiceMaiorLinha);
        System.out.println("Maior soma contigua em coluna: " + maiorSomaColuna);
        System.out.println("Coluna da maior soma contigua: " + indiceMaiorColuna);

        scanner.close();
    }
}