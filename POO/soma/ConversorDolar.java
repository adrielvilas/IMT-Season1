import java.util.Scanner;

public class ConversorDolar{
  static public void main(String... args){
    Scanner leitor = new Scanner(System.in);
    float cotacaoDolar, valorDolar, valorReais;

    System.out.println("Digite a cotação: ");
    cotacaoDolar = leitor.nextFloat();
    System.out.println("Digite a quantidade de dolares: ");
    valorDolar = leitor.nextFloat();

    valorReais = valorDolar * cotacaoDolar;
    System.out.printf("%.2f x %.2f = %.2f", valorReais, valorDolar, valorReais);
  }
}
