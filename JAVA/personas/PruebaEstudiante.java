package personas;
public class PruebaEstudiante {
    public static void main(String[] args) {
    Persona p = new Persona("Daniel","Puebla",24);
    System.out.println(p.getNombre());
    System.out.println(p.getResidencia());

    Estudiante estudiante = new Estudiante("Jacobo","Merida",26, 123,"Ingeniería");
    System.out.println(estudiante.getNombre()); 
    System.out.println(estudiante.getResidencia()); 
    System.out.println(estudiante.getMatricula()); 
    System.out.println(estudiante.getFacultad()); 
    
    
    
    Persona p1= new Persona ("Daniela", "Puebla",17);
if (p.getEdad() > p1.getEdad()) {
System.out.println (p.getNombre() +" es mayor que " + p1.getNombre());}
else {
System.out.println (p1.getNombre() + " es mayor que " +p.getNombre());
}
    }
    }
    