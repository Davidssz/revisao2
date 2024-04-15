import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        // Solicita ao usuário um valor entre 4 e 50
        do {
            System.out.print("Digite um valor inteiro (4 <= value <= 50): ");
            value = scanner.nextInt();
            if (value < 4 || value > 50) {
                System.out.println("Valor inválido.");
            }
        } while (value < 4 || value > 50);
        int[][] N = new int[value][value];
        int[][] Z = new int[value][value];
        preencherMatrizes(N, Z);
        int[][] soma = new int[value][value];
        somarMatrizes(N, Z, soma);
        System.out.println("A matriz N é:");
        imprimirMatriz(N);
        System.out.println("A matriz Z é:");
        imprimirMatriz(Z);
        System.out.println("A soma das matrizes é: ");
        imprimirMatriz(soma);
    }

    public static void preencherMatrizes(int[][] N, int[][] Z) {
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                N[i][j] = i + j;
                Z[i][j] = i + j;
            }
        }
    }
    public static void somarMatrizes(int[][] N, int[][] Z, int[][] soma) {
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i].length; j++) {
                soma[i][j] = N[i][j] + Z[i][j];
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}