import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.print("Digite um valor inteiro (4 <= value <= 50): ");
            value = scanner.nextInt();
            if (value < 4 || value > 50) {
                System.out.println("Valor inválido.");
            }
        } while (value < 4 || value > 50);
        int[][] matriz = new int[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                matriz[i][j] = (i + 1) + (j + 1);
            }
        }
        System.out.println("Os resultados são:");
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.println("[" + (i + 1) + "][" + (j + 1) + "] = " + matriz[i][j]);
            }
        }
    }
}