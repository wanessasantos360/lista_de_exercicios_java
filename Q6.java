import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] tempos = new double[n];

        for (int i = 0; i < n; i++) {
            tempos[i] = scanner.nextDouble();
        }

        double menor = tempos[0];
        double maior = tempos[0];

        for (int i = 1; i < n; i++) {
            if (tempos[i] < menor) {
                menor = tempos[i];
            }
            if (tempos[i] > maior) {
                maior = tempos[i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (tempos[j] > tempos[j + 1]) {
                    double temp = tempos[j];
                    tempos[j] = tempos[j + 1];
                    tempos[j + 1] = temp;
                }
            }
        }

        System.out.printf("Melhor tempo: %.1f%n", menor);
        System.out.printf("Pior tempo: %.1f%n", maior);
        System.out.println("Tres melhores tempos:");
        System.out.printf("%.1f %.1f %.1f%n", tempos[0], tempos[1], tempos[2]);

        scanner.close();
    }
}