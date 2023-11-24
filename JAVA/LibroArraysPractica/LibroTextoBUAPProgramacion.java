public class LibroTextoBUAPProgramacion extends LibroTextoBUAP{
    protected String Semestre;

    public LibroTextoBUAPProgramacion(String Titulo, String Autores, float precio, 
    String Curso, String Facultad, String Semestre){
        super(Titulo, Autores, precio, Curso, Facultad);
        this.Semestre=Semestre;
    }
    public String getSemestre(){
        return Semestre;
    }
    public static void imprimeLibro(LibroTextoBUAPProgramacion LTBP){
        System.out.println("Titulo: " + LTBP.getTitulo());
        System.out.println("Autores: " + LTBP.getAutores());
        System.out.println("Curso: "+ LTBP.getCurso());
        System.out.println("Facultad: " + LTBP.getFacultad());
        System.out.println(LTBP.getSemestre() + " Semestre");
    }
    public String toString(){
        return "Esta es la información del Libro de Texto";
    }
}