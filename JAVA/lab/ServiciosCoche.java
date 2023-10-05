public class ServiciosCoche {
    public static void pintura(Coche coche, String color) {
    coche.setColor(color);
    }
    public static Coche registramodelo(String pla, String col) {
    return new Coche(pla, "AudiA1", col);
    }
    }
    