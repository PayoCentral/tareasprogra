package personas;
public class PruebaEstudiante {
    public static void main(String[] args) {
    Persona p = new Persona("Daniel","Puebla");
    System.out.println(p.getNombre());
    System.out.println(p.getResidencia());

    Estudiante estudiante = new Estudiante("Jacobo","Merida",123,"Ingeniería");
    System.out.println(estudiante.getNombre()); 
    System.out.println(estudiante.getResidencia()); 
    System.out.println(estudiante.getMatricula()); 
    System.out.println(estudiante.getFacultad()); 
    }
    }
    