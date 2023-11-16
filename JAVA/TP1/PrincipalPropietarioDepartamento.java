import javax.swing.JOptionPane;

public class PrincipalPropietarioDepartamento {
    public static void main(String[] args) {
        PropietarioDepartamento p = new PropietarioDepartamento("Ricardo Ibañez");
        p.setDepartamento(JOptionPane.showInputDialog("Introduce la dirección del departamento: "), 0);
        p.setDepartamento(JOptionPane.showInputDialog("Introduce la dirección del departamento: "), 1);
        p.setDepartamento(JOptionPane.showInputDialog("Introduce la dirección del departamento: "), 2);
        p.setDepartamento(JOptionPane.showInputDialog("Introduce la dirección del departamento: "), 5);
        p.setDepartamento(JOptionPane.showInputDialog("Introduce la dirección del departamento: "), 8);
        System.out.println(p);
        System.out.println();

        System.out.println(p.getPropietario() + " tiene " +
                p.contarDepartamentos() + " departamentos");
        System.out.println("Departamento 2: " + p.getDepartamento(2));
        System.out.println();
        p.reorganizarDepartamentos();
        System.out.println(p);
    }
}