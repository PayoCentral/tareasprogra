import javax.swing.JOptionPane;
import java.util.Scanner;

public class PrincipalPropietarioDepartamento {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    PropietarioDepartamento p = new PropietarioDepartamento(JOptionPane.showInputDialog("Nombre del Propietario:"));
    System.out.println("Digíte la posición del departamento");
    int posicion1 = scanner.nextInt();
    p.setDepartamento(JOptionPane.showInputDialog("Calle del departamento:"), posicion1);
    System.out.println("Digíte la posición del departamento");
    int posicion2 = scanner.nextInt();
    p.setDepartamento(JOptionPane.showInputDialog("Calle del departamento:"), posicion2);
    System.out.println("Digíte la posición del departamento");
    int posicion3 = scanner.nextInt();
    p.setDepartamento(JOptionPane.showInputDialog("Calle del departamento:"), posicion3);
    System.out.println("Digíte la posición del departamento");
    int posicion4 = scanner.nextInt();
    p.setDepartamento(JOptionPane.showInputDialog("Calle del departamento:"), posicion4);
    System.out.println("Digíte la posición del departamento");
    int posicion5 = scanner.nextInt();
    p.setDepartamento(JOptionPane.showInputDialog("Calle del departamento:"), posicion5);
    System.out.println(p);
    System.out.println();
    System.out.println(p.getPropietario() + " tiene " +
    p.contarDepartamentos() + " departamentos");
    System.out.println("Departamento 2: " + p.getDepartamento(posicion3));
    System.out.println();
    p.reorganizarDepartamentos();
    System.out.println(p);
    }
}    