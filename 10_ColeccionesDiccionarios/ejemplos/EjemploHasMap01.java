import java.util.HashMap;

public class EjemploHasMap01 {
  public static void main(String[] args) {
    
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Pep Guardiola");
    m.put(219, "Ronaldinho");
    m.put(199, "Xavi");
    m.put(123, "Samuél Etó");
    m.put(632, "Eríc Abidal");

    System.out.println("Los elementos de m son: \n" + m);
  }
}
