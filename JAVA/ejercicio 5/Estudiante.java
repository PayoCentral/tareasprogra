public class Estudiante extends Persona {

    private String facultad;
    private float pagoInscripcion;

    public Estudiante() {
        this("", "", "", 0f);
    }

    public Estudiante(String nombre, String residencia, String facultad, float pagoInscripcion) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.pagoInscripcion = pagoInscripcion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getPagoInscripcion() {
        return pagoInscripcion;
    }

    public void setPagoInscripcion(float pagoInscripcion) {
        this.pagoInscripcion = pagoInscripcion;
    }

    @Override
    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Facultad: " + facultad);
        System.out.println("Pago de inscripción: " + pagoInscripcion);
    }

    public float pagoCuotaSS(float pagoInscripcion) {
        return pagoInscripcion * 0.1f;
    }
}
