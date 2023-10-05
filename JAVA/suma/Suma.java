public class Suma {

public static int sumaValoresArreglo(int[] v) {
int suma = 0;
for (int i = 0; i < v.length; i++)
suma= suma+v[i]; //suma += v[i];
return suma;
}
public static void main(String[] args) {
    // se crea un arreglo de 5 elementos
    int[] x = {5,3,4,8,1};
    // imprime la suma de los 5 elementos del arreglo
    System.out.println(sumaValoresArreglo(x));
    }
}

