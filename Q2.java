import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextDouble();
        }

        double maiorNota = notas[0];
        double menorNota = notas[0];
        double somaNotas = 0;
        int aprovados = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            somaNotas += notas[i];
            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = somaNotas / n;

        System.out.printf("Maior nota: %.1f%n", maiorNota);
        System.out.printf("Menor nota: %.1f%n", menorNota);
        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);

        scanner.close();
    }
}