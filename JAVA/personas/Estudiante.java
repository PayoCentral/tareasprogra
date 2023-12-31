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
public void mayorEdad(){
    if (edad >= 18){
    System.out.print (nombre+" es un alumno mayor de edad, pues tiene " 
    +edad+" años" ); } 
    else {
        System.out.print (nombre +" es un alumno menor de edad, pues tiene " +edad+ " años" );}
}
public void imprimeDatos(){
    System.out.println(getNombre());
    System.out.println(getResidencia());
    System.out.println(getMatricula());
    System.out.println(getFacultad());
    System.out.println(getPromedio());
}
}
