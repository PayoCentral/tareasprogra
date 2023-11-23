import javax.swing.JOptionPane;

public class Par1 {
    private static void ParMetodo(Par1 a) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introuce un número"));
        while (n > 2) {
            n = n - 2;
        }
        if (n == 2) {
            JOptionPane.showMessageDialog(null, "Vientos");
            System.out.println("Es número par");
        } else {
            JOptionPane.showMessageDialog(null, "Valiste kk");
            System.out.println("No es número par");
        }
    }

    public static void main(String[] args) {
        Par1 c = new Par1();
        ParMetodo(c);
    }
}
