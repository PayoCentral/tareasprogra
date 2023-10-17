import java.util.Scanner;

public class Prueba {
    public static String leerNumeroTelefono() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número de teléfono: ");
    String numeroTelefono = sc.nextLine();
    return numeroTelefono;
}

    public static void main(String[] args) {
        // Inicializamos el número de teléfono del remitente
        String numeroRemitente = "2225746552";

        // Leemos el texto y el código del mensaje
        System.out.println("Introduce el texto del mensaje: ");
        String texto = new Scanner (System.in).nextLine();
        System.out.println("Introduce el código del mensaje: ");
        String codigo = new Scanner (System.in).nextLine();

        // Creamos el objeto de tipo MensajeTexto
        MensajeTexto mensajeTexto = new MensajeTexto(codigo, texto);

        // Leemos el número de teléfono del receptor
        String numeroLlamada = leerNumeroTelefono();

        // Creamos el objeto de tipo Mensaje
        Mensaje mensaje = new Mensaje(mensajeTexto, numeroLlamada, numeroRemitente);

        // Imprimimos la información sobre el objeto de tipo Mensaje
        mensaje.imprimir();
    }
}
