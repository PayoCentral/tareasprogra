package personas;
public class Persona {

    private String nombre;
    private String residencia;

    public Persona(String nombre, String residencia) {
        this.nombre = nombre;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String nuevaResidencia) {
        residencia = nuevaResidencia;
    }

}
