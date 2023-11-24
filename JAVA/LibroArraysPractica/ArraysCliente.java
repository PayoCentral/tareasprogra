import javax.swing.JOptionPane;

public class ArraysCliente {
    public static void main(String[] args) {
        // Creación del objeto
        Libro[] arrays = new Libro[8];
        int opc, i, num = 0;
        int continuar;

        do { // Crear los objetos
            do {
                String op = JOptionPane.showInputDialog(" 1 :Libro" + "\n" + " 2 :LibroTexto" + "\n"
                        + "3 :LibroTextoBUAPProgramación" + "\n" + " 4 :Cuento" + "\n" + " 5 :Novela" + "\n"
                        + "6 :NovelaLiteraria" + " 7 :NovelaLiterariaCorta" + "\n" + "8 :LibroTextoBUAP");
                opc = Integer.parseInt(op);
                switch (opc) {
                    case 1:
                        arrays[num] = new Libro(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor"),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")));
                        break;
                    case 2:
                        arrays[num] = new LibroTexto(JOptionPane.showInputDialog("Titulo de libro:"),
                                JOptionPane.showInputDialog("Autor"),
                                Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),
                                JOptionPane.showInputDialog("Titulo del libro:"));
                        break;
                    case 3:
                        arrays[num] = new LibroTextoBUAPProgramacion(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor: "),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Curso del libro:"),JOptionPane.showInputDialog("Facultad a la que pertenece:"),JOptionPane.showInputDialog("Semestre de enseñanza:"));
                        break;
                    case 4:
                        arrays[num] = new Cuento(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor"),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Ingresa el género del Cuento "));
                        break;
                    case 5:
                        arrays[num] = new Novela(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor"),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Ingresa el tema de la novela: "));
                        break;
                    case 6:
                        arrays[num] = new NovelaLiteraria(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor"),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Ingresa el tema de la Novela Literaria: "),JOptionPane.showInputDialog("Epoca de la Novela literaria:"));
                        break;
                    case 7:
                        arrays[num] = new NovelaLiterariaCorta(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor"),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Ingresa el tema de la Novela Literaria: "),JOptionPane.showInputDialog("Epoca de la Novela literaria:"),JOptionPane.showInputDialog("Introduce la extensión: "));
                        break;
                    case 8:
                        arrays[num] = new LibroTextoBUAP(JOptionPane.showInputDialog("Titulo de libro:"),JOptionPane.showInputDialog("Autor: "),Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),JOptionPane.showInputDialog("Curso del libro:"),JOptionPane.showInputDialog("Facultad a la que pertenece:"));
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opción Incorrecta");
                }
            } while ((opc < 1) && (opc > 8));
            num = num + 1;
            continuar = JOptionPane.showConfirmDialog(null, "Desea añadir otro Libro?", "Recabando información",
                    JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
        for (i = 0; i < num; i++) {
            // Escribir Libros
            System.out.print(arrays[i]);
        }
    }
}