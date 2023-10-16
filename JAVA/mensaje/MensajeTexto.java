public class MensajeTexto {
    private String code;
    private String mensaje;

    public MensajeTexto(String c, String m) {
        code = c;
        mensaje = m;
    }

    public String getCode() {
        return code;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setCode(String c1) {
        code = c1;
    }

    public void setMensaje(String m1) {
        mensaje = m1;
    }

    public static void imprimeInfo(MensajeTexto m2) {
        if (m2.getCode().equals("tqc")) {
            System.out.println(m2.getMensaje());
        } else {
            System.out.println(m2.getCode());
        }
    }
}