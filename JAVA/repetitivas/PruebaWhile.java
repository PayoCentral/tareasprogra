import javax.swing.JOptionPane;
public class PruebaWhile{
    public static void main (String[] args){
        int n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
        
while (n > 2) 
n = n -2;
if (n == 2) 
System.out.println("Es un número par");
else
System.out.println("Es un número impar");
    }
}
//hacer como metodo void