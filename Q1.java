import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] consumo = new int[n];

        for (int i = 0; i < n; i++) {
            consumo[i] = scanner.nextInt();
        }

        int consumoTotal = 0;
        for (int i = 0; i < n; i++) {
            consumoTotal += consumo[i];
        }

        double consumoMedio = (double) consumoTotal / n;

        int diasAcimaMedia = 0;
        for (int i = 0; i < n; i++) {
            if (consumo[i] > consumoMedio) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Consumo total: " + consumoTotal);
        System.out.printf("Consumo medio: %.2f%n", consumoMedio);
        System.out.println("Dias acima da media: " + diasAcimaMedia);

        scanner.close();
    }
}