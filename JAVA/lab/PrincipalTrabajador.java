import javax.swing.JOptionPane;

public class PrincipalTrabajador {
    public static void main(String[] args) {
    Trabajador trabajador = new Trabajador (JOptionPane.showInputDialog("Nombre Completo"), 
    JOptionPane.showInputDialog("Digite su NSS"));

    Empleado empleado = new Empleado (JOptionPane.showInputDialog("Nombre Completo"),
    JOptionPane.showInputDialog("Digite su NSS"),
    Double.parseDouble (JOptionPane.showInputDialog("¿Cuál es el sueldo?")));

    Consultor consultor = new Consultor ("Sergio Rámirez", "SR5324",10, 250.00);

    System.out.println(trabajador);
    System.out.println(empleado+" Sueldo quincenal: " + empleado.calcularPago());
    System.out.println(consultor+" Pago por honorarios: " + consultor.calcularPago());
   
    System.out.println(trabajador.equals(empleado));
    System.out.println(trabajador.equals(consultor));
    }
}    