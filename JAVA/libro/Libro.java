import javax.swing.JOptionPane;

public class Libro{
    private String titulo;
    private String autor;
    private double precio; 

public Libro (String t, String a){
    titulo=t;
    autor=a;
    this.precio = 0.0; 
}


public static void imprimeLibro(Libro l1){
System.out.println("Titulo: " + l1.getTitulo());
System.out.println("Autores: "+ l1.getAutor());
}
public void imprimePrecioLibro(){
    imprimeLibro(null); 
    System.out.println("Precio: " + precio);
}
public void ventanaLibro(){
    JOptionPane.showMessageDialog(null, "Título: "+ titulo + "\nAutores: " + autor);
}


public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor; 
}
public Double getPrecio(){
    return precio; 
}
public void setPrecio(double precio){
    this.precio=precio;
}
}