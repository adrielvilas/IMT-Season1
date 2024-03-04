import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
        
        // Solicita ao usuário para inserir um número inteiro
        String inputInteiro = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numeroInteiro = Integer.parseInt(inputInteiro);

        // Solicita ao usuário para inserir um número real
        String inputReal = JOptionPane.showInputDialog("Digite um número real:");
        double numeroReal = Double.parseDouble(inputReal);

        // Verifica se o número inteiro é menor que o número real
        if (numeroInteiro < numeroReal) {
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real.");
        } else {
            JOptionPane.showMessageDialog(null, "O programa terminou.");
        }
    }
}
