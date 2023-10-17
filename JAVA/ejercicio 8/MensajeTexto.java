public class MensajeTexto {

    private String codigo;
    private String texto;

    public MensajeTexto(String codigo, String texto) {
        this.codigo = codigo;
        this.texto = texto;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public String obtenerTexto() {
        return texto;
    }
}
