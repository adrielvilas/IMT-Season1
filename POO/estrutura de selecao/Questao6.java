import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta bancária: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo remanescente: " + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
        scanner.close();
    }
}