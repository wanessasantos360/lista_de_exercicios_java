import java.util.Scanner;

public class Q14 {

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
        double somaTotal = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                somasLinhas[i] += matriz[i][j];
                somasColunas[j] += matriz[i][j];
                somaTotal += matriz[i][j];
            }
        }

        int indiceMaiorLinha = 0;
        for (int i = 1; i < l; i++) {
            if (somasLinhas[i] > somasLinhas[indiceMaiorLinha]) {
                indiceMaiorLinha = i;
            }
        }

        int indiceMenorColuna = 0;
        for (int j = 1; j < c; j++) {
            if (somasColunas[j] < somasColunas[indiceMenorColuna]) {
                indiceMenorColuna = j;
            }
        }

        double media = somaTotal / (l * c);

        int quantidadeAcima = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > media) {
                    quantidadeAcima++;
                }
            }
        }

        System.out.println("Linha com maior soma: " + indiceMaiorLinha);
        System.out.println("Coluna com menor soma: " + indiceMenorColuna);
        System.out.printf("Media geral: %.2f%n", media);
        System.out.println("Quantidade acima da media: " + quantidadeAcima);

        scanner.close();
    }
}