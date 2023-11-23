
public class Consultor extends Trabajador {
    private int horas;
    private double tarifa;
    
    public Consultor (String nombre, String NSS, int horas, double tarifa){
    super (nombre, NSS);
    this.horas = horas;
    this.tarifa = tarifa;
    }
   
    public double calcularPago (){
    return horas*tarifa;
    }
  
    public String toString () {
    return "Consultor "+super.toString();
    }
    }
    