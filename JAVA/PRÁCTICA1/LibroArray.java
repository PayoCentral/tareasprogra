import javax.swing.JOptionPane;
public class LibroArray{
  public static void main(String[] args) {
  	Libro[] libroarray = new Libro[7];
    int opc,i,num=0;
    int continuar;
      
    do{
       do{
              
          String op = JOptionPane.showInputDialog(" 1 :Libro de Texto" + "\n" + " 2 :Libro Texto perteneciente a BUAP" + "\n" + " 3 :Libro Texto perteneciente a BUAP sobre Programación"
		  + "\n" + " 4 :Novela" + "\n" + " 5 :Novela Literaria" + "\n" + " 6 :Novela Literaria Corta" + "\n" + " 7 :Cuento");
          opc = Integer.parseInt(op);
          switch(opc){
			
		   	case 1:
			String precio1 = JOptionPane.showInputDialog("Precio del Libro de Texto");
			float preciofloat1 = Float.parseFloat(precio1);
			libroarray [num]= new LibroTexto (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat1, JOptionPane.showInputDialog("Curso"));
            break;
			
		   	case 2:
			String precio2 = JOptionPane.showInputDialog("Precio del Libro de Texto BUAP");
			float preciofloat2 = Float.parseFloat(precio2);
		   	libroarray [num]= new LibroTextoBUAP (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat2, 
			JOptionPane.showInputDialog("Curso"),
			JOptionPane.showInputDialog("Facultad"));
			break;
			
			case 3:
			String precio3 = JOptionPane.showInputDialog("Precio del Libro de Texto BUAP de Programación");
			float preciofloat3 = Float.parseFloat(precio3);
		   	libroarray [num]= new LibroTextoBUAPProgramacion (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat3, 
			JOptionPane.showInputDialog("Curso"),
			JOptionPane.showInputDialog("Facultad"),
			JOptionPane.showInputDialog("Semestre"));
			break;
			
			case 4:
			String precio4 = JOptionPane.showInputDialog("Precio de la Novela");
			float preciofloat4 = Float.parseFloat(precio4);
		   	libroarray [num]= new Novela (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat4, 
			JOptionPane.showInputDialog("Tema"));
			break;
			
			case 5:
			String precio5 = JOptionPane.showInputDialog("Precio de la Novela Literaria");
			float preciofloat5 = Float.parseFloat(precio5);
		   	libroarray [num]= new NovelaLiteria (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat5, 
			JOptionPane.showInputDialog("Tema"),
			JOptionPane.showInputDialog("Epoca"));
			break;
			
			case 6:
			String precio6 = JOptionPane.showInputDialog("Precio de la Novela Literaria Corta");
			float preciofloat6 = Float.parseFloat(precio6);
		   	libroarray [num]= new NovelaLiterariaCorta (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat6, 
			JOptionPane.showInputDialog("Tema"),
			JOptionPane.showInputDialog("Epoca"),
			JOptionPane.showInputDialog("Extensión"));
			break;
			
			case 7:
			String precio7 = JOptionPane.showInputDialog("Precio del Cuento");
			float preciofloat7 = Float.parseFloat(precio7);
			libroarray [num]= new Cuento (JOptionPane.showInputDialog("Título"),
			JOptionPane.showInputDialog("Autores"), preciofloat7, 
			JOptionPane.showInputDialog("Género"));
            break;
			
		   	    default:
		   	     JOptionPane.showMessageDialog(null,  "Opción no valida");

		   }

		   }while((opc < 1) && (opc > 7));
		   num=num+1;
		   
           continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Libro?","Recabando información",JOptionPane.YES_NO_OPTION);

          }while(continuar==JOptionPane.YES_OPTION);
         
         for (i=0;i<num;i++)
		     {
                System.out.print(libroarray[i]);
				Libro.imprimePrecioLibro(libroarray[i]);
		   }
	}
}
