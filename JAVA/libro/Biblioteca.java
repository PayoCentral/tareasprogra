import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        // Crear libro 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el título del primer libro");
        String titulo1 = scanner.nextLine();
        System.out.println("Introduce los autores del primer libro");
        String autor1 = scanner.nextLine();
        System.out.println("Introduce el curso del primer libro");
        String curso1 = scanner.nextLine();
        System.out.println("Introduce la facultad del primer libro");
        String facultad1 = scanner.nextLine();

        LibroTextoBUAP libro1 = new LibroTextoBUAP(titulo1, autor1, curso1, facultad1);

        // primer libro
        libro1.imprimeLibro();

        // libro 2
        System.out.println("Introduce el título del segundo libro");
        String titulo2 = scanner.nextLine();
        System.out.println("Introduce los autores del segundo libro");
        String autor2 = scanner.nextLine();

        Libro libro2 = new Libro(titulo2, autor2);

        // tema libro 2
        System.out.println("Introduce el tema del segundo libro");
        String tema2 = scanner.nextLine();

        // novela
        System.out.println("Introduce el título de la novela");
        String titulo3 = scanner.nextLine();
        System.out.println("Introduce los autores de la novela");
        String autor3 = scanner.nextLine();
        Novela novela1 = new Novela(titulo3, autor3, tema2);

        // crear libro 2
        libro2.imprimeLibro();
        novela1.imprimeLibro();

        // Leer precio y actualizar precio
        System.out.println("Ingrese el precio del primer libro");
        double precio = scanner.nextDouble();
        libro1.setPrecio(precio);

        // imprime libro 1
        libro1.imprimeLibro();
    }

}
