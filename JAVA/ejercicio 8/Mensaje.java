public class Mensaje {

    private MensajeTexto mensajeTexto;
    private String numeroLlamada;
    private String numeroRemitente;

    public Mensaje(MensajeTexto mensajeTexto, String numeroLlamada, String numeroRemitente) {
        this.mensajeTexto = mensajeTexto;
        this.numeroLlamada = numeroLlamada;
        this.numeroRemitente = numeroRemitente;
    }

    public Mensaje(String texto, String numeroLlamada, String numeroRemitente) {
        this.mensajeTexto = new MensajeTexto (texto, numeroRemitente);
        this.numeroLlamada = numeroLlamada;
        this.numeroRemitente = numeroRemitente;
    }

    public Mensaje(String texto, String numeroLlamada) {
        this(texto, numeroLlamada, null);
    }

    public void actualizarNumeroLlamada(String numeroLlamada) {
        this.numeroLlamada = numeroLlamada;
    }

    public void imprimir() {
        System.out.println("Mensaje de texto: " + mensajeTexto.obtenerTexto());
        System.out.println("Código: " + mensajeTexto.obtenerCodigo());
        System.out.println("Número de llamada: " + numeroLlamada);
        System.out.println("Número de remitente: " + numeroRemitente);
    }
}
