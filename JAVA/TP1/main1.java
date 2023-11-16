public class main1 {
    public static int sumaValoresArreglo(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++)
            suma = suma + v[i]; // suma += v[i];
        return suma;
    }

    public static int promedioValoresArreglo(int[] y) {
        int suma = 0;
        for (int i = 0; i < y.length; i++)
            suma = suma + y[i];
        return suma / y.length;
    }

    public static void main(String[] args) {
        // se crea un arreglo de 5 elementos
        int[] x = new int[5];
        // se asigna al elemento x con índice i el valor 2*i
        for (int i = 0; i < x.length; i++)
            x[i] = 2 * i;
        // imprime la suma de los 5 elementos del arreglo
        System.out.println(sumaValoresArreglo(x));
        ////////////////////////////////////////////////////////////////////////
        //Promedio\\
        int[] z = { 1, 3, 2 };
        System.out.println(promedioValoresArreglo(z));
    }
}
