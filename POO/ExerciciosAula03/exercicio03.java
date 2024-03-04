import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {
        
        // leitura do primeiro número inteiro
        String inputNumero1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        int numero1 = Integer.parseInt(inputNumero1);

        // leitura do segundo número inteiro
        String inputNumero2 = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        int numero2 = Integer.parseInt(inputNumero2);

        if (numero1 >= numero2) {
            JOptionPane.showMessageDialog(null,"Primeiro número, menor que o segundo");

        } else {
            JOptionPane.showMessageDialog(null,"Segundo número, maior que o primeiro");
            
        }
     
    }    
}
