public class PrincipalPropietarioDepartamento {
    public static void main (String[] args) {
    PropietarioDepartamento p = new PropietarioDepartamento("Ricardo Ibañez");
    p.setDepartamento("Avenida Vicente Guerrero 911", 0);
    p.setDepartamento("Avenida San Claudio , 5720", 1);
    p.setDepartamento("Avenida 14 sur, 3814", 2);
    p.setDepartamento("Río Conchos, 3856", 5);
    p.setDepartamento("Río Usumacinta, 2500", 8);
    System.out.println(p);
    System.out.println();
    System.out.println(p.getPropietario() + " tiene " +
    p.contarDepartamentos() + " departamentos");
    System.out.println("Departamento 2: " + p.getDepartamento(2));
    System.out.println();
    p.reorganizarDepartamentos();
    System.out.println(p);
    }
}    