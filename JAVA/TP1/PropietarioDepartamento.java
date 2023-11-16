public class PropietarioDepartamento {
    private String propietario;
    private String[] departamentos;

    public PropietarioDepartamento(String propietario) {
        this.propietario = propietario;
        departamentos = new String[10];
    }

    public String getPropietario() {
        return propietario;
    }

    public String getDepartamento(int posicion) {
        return departamentos[posicion];
    }

    public void setDepartamento(String direccion, int posicion) {
        departamentos[posicion] = direccion;
    }

    public int contarDepartamentos() {
        int num = 0;
        for (int i = 0; i < 10; i++)
            if (departamentos[i] != null)
                num++;
        return num;
    }

    public void reorganizarDepartamentos() {
        int vacio = -1; // índice de la primera posición vacía
        for (int i = 0; i < 10; i++) {
            if (departamentos[i] == null && vacio == -1)
                vacio = i;
            if (departamentos[i] != null && vacio != -1) {
                departamentos[vacio] = departamentos[i];
                departamentos[i] = null;
                vacio++;
            }
        }
    }

    public String toString() {
        String res = "";
        res += "Propietario: " + propietario;
        for (int i = 0; i < 10; i++)
            if (departamentos[i] != null)
                res += "\n Departamento " + i + ": " + departamentos[i];
        return res;
    }
}