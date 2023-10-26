import javax.swing.JOptionPane;

public class Libro{
    protected String Titulo;
    protected String Autores;
    float precio;

    public Libro(String Titulo, String Autores, float precio){
        this.Titulo=Titulo;
        this.Autores=Autores;
        this.precio=precio;
    }
    public String getTitulo(){
        return Titulo;
    }
    public String getAutores(){
        return Autores;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public static void imprimeLibro(Libro libro){
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autores: " + libro.getAutores());
    }
    public static void imprimePrecioLibro(Libro librop){
        System.out.println("Titulo: " + librop.getTitulo());
        System.out.println("Autores: " + librop.getAutores());
        System.out.println("Precio: " + librop.getPrecio());
    }
    public static void ventanaLibro(Libro librov){
        JOptionPane.showMessageDialog(null, "Titulo: " + librov.getTitulo()+ " /n" + 
        "Autores: " + librov.getAutores());
    }
    public String toString(){
        return "Esta es la información del Libro";
    }
}