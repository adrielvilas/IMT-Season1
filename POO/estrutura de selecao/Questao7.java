import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da peça de roupa: ");
        double valor = scanner.nextDouble();

        System.out.print(
                "0 - Compra à vista \n1 - Compra parcelada no cartão \n2 - Crediário\nDigite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                double valorDesconto = valor * 0.9;
                System.out.println("Valor da peça de roupa com desconto: " + valorDesconto);
                break;
            case 1:
                System.out.print("Digite o número de parcelas desejado: ");
                int numParcelas = scanner.nextInt();
                double valorParcela = valor / numParcelas;
                System.out.println("Valor da parcela: " + valorParcela);
                break;
            case 2:
                System.out.print("Digite o número de parcelas desejado: ");
                int numParcelasCred = scanner.nextInt();
                double valorTotalComJuros = valor * 1.1;
                double valorParcelaCred = valorTotalComJuros / numParcelasCred;
                System.out.println("Valor de cada parcela com juros: " + valorParcelaCred);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}
