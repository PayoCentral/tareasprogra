import java.util.Scanner;

public class Principal{
public static void main(String[] args){
    Scanner codigo = new Scanner(System.in);
    System.out.println("Digíte su código");
    String codigo1 = codigo.nextLine();
    MensajeTexto.setCode(codigo1);
    String mensaje1 = "Te quiero, cariño";
    MensajeTexto.setMensaje(mensaje1);
//    if(codigo1.equals("tqc")){
//        System.out.println("Te quiero, cariño.");
//    } else {
//        System.out.println(codigo1);
//    }
//}

MensajeTexto mensajefinal = new MensajeTexto(codigo1, mensaje1);
MensajeTexto.imprimeInfo(mensajefinal);
}
}