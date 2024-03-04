import javax.swing.JOptionPane;

public class exercicio02 {
    public static void main(String[] args) {
        
        // leitura do primeiro numero real
        String primeiroreal = JOptionPane.showInputDialog("Digite o primeiro numero real");
        Double numeroreal = Double.parseDouble(primeiroreal);

        // leitura do segundo numero real
        String segundoreal = JOptionPane.showInputDialog("Digite o segundo numero real");
        Double numeroreal2 = Double.parseDouble(segundoreal);

        if (primeiroreal == segundoreal) {
            JOptionPane.showMessageDialog(null, "Os dois numeros sao iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois numeros sao diferentes");
        }
    }
}

// tirar duvida com o sor (QUARTA-FEIRA*)
