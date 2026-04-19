import java.util.Scanner;

public class Q20 {

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

        int maiorComprimento = 0;
        int indiceLinha = -1;
        int indiceInicial = -1;
        int indiceFinal = -1;

        for (int i = 0; i < l; i++) {
            int comprimentoAtual = 0;
            int inicioAtual = -1;

            for (int j = 0; j < c; j++) {
                if (matriz[i][j] > k) {
                    if (comprimentoAtual == 0) {
                        inicioAtual = j;
                    }
                    comprimentoAtual++;

                    if (comprimentoAtual > maiorComprimento) {
                        maiorComprimento = comprimentoAtual;
                        indiceLinha = i;
                        indiceInicial = inicioAtual;
                        indiceFinal = j;
                    }
                } else {
                    comprimentoAtual = 0;
                    inicioAtual = -1;
                }
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + maiorComprimento);
        System.out.println("Linha da sequencia: " + indiceLinha);
        System.out.println("Indice inicial: " + indiceInicial);
        System.out.println("Indice final: " + indiceFinal);

        scanner.close();
    }
}