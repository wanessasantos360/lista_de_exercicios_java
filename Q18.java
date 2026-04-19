import java.util.Scanner;

public class Q18 {

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

        int quantidadePicos = 0;
        int maiorPico = Integer.MIN_VALUE;
        int picoI = -1;
        int picoJ = -1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                boolean pico = true;

                if (i > 0 && matriz[i][j] <= matriz[i - 1][j]) {
                    pico = false;
                }
                if (i < l - 1 && matriz[i][j] <= matriz[i + 1][j]) {
                    pico = false;
                }
                if (j > 0 && matriz[i][j] <= matriz[i][j - 1]) {
                    pico = false;
                }
                if (j < c - 1 && matriz[i][j] <= matriz[i][j + 1]) {
                    pico = false;
                }

                if (pico) {
                    quantidadePicos++;
                    if (matriz[i][j] > maiorPico) {
                        maiorPico = matriz[i][j];
                        picoI = i;
                        picoJ = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + quantidadePicos);
        System.out.println("Posicao do maior ponto de pico: " + picoI + " " + picoJ);
        System.out.println("Valor do maior ponto de pico: " + maiorPico);

        scanner.close();
    }
}