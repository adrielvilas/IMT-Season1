import javax.swing.JOptionPane;

public class IfESuasVariacoes {
    public static void main(String[] args) {
        // declaração de variaveis
        final double VALOR_MAXIMO = 10;
        final double VALOR_MINIMO = 0;
        double notafinal; 
        // entrada
        notafinal = Double.parseDouble(
            JOptionPane.showInputDialog(
                null, 
                "Digite a nota",
                "Qual a nota?",
                JOptionPane.QUESTION_MESSAGE
            )
        );
        // processamento e saída
        if (notafinal >= VALOR_MINIMO && notafinal <= VALOR_MAXIMO) { // ninho de passarinho 
            if (notafinal >= 6) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Aprovado",
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Recuperação", 
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Nota inválida! A nota deve estar entre " + VALOR_MINIMO + " e " + VALOR_MAXIMO, 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
