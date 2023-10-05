public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona("Juan Pérez", "Guadalajara");
        Estudiante e = new Estudiante("María García", "Monterrey", "Ingeniería", 10000f);
        Catedratico c = new Catedratico("Pedro López", "CDMX", "Ciencias", 50000f);


        p.escribirDatos();
        e.escribirDatos();
        c.escribirDatos();

     
        p.setResidencia("Durango");
        e.setPagoInscripcion(15000f);
        c.setSalario(60000f);


        System.out.println("\nDatos actualizados:");
        p.escribirDatos();
        e.escribirDatos();
        c.escribirDatos();
    }
}
