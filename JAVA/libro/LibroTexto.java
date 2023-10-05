public class LibroTexto extends Libro {
    private String Curso;
    public LibroTexto (String t, String a,String c){
        super(t, a);
        Curso=c;
    }
    public String getCurso(){
        return Curso;
    }
}