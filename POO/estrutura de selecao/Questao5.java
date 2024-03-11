import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um numero inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um numero inteiro: ");
        int num3 = scanner.nextInt();

        System.out.println("A soma dos tres numeros é: " + (num1 + num2 + num3));
        System.out.println("A media dos tres numeros é: " + (num1 + num2 + num3 / 3));
        System.out.println("O produto dos tres numeros é: " + (num1 * num2 * num3));
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior numero e: " + maior);

        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor numero e: " + menor);
        scanner.close();
    }
}
