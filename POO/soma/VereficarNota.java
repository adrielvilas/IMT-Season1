import java.util.Scanner;

public class VereficarNota{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("qual e a sua nota ?");
        int nota = scanner.nextInt();

        if(nota > 65) {
            System.out.println("vc e foda");
        } else {
            System.out.println("tu e burro");
        }
    }
}