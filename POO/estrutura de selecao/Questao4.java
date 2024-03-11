import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é o maior");
        } else if (num2 > num1) {
            System.out.println(num2 + " é o maior");
        } else {
            System.out.println("Estes números são iguais");
        }
        scanner.close();
    }
}
