import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite um número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O " + num1 + " é maior que " + num2);
        } else {
            System.out.println("O " + num2 + " é maior que " + num1);
        }
        scanner.close();
    }
}