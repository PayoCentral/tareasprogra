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
                        + "3 :LibroTextoBUAPProgramación" + " 4 :Cuento" + "\n" + " 5 :Novela" + "\n"
                        + "6 :NovelaLiteraria" + " 7 :NovelaLiterariaCorta" + "\n" + "8 :LibroTextoBUAP");
                opc = Integer.parseInt(op);
                switch (opc) {
                    case 1:
                        arrays[num] = new Libro();
                        break;
                    case 2:
                        arrays[num] = new LibroTexto(JOptionPane.showInputDialog("Titulo del primer libro:"),
                                JOptionPane.showInputDialog("Autor"),
                                Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del Libro:")),
                                JOptionPane.showInputDialog("Titulo del primer libro:"));
                        break;
                    case 3:
                        arrays[num] = new LibroTextoBUAPProgramacion(op, op, continuar, op, op, op);
                        break;
                    case 4:
                        arrays[num] = new Cuento(op, op, continuar, op);
                        break;
                    case 5:
                        arrays[num] = new Novela(op, op, continuar, op);
                        break;
                    case 6:
                        arrays[num] = new NovelaLiteria(op, op, continuar, op, op);
                        break;
                    case 7:
                        arrays[num] = new NovelaLiterariaCorta(op, op, continuar, op, op, op);
                        break;
                    case 8:
                        arrays[num] = new LibroTextoBUAP(op, op, continuar, op, op);
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opción Incorrecta");
                }
            } while ((opc < 1) && (opc > 8));
            num = num + 1;
            continuar = JOptionPane.showConfirmDialog(null, "Desea añadir otro Trabajador?", "Recabando información",
                    JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
        for (i = 0; i < num; i++) {
            // Escribir Libros
            System.out.print(arrays[i]);
        }
    }
}
