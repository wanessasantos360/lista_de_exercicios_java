import java.util.Scanner;

public class Q13 {

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

        int k = scanner.nextInt();

        int maior = matriz[0][0];
        double soma = 0;
        int quantidade = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                soma += matriz[i][j];
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] > k) {
                    quantidade++;
                }
            }
        }

        double media = soma / (l * c);

        System.out.printf("Media dos elementos: %.2f%n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + quantidade);

        scanner.close();
    }
}