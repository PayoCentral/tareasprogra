package personas;
public class Profesor extends Persona {
    private String nombre;
    private String residencia;
    private int idprof;
    private String cedula;

    public Profesor(String n, String r, int i) {
super(n,r);
idprof=i;
    }

    public int getIdprof(){
        return idprof;
    }
public void setIdprof(){
    idprod = nuevoIdprof;
}

public String getCedula(){
    return cedula;
}
}