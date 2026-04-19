import java.util.Scanner;

public class Q7 {

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

        int maiorSoma = Integer.MIN_VALUE;
        int[] somas = new int[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somas[i] += matriz[i][j];
            }
            if (somas[i] > maiorSoma) {
                maiorSoma = somas[i];
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.println("Soma da linha " + i + ": " + somas[i]);
        }

        System.out.println("Maior soma: " + maiorSoma);

        scanner.close();
    }
}