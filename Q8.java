import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int c = scanner.nextInt();

        double[][] matriz = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        int aprovados = 0;
        double[] mediasAlunos = new double[l];

        for (int i = 0; i < l; i++) {
            double soma = 0;
            for (int j = 0; j < c; j++) {
                soma += matriz[i][j];
            }
            mediasAlunos[i] = soma / c;
            if (mediasAlunos[i] >= 7.0) {
                aprovados++;
            }
        }

        double[] mediasAvaliacoes = new double[c];

        for (int j = 0; j < c; j++) {
            double soma = 0;
            for (int i = 0; i < l; i++) {
                soma += matriz[i][j];
            }
            mediasAvaliacoes[j] = soma / l;
        }

        for (int i = 0; i < l; i++) {
            System.out.printf("Media do aluno %d: %.2f%n", i, mediasAlunos[i]);
        }

        for (int j = 0; j < c; j++) {
            System.out.printf("Media da avaliacao %d: %.2f%n", j, mediasAvaliacoes[j]);
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);

        scanner.close();
    }
}