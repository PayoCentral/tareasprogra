import javax.swing.JOptionPane;

public class ClaseClientePersona {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // objeto operador
        Persona p1 = new Persona(JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Residencia")); //constructor 
        System.out.println(p1.getNombre());
         System.out.println(p1.getResidencia());
        p1.setResidencia("Cancun");
        System.out.println(p1.getResidencia());
        }
}

