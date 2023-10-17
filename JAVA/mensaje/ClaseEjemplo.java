import java.util.Scanner;

public class ClaseEjemplo{

    public String NumeroTelefono(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el numero de teléfono:  ");
    String numeroTelefono = sc.nextLine();
    return numeroTelefono;
    }

    //Creacion del main 
    public static void main(String []args){
        String numeroRemite= "2227879632"; 

            //!Leer el texto a través de la consola con la función del scanner 
        System.out.println("Introduce el código: ");
        String codigo1= new Scanner(System.in).nextLine();
        System.out.println("Introduce el mensaje: ");
        String texto = new Scanner(System.in).nextLine();

    
        //Creación de los objetos 
        MensajeTexto mensajeTexto= new MensajeTexto(codigo1,texto); 
        String numllama= new NumeroTelefono(); 

        Mensaje mensaje1 = new Mensaje(MensajeTexto, numllama ,numeroRemite); 
        mensaje1.imprimeInfo(mensaje1);
    }



}