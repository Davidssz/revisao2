import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0; 

        while (true) {
            System.out.print("Digite um valor inteiro (>1 e < 100): ");
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value > 0 && value < 100) {
                    break;
                } else {
                    System.out.println("O valor deve estar entre 1 e 99");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, insira um número inteiro.");
            }
        }
        int[] vetor = new int[10];

        vetor[0] = value;

        for (int i = 1; i < 10; i++) {
            vetor[i] = vetor[i - 1] + 1;
        }
        System.out.print("Os valores do vetor são: ");
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i]);
            if (i < 9) {
                System.out.print(", ");
            }
            soma += vetor[i];
        }
        System.out.println();
        System.out.println("A soma de todos os valores é: " + soma);
    }
}