import java.util.Scanner;
import matematicas.Ejercicio1To14;
import matematicas.FuncionExtra;

public class ProbandoEjercicios1To14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CAPICUA

        /*
         * System.out.println("Introduzca un número para comprobar si es capicua: ");
         * long capicua = sc.nextLong();
         * System.out.println(Ejercicio1To14.capicua(capicua));
         * 
         * // VOLTEA
         * 
         * System.out.println("Introduzca un número para voltearlo: ");
         * long voltea = sc.nextLong();
         * System.out.println(Ejercicio1To14.voltea(voltea));
         * 
         * // ESPRIMO
         * 
         * System.out.println("Introduzca un número para comprobar si es primo: ");
         * long primo = sc.nextLong();
         * 
         * System.out.println(Ejercicio1To14.primo(primo));
         * 
         * // SIGUIENTE PRIMO
         * System.out.
         * println("Introduzca un número primo para saber el siguientePrimo: ");
         * int siguientePrimo = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.nextPrimo(siguientePrimo));
         * 
         * // POTENCIA
         * System.out.println("Introduzca una base: ");
         * double base = sc.nextDouble();
         * System.out.println("Introduzca una altura: ");
         * double altura = sc.nextDouble();
         * 
         * System.out.println(Ejercicio1To14.potencia(base, altura));
         * 
         * 
         * // DIGITOS
         * System.out.
         * println("Introduzca un número para contar los dígitos que contiene.");
         * long digito = sc.nextLong();
         * 
         * System.out.println(Ejercicio1To14.digitos(digito));
         * 
         * 
         * // DIGITON
         * System.out.println("Introduzca un número.");
         * long digitoN = sc.nextLong();
         * System.out.println("Introduzca la posicion que quiere averiguar.");
         * int digitoAveriguar = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.digitoN(digitoN, digitoAveriguar));
         * 
         * // POSICIONDEDIGITO
         * 
         * System.out.println("Introduzca un número.");
         * long digitoNumero = sc.nextLong();
         * System.out.
         * println("Introduzca la posicion que quiere averiguar, si no se encuentra devolvera -1."
         * );
         * int digitoAveriguado = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.posicionDeDigito(digitoNumero,
         * digitoAveriguado));
         * 
         * //QUITAPORDETRAS
         * System.out.println("Introduzca un número.");
         * long quitaPorDetras = sc.nextLong();
         * System.out.println("Introduzca cuantos dígitos desea quitarle.");
         * int digito = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.quitaPorDelante(quitaPorDetras, digito));
         * 
         * // PEGAPORDETRAS
         * System.out.println("Introduzca un número");
         * long pegaPorDelantes = sc.nextLong();
         * System.out.println("Introduzca un número");
         * int pegaNumero = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.pegaPorDelante(pegaPorDelantes,
         * pegaNumero));
         * 
         * // PEGAPORDELANTE
         * 
         * System.out.println("Introduzca un número");
         * long pegaPorDelantes = sc.nextLong();
         * System.out.println("Introduzca un número");
         * int pegaNumero = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.pegaPorDetras(pegaPorDelantes,
         * pegaNumero));
         * /*
         * 
         * 
         * System.out.println("Introduzca su numero:");
         * long trozoDeNumero = sc.nextLong();
         * System.out.println("Elimine los digitos que desee por delante: ");
         * int digitoDelante = sc.nextInt();
         * System.out.println("Elimine los digitos que desee por detras: ");
         * int digitoDetras = sc.nextInt();
         * 
         * System.out.println(Ejercicio1To14.trozoDeNumero(trozoDeNumero, digitoDelante,
         * digitoDetras));
         * 
         * System.out.println("Introduce el primer número para pegarlo");
         * long numero1 = sc.nextLong();
         * System.out.println("Introduce el segundo número para pegarlo:");
         * long numero2 = sc.nextLong();
         * 
         * System.out.println(Ejercicio1To14.juntaNumeros(numero1, numero2));
         */

        System.out.println("Prueba numero fibonacci: ");
        long numero = sc.nextLong();

        System.out.println(FuncionExtra.encuentraFibonacci(numero));
    }
}
