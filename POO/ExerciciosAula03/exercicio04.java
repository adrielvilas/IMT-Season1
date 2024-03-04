import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {
        
        // Solicita ao usuário para inserir dois números inteiros 
        String inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        int numero1 = Integer.parseInt(inputNumero1);
        
        String inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        int numero2 = Integer.parseInt(inputNumero2);
        
        // Verifica qual número é maior ou se são iguais
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " é o maior");
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, numero2 + " é o maior");
        } else {
            JOptionPane.showMessageDialog(null, "Estes números são iguais");
        }
    }    
}
