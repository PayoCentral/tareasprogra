public class Novela extends Libro{
    protected String Tema;

    public Novela(String Titulo, String Autores, float precio, String Tema){
        super(Titulo, Autores, precio);
        this.Tema=Tema;
    }
    public String getTema(){
        return Tema;
    }
    public static void imprimeLibro(Novela novela){
        System.out.println("Titulo: " + novela.getTitulo());
        System.out.println("Autores: " + novela.getAutores());
        System.out.println("Tema: " + novela.getTema());
    }
    public String toString(){
        return "Esta es la información de la Novela";
    }
}