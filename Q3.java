import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            precos[i] = scanner.nextDouble();
        }

        int p = scanner.nextInt();

        double totalAntes = 0;
        double totalDepois = 0;

        double[] novosPrecos = new double[n];

        for (int i = 0; i < n; i++) {
            totalAntes += precos[i];
            novosPrecos[i] = precos[i] * (1 + p / 100.0);
            totalDepois += novosPrecos[i];
        }

        System.out.println("Novos precos:");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.printf("%.2f ", novosPrecos[i]);
            } else {
                System.out.printf("%.2f%n", novosPrecos[i]);
            }
        }

        System.out.printf("Total antes do reajuste: %.2f%n", totalAntes);
        System.out.printf("Total depois do reajuste: %.2f%n", totalDepois);

        scanner.close();
    }
}