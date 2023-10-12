import java.util.Scanner;

public class Principal{
public static void main(String[] args){
    Scanner codigo = new Scanner(System.in);
    System.out.println("Digíte su código");
    String codigo1 = codigo.nextLine();
    
    if(codigo1.equals("tqc")){
        System.out.println("Te quiero, cariño.");
    } else {
        System.out.println(codigo1);
    }
}

}