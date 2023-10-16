public class LibroTexto extends Libro {
    private String Curso;
    public LibroTexto (String t, String a,String c){
        super(t, a);
        c=Curso;
    }
    
    public String getCurso(){
        return Curso;
    }
    
    
        public void imprimeLibro (LibroTexto l1){
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: "+ l1.getAutor());
        //En esta parte iba la siguiente línea  
        System.out.println("Curso: "+ l1.getCurso());
        //En dado caso que se tenga que poner solo quitarlo de comentario :)
        }
}