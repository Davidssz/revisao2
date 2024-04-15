import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0; 
        while (true) {
            System.out.print("Digite um valor inteiro (<= 20): ");
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                if (value <= 20) {
                    break; 
                } else {
                    System.out.println("O valor deve ser menor ou igual a 20.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, insira um número inteiro.");
            }
        }
        System.out.println("O valor inserido é: " + value);

        
        for (int i = 1; i <= 10; i++) {
            value *= 2;
            System.out.println(i + ": " + value);
        }
    }
}