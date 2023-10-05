import java.util.Date;

public class Trabajador {
private String nombre;
private String puesto;
private String direccion;
private String telefono;
private Date fecha_nacimiento;
private Date fecha_contrato;
private String NSS;

public Trabajador (String nombre, String NSS){ 
this.nombre = nombre;
this.NSS = NSS;
}
public boolean equals (Trabajador t){ 
return this.NSS.equals(t.NSS);
}
public double calcularPago () { 
return 0.0; 
}
public String toString (){ 
return nombre + ", El NSS asignado es: "+ NSS+",";
}
}
