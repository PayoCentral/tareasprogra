import javax.swing.JOptionPane;

public class Libro{
    private String titulo;
    private String autor;
    private Double precio; 

public Libro (String t, String a){
    titulo=t;
    autor=a;
    this.precio = 0.0; 
}

public void imprimeLibro(){
System.out.println("Titulo: " + titulo);
System.out.println("Autores: "+ autor);
}
public void imprimePrecioLibro(){
    imprimeLibro();
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
public void setPrecio(Double precio){
    this.precio=precio;
}
}