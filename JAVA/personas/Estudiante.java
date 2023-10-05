package personas;
public class Estudiante extends Persona {
    private String nombre;
    private String residencia;
    private int matricula;
    private String facultad;

    public Estudiante (String n, String r,int m, String f){
        super(n, r);
        matricula = m;
       facultad = f;
}

public int getMatricula() {
    return matricula;
}
public String getFacultad() {
    return facultad;
}
}
