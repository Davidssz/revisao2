import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.print("Digite um valor inteiro (4 <= value <= 50): ");
            value = scanner.nextInt();
            if (value < 4 || value > 50) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (value < 4 || value > 50);

        int[][] matriz = new int[value][value];
        inserirValores(matriz, scanner);

        System.out.println("Os resultados são:");
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "] = " + matriz[i][j]);
            }
        }
    }
    public static void inserirValores(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}