import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        double numeroReal = scanner.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal2 = scanner.nextDouble();

        if (numeroReal == numeroReal2) {
            System.out.println("Os dois numeros reais são iguais");
            scanner.close();
        }
    }
}