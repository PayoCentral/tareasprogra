import java.util.Scanner;
public class Principal{
public static void main(String[] args){
    Scanner codigo = new Scanner(System.in);
    System.out.println("Digíte su código");
    String codigo1 = codigo.nextLine();
    MensajeTexto mensajefinal = new MensajeTexto(codigo1, "");
    mensajefinal.setCode(codigo1);
    String mensaje1 = "Te quiero, cariño";
    mensajefinal.setMensaje(mensaje1);


MensajeTexto.imprimeInfo(mensajefinal);

System.out.println("Digite su número");
String numero1s = codigo.nextLine();
System.out.println("Digite el número del destinatario");
String numero2s = codigo.nextLine();
System.out.println("Cuál es su mensaje");
String mensaje2s = codigo.nextLine();
Mensaje mensajecon = new Mensaje(codigo1,mensaje2s, numero1s, numero2s);
Mensaje.imprimeMensajeNum(mensajecon);
}
}
