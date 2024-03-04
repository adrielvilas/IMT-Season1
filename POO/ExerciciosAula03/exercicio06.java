import javax.swing.JOptionPane;

public class exercicio06 {
    public static void main(String[] args) {
        // Leitura do saldo da conta
        String inputSaldo = JOptionPane.showInputDialog("Digite o saldo da conta:");
        double saldo = Double.parseDouble(inputSaldo);

        // Leitura do valor a ser sacado
        String inputSaque = JOptionPane.showInputDialog("Digite o valor a ser sacado:");
        double saque = Double.parseDouble(inputSaque);
        
        // Verifica se o valor a ser sacado é menor ou igual ao saldo
        if (saque <= saldo) {
            // calcula o novo saldo após o saque
            double novoSaldo = saldo - saque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Novo saldo: " + novoSaldo);

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque. Seu saldo está insuficiente");
        }
    }
}
