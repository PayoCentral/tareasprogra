import java.util.Scanner;

public class Cliente {

    public static void main(String []args){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Por favor, introduce el título del primer libro");
        String titulo1 = scanner.nextLine();
        System.out.println("Por favor, introduce los autores del libro");
        String autor1 = scanner.nextLine();


         //Creación de objetos 
    Libro libro1= new Libro (titulo1, autor1);
        libro1.imprimeLibro();

    System.out.println("Por favor, introduce el título del segundo libro");
        String titulo2 = scanner.nextLine();
        System.out.println("Por favor, introduce los autores del libro");
        String autor2 = scanner.nextLine();

        //Creación del otro objeto
    Libro libro2= new Libro(titulo2, autor2);
        libro2.imprimeLibro();

        //Leer el precio del primer libro
    System.out.println("Ingrese el precio del primer libro");
        double precio = scanner.nextDouble();
        //Actualización del libro 1

    libro1.setPrecio(precio);
        libro1.imprimeLibro();

    }

}
