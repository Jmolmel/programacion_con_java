import java.util.ArrayList;
import java.util.Collections;

/**
 * Ordenación ascendente de elementos Integer:
 * método sort().
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList08 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);

    System.out.println("\nNúmeros en el orden original:");
    for (int numero: a) {
      System.out.println(numero);
    }

    Collections.sort(a);  //No pertenece a ArrayList Metodo de tipo static porque no necesita crear objeto

    System.out.println("\nNúmeros ordenados:");
    for (int numero: a) {
      System.out.println(numero);
    }
  }
}