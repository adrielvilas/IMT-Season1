import javax.swing.JOptionPane;

public class Historia {
    public static void main(String[] args) {
        // Solicitar entrada do usuário
        String name = JOptionPane.showInputDialog("Digite um nome:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite uma altura em metros:"));
        String animal = JOptionPane.showInputDialog("Digite um animal:");
        int numFriends = Integer.parseInt(JOptionPane.showInputDialog("Quantos amigos você tem?"));
        double money = Double.parseDouble(JOptionPane.showInputDialog("Quanto dinheiro você tem?"));
        String verb = JOptionPane.showInputDialog("Digite um verbo:");
        String adjective = JOptionPane.showInputDialog("Digite um adjetivo:");
        int years = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de anos:"));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em quilômetros:"));
        
        // Realizar cálculos com entradas do usuário
        int futureAge = age + years;
        double newHeight = height * 100; // Convertendo altura para centímetros
        double savings = money * years;
        double distancePerYear = distance / years;
        
        // Construir história com entradas do usuário
        String story = "Era uma vez, uma pessoa chamada " + name + ".\n";
        story += "Esta pessoa tinha " + age + " anos de idade, mas daqui a " + years + " anos, ela terá " + futureAge + " anos.\n";
        story += "Ela tinha uma altura de " + height + " metros, o que equivale a " + newHeight + " centímetros.\n";
        story += "Seu animal favorito era um " + animal + ", e ela tinha " + numFriends + " amigos.\n";
        story += "Ela tinha " + money + " reais em sua conta bancária, mas depois de " + years + " anos, ela terá " + savings + " reais.\n";
        story += "Ela gostava de " + verb + " no parque perto de sua casa e apreciava a vista " + adjective + " do céu.\n";
        story += "Ela estava planejando viajar uma distância de " + distance + " quilômetros, e a cada ano ela percorreria em média " + distancePerYear + " quilômetros.\n";
        
        // Exibir a história resultante
        JOptionPane.showMessageDialog(null, story);
    }
}
