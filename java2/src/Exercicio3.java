import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0; 
        while (true) {
            System.out.print("Digite um valor inteiro (>1 e <= 1000): ");
            String input = scanner.nextLine();

            try {
                value = Integer.parseInt(input);
                if (value > 1 && value <= 1000) {
                    break; 
                } else {
                    System.out.println("O valor deve estar entre 1 e 1000. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
        int[] vetor = new int[value];
        for (int i = 0; i < value; i++) {
            vetor[i] = i + 1;
        }
        System.out.println("O vetor resultante é:");
        for (int i = 0; i < value; i++) {
            System.out.print(vetor[i]);
            if (i < value - 1) {
                System.out.print(", ");
            }
        }
    }
}