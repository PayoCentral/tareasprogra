import java.util.Scanner;

public class Mensaje extends MensajeTexto{
    private String numllamada;
    private String numdestinatario;
    
    public Mensaje(){
        this("","","","");
    }
    
    public Mensaje(String code, String mensaje, String numllamada, String numdestinatario){
        super(code, mensaje);
        this.numllamada=numllamada;
        this.numdestinatario=numdestinatario;
    }
    public Mensaje(MensajeTexto mensajeTexto, String numllamada) {
        this(mensajeTexto, null, numllamada);
    }

    public Mensaje(MensajeTexto mensajeTexto) {
        this(mensajeTexto, null, null);
    }

    public String getNumllamada(){
        return numllamada;
    }
    public String getNumdestinatario(){
        return numdestinatario;
    }
    public void setNumllamada(String a1){
        numllamada=a1;
    }
    public void setNumdestinatario(String a2){
        numllamada=a2;
    }
    
     public static void imprimeMensajeNum(Mensaje k1) {
        System.out.println("Código: " + k1.getCode());
        System.out.println("Mensaje: " + k1.getMensaje());
        System.out.println("Número de llamada: " + k1.getNumllamada());
        System.out.println("Número del remitente: " + k1.getNumdestinatario());
    }
}