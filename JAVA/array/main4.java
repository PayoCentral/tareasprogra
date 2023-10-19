public class main4{
    public static void invierteArreglo(int[] v) {
        for (int i = 0; i < v.length/2; i++) {
        int temp;
        temp = v[i];
        v[i] = v[v.length-1-i];
        v[v.length-1-i] = temp;
        }
        }
        public static void main(String[] args) {
            int[] x = { 5, 3, 9, 5, 12}; //se crea un arreglo x de 5 enteros
            for (int i = 0; i < 5; i++) //imprime 5 3 9 5 12
            System.out.println(x[i]);
            invierteArreglo(x); // se invierte el arreglo x
            for (int i = 0; i < 5; i++) //imprime 12 5 9 3 5
            System.out.println(x[i]);
            }        
}