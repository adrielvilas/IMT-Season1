public class Chickens2 {
  public static void main(String[] args) {
    
    int dia1 = 100;
    int dia2 = 121;
    int dia3 = 117;

    // média diaria
    int media = (dia1 + dia2 + dia3) / 3;
    System.out.println("A média diária é: " + media);

    // média mensal
    int mes = media * 30; // Definindo a variável 'mes'
    System.out.println("A média mensal é: " + mes); // Mostrando a variável 'mes'

    // lucro mensal
    double lucro = mes * 0.18; // Definindo a variável 'lucro' e usando um tipo de dado adequado
    System.out.println("O lucro mensal é: " + lucro); // Mostrando a variável 'lucro'

  }
}


//  tirar duvida com o sor, era p sair:
//  média diaria = 112.6666666667 
//  média mensal = 3380.0 
//  lucro mensal = 608.4