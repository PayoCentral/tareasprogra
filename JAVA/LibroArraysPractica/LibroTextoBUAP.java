public class LibroTextoBUAP extends LibroTexto{
    protected String Facultad;

    public LibroTextoBUAP(String Titulo, String Autores, float precio, String Curso, String Facultad){
        super(Titulo, Autores, precio, Curso);
        this.Facultad=Facultad;
    }
    public String getFacultad(){
        return Facultad;
    }
    public static void imprimeLibro(LibroTextoBUAP librotextobuap){
        System.out.println("Titulo: " + librotextobuap.getTitulo());
        System.out.println("Autores: " + librotextobuap.getAutores());
        System.out.println("Curso: "+ librotextobuap.getCurso());
        System.out.println("Facultad: " + librotextobuap.getFacultad());
    }
    public String toString(){
        return "Esta es la información del Libro de Texto";
    }
}