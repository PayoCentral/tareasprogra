package personas;
public class Persona {

    protected String nombre;
    protected String residencia;
    protected int edad;

    public Persona(String nombre, String residencia, int edad) {
        this.nombre = nombre;
        this.residencia = residencia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public int getEdad(){
        return edad;
    }
    public void setResidencia(String nuevaResidencia) {
        residencia = nuevaResidencia;
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
    }
}
