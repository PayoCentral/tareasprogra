public class Novela extends Libro {
    private String Tema;
    public Novela (String t, String a, String tt){
        super(t, a);
        Tema=tt;
        
    }
    public static void imprimeLibro(Libro l1){
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: "+ l1.getAutor());
        System.out.println("Tema: "+ l1.getTema());
        }
    public String getTema(){
        return Tema;
    }
}