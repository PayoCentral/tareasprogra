import javax.sql.rowset.spi.SyncResolver;

public class main3 {
    public static long maxArreglo(long[] v) {
        long max = v[0];
        for (int i = 1; i < v.length; i++)
            if (v[i] > max)
                max = v[i];
        return max;
    }

    public static void main(String[] args) {
        long[] x = { 42, 97, 31, -25 }; // se crea un arreglo x
        System.out.println(maxArreglo(x)); // imprime 97

        int[] Max = { 6, 9, 8 };
        System.out.println(Max[2]);
    }
}