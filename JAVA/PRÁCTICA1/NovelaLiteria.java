public class NovelaLiteria extends Novela{
    protected String Epoca;

    public NovelaLiteria(String Titulo, String Autores, float precio, String Tema, String Epoca){
        super(Titulo, Autores, precio, Tema);
        this.Epoca=Epoca;
    }
    public String getEpoca(){
        return Epoca;
    }
    public static void imprimeLibro(NovelaLiteria novelaliteria){
        System.out.println("Titulo: " + novelaliteria.getTitulo());
        System.out.println("Autores: " + novelaliteria.getAutores());
        System.out.println("Tema: " + novelaliteria.getTema());
        System.out.println("Época: " + novelaliteria.getEpoca());
    }
    public String toString(){
        return "Esta es la información de la Novela";
    }
}
