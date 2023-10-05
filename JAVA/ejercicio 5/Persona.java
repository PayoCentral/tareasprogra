public class Persona {

    private String nombre;
    private String residencia;

    public Persona() {
        this("", "");
    }

    public Persona(String nombre, String residencia) {
        this.nombre = nombre;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void escribirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Residencia: " + residencia);
    }
}
