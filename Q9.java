import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }

        int somaTotal;

        if (n % 2 != 0) {
            int centro = matriz[n / 2][n / 2];
            somaTotal = somaPrincipal + somaSecundaria - centro;
        } else {
            somaTotal = somaPrincipal + somaSecundaria;
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaSecundaria);
        System.out.println("Soma total das diagonais sem repetir o centro: " + somaTotal);

        scanner.close();
    }
}