
import personas.Estudiante;
import personas.Persona;

import javax.swing.JOptionPane;
public class ClaseClientePersonaI {
public static void main(String[] args) {
Persona p=new Persona("Daniel", "Puebla",18);
Persona p1=new Persona("Daniela", "Puebla",17);
Estudiante e=new Estudiante ("Jacobo","Merida",26,124,"Ingenieria",9);
int opcion = Integer.parseInt(JOptionPane.showInputDialog("\t\t\t M E N U "+ "\n" +"\t 1: Mostrar los datos del objeto Persona" + "\n" + "\t 2: Mostrar los datos del objeto Estudiante"+ "\n" +"\t 3: Comparar dos objetos "+"\n" +"\t 4: Enviar mensaje de acuerdo a la calificación del alumno" ));
switch(opcion) {
case 1: System.out.println ("\n Los datos del objeto de la Clase Persona son ");
p.imprimeDatos();
p.mayorEdad();
break; 
case 2: System.out.println( "\n Los datos del objeto de la Clase Estudiante son "); 
e.imprimeDatos();
e.mayorEdad();
break; 
case 3: System.out.println ( "\n Comparación de dos Objetos "); 
if (p.getEdad() > p1.getEdad())
System.out.println (p.getNombre()+" es mayor que "+p1.getNombre()); 
break; 
case 4: System.out.println ("\n Comparación Calificación "); 
if (e.getPromedio() >=0 && e.getPromedio() <=10)
switch (e.getPromedio())
{ 
case 6: System.out.println ( e.getNombre() +" es un alumno en riesgo " ); break; 
case 7: System.out.println ( e.getNombre() + " es un alumno regular " ); break; 
case 8: System.out.println ( e.getNombre() + " es un buen alumno " ); break;
case 9: System.out.println ( e.getNombre() + " es un alumno excelente " ); break;
case 10: System.out.println ( e.getNombre() + " es un alumno magnifico " ); break;
default: System.out.println ( e.getNombre() + " es un alumno reprobado " );
}
else System.out.println (" Promedio del alumno " + e.getNombre() + " fuera de rango "); }}}