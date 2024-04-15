import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0; 
        while (true) {
            System.out.print("Digite um valor inteiro (>1 e <100): ");
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value > 1 && value < 100) {
                    break;
                } else {
                    System.out.println("O valor deve estar entre 1 e 99. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

        System.out.println("O valor inserido é: " + value);

        System.out.println("Os 10 valores anteriores são:");
        for (int i = value ; i >= value - 9; i--) {
            if (i >= 1) {
                System.out.println(i);
            }
        }
    }
}