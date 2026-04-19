import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] saidas = new int[n];
        int[] chegadas = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                saidas[i] += matriz[i][j];
                chegadas[j] += matriz[i][j];
            }
        }

        int indiceMaiorDiferenca = 0;
        int maiorDiferenca = Math.abs(saidas[0] - chegadas[0]);

        for (int i = 1; i < n; i++) {
            int diferenca = Math.abs(saidas[i] - chegadas[i]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                indiceMaiorDiferenca = i;
            }
        }

        boolean simetrica = true;
        for (int i = 0; i < n && simetrica; i++) {
            for (int j = 0; j < n && simetrica; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Chegadas no terminal " + i + ": " + chegadas[i]);
        }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + indiceMaiorDiferenca);
        System.out.println("Matriz simetrica: " + (simetrica ? "sim" : "nao"));

        scanner.close();
    }
}