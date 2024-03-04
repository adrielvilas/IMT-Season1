import javax.swing.JOptionPane;

public class exercicio05 {
    public static void main(String[] args) {

        // lendo 3 números inteiros
        String inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        int numero1 = Integer.parseInt(inputNumero1);

        String inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        int numero2 = Integer.parseInt(inputNumero2);

        String inputNumero3 = JOptionPane.showInputDialog("Digite o terceiro número inteiro");
        int numero3 = Integer.parseInt(inputNumero3);

        // soma dos 3 números
        int soma = numero1 + numero2 + numero3;
        JOptionPane.showMessageDialog(null,"A soma dos números é = " + soma);

        // média dos 3 números
        int media = (numero1 + numero2 + numero3) / 3;
        JOptionPane.showMessageDialog(null,"A média dos números é = " + media);

        // multiplicação dos 3 números
        int multiplicacao = numero1 * numero2 * numero3;
        JOptionPane.showMessageDialog(null, "O produto dos números é = " + multiplicacao);

        // maior desses 3 números
        if (numero1 >= numero2 && numero1 >= numero3) {
            JOptionPane.showMessageDialog(null, "Primeiro maior do que o segundo");

        // menor desses 3 números
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            JOptionPane.showMessageDialog(null, "Segundo maior do que o primeiro");
        }
    }
}
