import javax.swing.JOptionPane;

public class SaludosCliente {
    public static void main(String[] args) {
    Saludos.imprimeSaludo();
    String n = JOptionPane.showInputDialog("Nombre");
    String a = JOptionPane.showInputDialog("Apellido");
    Saludos.imprimeSaludo(n,a);
    Saludos.imprimeSaludo(n);
    JOptionPane.showMessageDialog(null, Saludos.saludoPersonal(n,a));
    System.exit(0);
    }
}
