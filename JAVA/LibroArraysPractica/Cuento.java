public class Cuento extends Libro{
    protected String Genero;
    
    public Cuento(String Titulo, String Autores, float precio, String Genero){
        super(Titulo, Autores, precio);
        this.Genero=Genero;
    }
    public String getGenero(){
        return Genero;
    }
    public static void imprimeLibro(Cuento cuento){
        System.out.println("Titulo: " + cuento.getTitulo());
        System.out.println("Autores: " + cuento.getAutores());
        System.out.println("Genero: " + cuento.getGenero());
    }
    public String toString(){
        return "Esta es la información del Cuento";
    }
}