public class main5{
    public static int promedioValoresArreglo(int[] v) {
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < v.length; i++)
        suma= suma+v[i]; //suma += v[i];
        promedio = suma/v.length;
        return promedio;
        }
        
        public static void main(String[] args) {
            // se crea un arreglo de 5 elementos
            int[] x = new int[5];
            // se asigna al elemento x con índice i el valor 2*i
            for (int i = 0; i < x.length; i++)
            x[i] = 2*i;
            // imprime la suma de los 5 elementos del arreglo
            System.out.println(promedioValoresArreglo(x));
            }
                    
}