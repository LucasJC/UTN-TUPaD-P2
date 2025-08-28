
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un año: ");
        var scanner = new Scanner(System.in);
        var año = Integer.parseInt(scanner.nextLine());
        if (esAñoBisiesto(año)) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
    
    static boolean esAñoBisiesto(int año) {
        return (0 == año % 4) 
                && (0 != año % 100 || 0 == año % 400);
    }
}
