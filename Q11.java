import java.util.Scanner;

public class Q11 {

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

        int[][] transposta = new int[c][l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                if (j < l - 1) {
                    System.out.print(transposta[i][j] + " ");
                } else {
                    System.out.println(transposta[i][j]);
                }
            }
        }

        scanner.close();
    }
}