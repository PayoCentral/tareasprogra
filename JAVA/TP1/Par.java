import javax.swing.JOptionPane;

public class Par {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introuce un número"));
        while (n > 2) {
            n = n - 2;
        }
        if (n == 2) {
            JOptionPane.showMessageDialog(null, "Buen chico");
            System.out.println("Es número par");
        } else {
            JOptionPane.showMessageDialog(null, "Valiste kk");
            System.out.println("Ijo de la riata no es número par");
        }
    }
}