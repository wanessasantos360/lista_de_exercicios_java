import java.util.Scanner;

public class Q12 {

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

        int r = scanner.nextInt();
        int s = scanner.nextInt();

        if (l * c != r * s) {
            System.out.println("Reorganizacao impossivel");
        } else {
            int[] elementos = new int[l * c];
            int idx = 0;

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    elementos[idx++] = matriz[i][j];
                }
            }

            int[][] nova = new int[r][s];
            idx = 0;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    nova[i][j] = elementos[idx++];
                }
            }

            System.out.println("Matriz reorganizada:");

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    if (j < s - 1) {
                        System.out.print(nova[i][j] + " ");
                    } else {
                        System.out.println(nova[i][j]);
                    }
                }
            }
        }

        scanner.close();
    }
}