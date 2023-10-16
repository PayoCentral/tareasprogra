import java.util.Scanner;
public class Principal{
public static void main(String[] args){
    Scanner codigo = new Scanner(System.in);
    System.out.println("Digíte su código");
    String codigo1 = codigo.nextLine();
    MensajeTexto mensajefinal = new MensajeTexto(codigo1, " ");
    mensajefinal.setCode(codigo1);
    String mensaje1 = "Te quiero, cariño";
    mensajefinal.setMensaje(mensaje1);


MensajeTexto.imprimeInfo(mensajefinal);
}
}
