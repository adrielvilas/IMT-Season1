import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
    double nota1, nota2, media;

        //while
        int cont = 1;
        while(cont <= 3){
            nota1 = parseDouble(showInputDialog("Digite a primeira nota: "));
            nota2 = parseDouble(showInputDialog("Digite a segunda nota: "));
            media = (nota1 + nota2) / 2;
            showMessageDialog(null, "media: " + media);
            if(media >=6){
                showMessageDialog(null, "Aprovado");
            } else {
                showMessageDialog(null, "Reprovado");
            }
            cont = cont + 1;

        }

    }	
}
