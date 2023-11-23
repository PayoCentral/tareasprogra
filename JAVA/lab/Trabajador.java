import java.util.Date;

public class Trabajador {
protected String nombre;
protected String NSS;


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
