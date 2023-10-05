import javax.swing.JOptionPane;


public class Saludos {
    public static void imprimeSaludo() {
    System.out.println("Buenos días");
    }
    public static void imprimeSaludo(String nombre, String apellido) {
    System.out.print("Buenos días ");
    System.out.print(nombre);
    System.out.print(" ");
    System.out.print(apellido);
    }
    public static void imprimeSaludo(String nombre) {
    System.out.println(" Hola " + nombre );
    }
    public static String saludoPersonal(String nombre, String apellido) {
    return "Buenos días " + nombre + " " + apellido;
    }
}
//Los metodos estáticos no necesitan un objeto de invocación 
