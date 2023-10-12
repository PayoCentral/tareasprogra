public class MensajeTexto {
    private String code;
    private String mensaje;
    
    public MensajeTexto(String c, String m){
        code=c;
        mensaje=m;
    }
    
    public String getCode() {
        return code;
    }
    public String getMensaje(){
        return mensaje;
    }
    
    public void setCode(String code){
        this.code=code;
    }
        public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    
    public static void imprimeInfo(MensajeTexto m1){
        System.out.println("Código: " + l1.getTitulo());
        System.out.println("Mensaje: "+ l1.getAutor());
        }
}
