public class Novela extends Libro {
    private String Tema;
    public Novela (String t, String a, String tt){
        super(t, a);
        Tema=tt;
    }
    public String getTema(){
        return Tema;
    }
}