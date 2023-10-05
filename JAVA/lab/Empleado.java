public class Empleado extends Trabajador {
    private double sueldo;
    private double impuestos;

    public Empleado (String nombre, String NSS, double sueldo) {
    super (nombre, NSS);
    this.sueldo = sueldo;
    this.impuestos = sueldo*.1;
    }
    
    public double calcularPago () {
    return (sueldo-impuestos)*15;
    }
   
    public String toString () {
    return "Empleado "+super.toString();
    }
    }
    