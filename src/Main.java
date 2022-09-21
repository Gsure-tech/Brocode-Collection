import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
    int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + age
    + " years old");
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    JOptionPane.showMessageDialog(null, " You are " +
            height + "ft  tall");
String name ="";
while(name.isBlank() ) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name :`") ;
    name=scanner.nextLine();

}
        System.out.println("Hello " + name);*/
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol ="";
        System.out.println("Enter # of rows");
        rows=scanner.nextInt();
        System.out.println("Enter # of columns");
        columns=scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol=scanner.next();
        for (int i = 0; i <rows; i++) {
            System.out.println();
            for (int j = 0; j<columns; j++ ) {
                System.out.print(symbol);

            }

        }


    }
}