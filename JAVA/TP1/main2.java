public class main2 {
public static boolean buscarArreglo(String[] v, String e) {
for (int i = 0; i < v.length; i++)
if (e.equals(v[i]))
return true;
return false;
}
public static void main(String[] args) {
    // se crea un arreglo x de 3 cadenas
    String[] x = {"uno", "dos", "tres"};
    // se busca la cadena "dos" en el arreglo x
    if (buscarArreglo(x, "dos"))
    System.out.println("presente");
    else
    System.out.println("no presente"); 
    }
    
}
