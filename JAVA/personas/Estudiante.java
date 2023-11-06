package personas;
public class Estudiante extends Persona {
    protected int matricula;
    protected String facultad;
    protected int promedio;

    public Estudiante (String nombre, String residencia,int edad, int matricula, String facultad, int promedio){
        super(nombre, residencia, edad);
        this.matricula = matricula;
        this.facultad = facultad;
        this.promedio = promedio;
    }

public int getMatricula() {
    return matricula;
}
public String getFacultad() {
    return facultad;
}
public int getPromedio(){
    return promedio;
}
public void imprimeDatos(){
    System.out.println(getNombre());
    System.out.println(getResidencia());
    System.out.println(getMatricula());
    System.out.println(getFacultad());
    System.out.println(getPromedio());
}
}
