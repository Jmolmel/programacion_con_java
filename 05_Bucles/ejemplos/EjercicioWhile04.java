import java.util.Scanner;
/**
 * Contador de números positivos introducidos por teclado.
 * 
 * @author José Molina Meléndez
 */
public class EjercicioWhile04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0 ;   // Variable contador que controla salida del bucle
    int cuentaNumeros = 0; // Variable contadora de numeros positivos introducidos
    int suma = 0;  // Variable acumuladora de los números positivos introducidos 

    System.out.println("Por favor introduzca números enteros positivos: ");
    System.out.println("El programa finalizará cuando se introduzca un número negativo.");

    while (numeroIntroducido >= 0 ) {
      System.out.print("Número: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {         // con esto controlas la cantidad de veces que entra un positivo para que no cuente los 0
        cuentaNumeros++;
        suma += numeroIntroducido;    // suma = suma + numeroIntroducido
      }
    }
    sc.close();
    System.out.println("La cantidad de números positivos introducidos es " + cuentaNumeros);
    System.out.println("La suma total de ellos es " + (suma));
  }
}
