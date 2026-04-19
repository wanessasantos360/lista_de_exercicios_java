import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] somasLinhas = new int[n];
        int[] somasColunas = new int[n];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                somasLinhas[i] += matriz[i][j];
                somasColunas[j] += matriz[i][j];
            }
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }

        int referencia = somasLinhas[0];
        boolean consistente = true;

        for (int i = 0; i < n; i++) {
            if (somasLinhas[i] != referencia || somasColunas[i] != referencia) {
                consistente = false;
                break;
            }
        }

        if (somaPrincipal != referencia || somaSecundaria != referencia) {
            consistente = false;
        }

        if (consistente) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + referencia);
        } else {
            int diferentes = 0;

            for (int i = 1; i < n; i++) {
                if (somasLinhas[i] != referencia) {
                    diferentes++;
                }
            }

            for (int j = 0; j < n; j++) {
                if (somasColunas[j] != referencia) {
                    diferentes++;
                }
            }

            if (somaPrincipal != referencia) {
                diferentes++;
            }

            if (somaSecundaria != referencia) {
                diferentes++;
            }

            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferentes);
        }

        scanner.close();
    }
}