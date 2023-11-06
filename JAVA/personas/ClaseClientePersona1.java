
import personas.Estudiante;
import personas.Persona;

public class ClaseClientePersona1{
        public static void main(String[] args) {
            Persona p = new Persona("Daniel", "Puebla",18);
        p.imprimeDatos();
        p.mayorEdad();
        Persona p1 = new Persona("Daniela", "Puebla", 17);
        if (p.getEdad() > p1.getEdad())
        System.out.println(p.getNombre() +" es mayor que " +p1.getNombre());
        Estudiante e = new Estudiante("Jacobo","Merida",26,124,"Ingenieria",9);
        e.imprimeDatos();
        System.out.println (e.getPromedio());
        e.mayorEdad();
        if  (e.getPromedio() >=0 && e.getPromedio() <=10)
        switch ( e.getPromedio() )
        { 
        case 6: System.out.println (e.getNombre() + " es un alumno en riesgo " );
        break; 
        case 7: System.out.println(e.getNombre() + " es un alumno regular ");
        break; 
        case 8: System.out.println(e.getNombre() + " es un buen alumno ");
        break;
        case 9: System.out.println(e.getNombre() + " es un alumno excelente ");
        break;
        case 10: System.out.println(e.getNombre() + " es un alumno magnifico ");
        break;
        default: System.out.println(e.getNombre() +" es un alumno reprobado ");
        }
        else {
            System.out.println ("Promedio del alumno " +e.getNombre() +" fuera de rango ");
    }
}
    }

