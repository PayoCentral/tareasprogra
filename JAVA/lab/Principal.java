import javax.swing.JOptionPane;

public class Principal {
    private static void imprimeDatosCoche(Coche a) {
    System.out.println("Coche: " + a.getPlaca() + ", "
    + a.getModelo()+ ", " + a.getColor());
    }
    private static void imprimeDatosPropietario(Coche a) {
    System.out.println("Propietario: " + a.getPropietario().getNombre() + ", "
    + a.getPropietario().getResidencia());
    }
    public static void main(String[] args) {
        String plc = JOptionPane.showInputDialog("Digita la placa del coche:");
       String mold = JOptionPane.showInputDialog("Digita el modelo del coche");
        String colr = JOptionPane.showInputDialog("Digita el color del coche");
        Coche a = new Coche(plc, mold, colr);
        imprimeDatosCoche(a);

        String nombre = JOptionPane.showInputDialog("Digita el nombre del dueño");
        String residencia = JOptionPane.showInputDialog("Digita la residencia del dueño");
    Persona p = new Persona(nombre, residencia);
    a.setPropietario(p);
    imprimeDatosPropietario(a);

     String colr2 = JOptionPane.showInputDialog("Digita el color del coche");
    ServiciosCoche.pintura(a, colr2);
    imprimeDatosCoche(a);

    String plc2 = JOptionPane.showInputDialog("Digita la placa del coche:");
    String colr3 = JOptionPane.showInputDialog("Digita el color del coche");
    Coche b = ServiciosCoche.registramodelo(plc2,colr3);
    imprimeDatosCoche(b);

    String nombre2 = JOptionPane.showInputDialog("Digita el nombre del dueño");
    String residencia2 = JOptionPane.showInputDialog("Digita la residencia del dueño");
    Persona c = new Persona(nombre2, residencia2);
    b.setPropietario(c);
    imprimeDatosPropietario(b);
    }
    }

    
    //>