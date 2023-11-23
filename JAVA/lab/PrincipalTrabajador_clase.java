import javax.swing.JOptionPane;
class PrincipalTrabajador{
  public static void main(String[] args) {
  	Trabajador[] trabajador = new Trabajador[5];
    //Trabajador trabajador[] = new Trabajador[5];
    int opc,i,num=0;
    int continuar;
      
    do{
       	// Creaci�n de objetos
       do{
              
          String op = JOptionPane.showInputDialog(" 1 :Empleado" + "\n" + " 2 :Consultor");
          opc = Integer.parseInt(op);
          switch(opc){
		   	case 1:
			trabajador [num]= new Empleado (JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Seguro"),Double.parseDouble (JOptionPane.showInputDialog("Sueldo")));
            break;
		   	case 2:
		   	trabajador [num]= new Consultor (JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Seguro"),Integer.parseInt(JOptionPane.showInputDialog("Horas")),Double.parseDouble(JOptionPane.showInputDialog("Tarifa")));
		    break;
		   	    default:
		   	     JOptionPane.showMessageDialog(null,  "Opci�n Incorrecta");

		   }

		   }while((opc < 1) && (opc > 2));
		   num=num+1;
		   
           continuar= JOptionPane.showConfirmDialog(null,"�Desea a�adir otro Trabajador?","Recabando informaci�n",JOptionPane.YES_NO_OPTION);

          }while(continuar==JOptionPane.YES_OPTION);
         
           for (i=0;i<num;i++)
		       {
				//Escribir Trabajadores
                System.out.print(trabajador[i]);
				System.out.println(trabajador[i].calcularPago());

		      }
	}
}
