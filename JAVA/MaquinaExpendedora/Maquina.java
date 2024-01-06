import javax.swing.JOptionPane;

public class Maquina {
    static int opcion= 0; 
    public static void main(String []args){
        do{
            Efectivo a= new Efectivo(0);
        a.getDinero();
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Selecciona un dulce (Pon el número que está a su lado):\n" + "1) Totis: 7 pesos \n" + "2) Doritos: 15 pesos \n" + //
                    "" + "3) Salir")); 
        switch (opcion) {
            case 1:
        Totis b= new Totis(7);
       Efectivo.Paga(a,b); 
            break;

            case 2:
            break; 
        } 
    }while (opcion<=2); 
   
}
}
