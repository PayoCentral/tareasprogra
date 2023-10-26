public class NovelaLiterariaCorta extends NovelaLiteria{
    protected String Extension;

    public NovelaLiterariaCorta(String Titulo, String Autores, float precio, 
    String Tema, String Epoca, String Extension){
        super(Titulo, Autores, precio, Tema, Epoca);
        this.Extension=Extension;
    }
    public String getExtension(){
        return Extension;
    }
    public static void imprimeLibro(NovelaLiterariaCorta NLC){
        System.out.println("Titulo: " + NLC.getTitulo());
        System.out.println("Autores: " + NLC.getAutores());
        System.out.println("Tema: " + NLC.getTema());
        System.out.println("Época: " + NLC.getEpoca());
        System.out.println("Extension: " + NLC.getExtension());
    }
    public String toString(){
        return "Esta es la información de la Novela";
    }
}