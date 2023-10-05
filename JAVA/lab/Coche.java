public class Coche { 
    private String placa; 
    private String modelo;
    private String color;
    private Persona propietario;

    public Coche(String p, String m, String c) {
placa = p;
modelo = m;
color = c;
propietario = null;
}

public String getPlaca() {
return placa;
}
public String getModelo() {
return modelo;
}
public String getColor() {
return color;
}
public Persona getPropietario() {
return propietario;
}
public void setColor(String nuevoColor) {
color = nuevoColor;
}
public void setPropietario(Persona nuevoPropietario) {
propietario = nuevoPropietario;
}
}
