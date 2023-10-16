public class Catedratico extends Persona {

    private String facultad;
    private float salario;

    public Catedratico() {
        this("", "", "", 0f);
    }

    public Catedratico(String nombre, String residencia, String facultad, float salario) {
        super(nombre, residencia);
        this.facultad = facultad;
        this.salario = salario;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Facultad: " + facultad);
        System.out.println("Salario: " + salario);
    }

    public float pagoCuotaSS(float salario) {
        return salario * 0.15f;
    }
}
