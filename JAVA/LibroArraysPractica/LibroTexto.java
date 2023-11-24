public class LibroTexto extends Libro{
    protected String Curso;

    public LibroTexto(String Titulo, String Autores, float precio, String Curso){
        super(Titulo, Autores, precio);
        this.Curso=Curso;
    }
    public String getCurso(){
        return Curso;
    }
    
    public static void imprimeLibro(LibroTexto librotexto){
        System.out.println("Titulo: " + librotexto.getTitulo());
        System.out.println("Autores: " + librotexto.getAutores());
        System.out.println("Curso: "+ librotexto.getCurso());
    }
    public String toString(){
        return "Esta es la información del Libro de Texto";
    }
}
