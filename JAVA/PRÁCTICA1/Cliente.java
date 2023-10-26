import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuál es el precio del primer libro");
        float precio1 = scanner.nextFloat();
        Libro libro1 = new Libro(JOptionPane.showInputDialog("Titulo del primer libro:"), 
        JOptionPane.showInputDialog("Autores del primer libro:"), precio1);
        libro1.setPrecio(precio1);
        libro1.toString();
        Libro.imprimePrecioLibro(libro1);

        Novela novela = new Novela(JOptionPane.showInputDialog("Titulo de la primera novela:"), 
        JOptionPane.showInputDialog("Autores de la primera novela:"), 
        0, JOptionPane.showInputDialog("Tema de la primera novela:"));
        novela.toString();
        Novela.imprimeLibro(novela);

        Cuento cuento = new Cuento(JOptionPane.showInputDialog("Titulo del cuento:"), 
        JOptionPane.showInputDialog("Autores del cuento:"), 
        0, JOptionPane.showInputDialog("Genero del cuento:"));
        cuento.toString();
        Cuento.imprimeLibro(cuento);

        LibroTextoBUAP libroTextoBUAP = new LibroTextoBUAP(
            JOptionPane.showInputDialog("Titulo del primer Libro de Texto:"),
         JOptionPane.showInputDialog("Autores del primer Libro de Texto:"), 0,
          JOptionPane.showInputDialog("Curso del primer Libro de Texto:"),
           JOptionPane.showInputDialog("Facultad del primer Libro de Texto:"));
           libroTextoBUAP.toString();
           LibroTextoBUAP.imprimeLibro(libroTextoBUAP);

        LibroTextoBUAPProgramacion LTBP = new LibroTextoBUAPProgramacion(
            JOptionPane.showInputDialog("Titulo del segundo Libro de Texto:"),
             JOptionPane.showInputDialog("Autores del segundo Libro de Texto:"), 0, 
             JOptionPane.showInputDialog("Curso del segundo Libro de Texto:"), 
             JOptionPane.showInputDialog("Facultad del segundo Libro de Texto:"), 
             JOptionPane.showInputDialog("Semestre del segundo Libro de Texto:"));
             LTBP.toString();
             LibroTextoBUAPProgramacion.imprimeLibro(LTBP);

        NovelaLiterariaCorta NLC = new NovelaLiterariaCorta(
            JOptionPane.showInputDialog("Titulo de la segunda Novela"), 
        JOptionPane.showInputDialog("Autores de la segunda Novela"), 0, 
        null, 
        JOptionPane.showInputDialog("Epoca de la segunda Novela"), 
        JOptionPane.showInputDialog("Extension de la segunda Novela"));
        NLC.toString();
            NovelaLiterariaCorta.imprimeLibro(NLC);


    }
}