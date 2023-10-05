public class LibroTexto extends Libro {
    private String Curso;
    public LibroTexto (String t, String a,String c){
        super(t, a);
        Curso=c;
    }
    public static void imprimeLibro(Libro l1){
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: "+ l1.getAutor());
        System.out.println("Curso: "+ l1.getCurso());
        }
    public String getCurso(){
        return Curso;
    }
}