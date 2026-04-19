import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] producao = new int[n];

        for (int i = 0; i < n; i++) {
            producao[i] = scanner.nextInt();
        }

        int maior = producao[0];
        int menor = producao[0];
        int maiorCrescimento = 0;

        for (int i = 1; i < n; i++) {
            if (producao[i] > maior) {
                maior = producao[i];
            }
            if (producao[i] < menor) {
                menor = producao[i];
            }
            int diferenca = producao[i] - producao[i - 1];
            if (diferenca > maiorCrescimento) {
                maiorCrescimento = diferenca;
            }
        }

        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + maiorCrescimento);

        scanner.close();
    }
}