public class LibroTextoBUAP extends LibroTexto {
    private String Facultad;
    public LibroTextoBUAP (String t, String a, String c, String f){
        super(t, a, c);
       Facultad =f ;
    }
    public static void imprimeLibro(libro l1){
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: "+ l1.getAutor());
        //System.out.println("Curso: "+ l1.getCurso());
        System.out.println("Facultad: " + l1.getFacultad());
        }
    public String getFacultad(){
        return Facultad;
    }
}