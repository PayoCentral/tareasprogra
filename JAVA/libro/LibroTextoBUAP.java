public class LibroTextoBUAP extends LibroTexto {
    private String Facultad;
    public LibroTextoBUAP (String t, String a, String c, String f){
        super(t, a, c);
       Facultad =f ;
    }
    public String getFacultad(){
        return Facultad;
    }
}