
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {  
        var scanner = new Scanner(System.in);
        var mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i+1) + ": ");
            var numero = Integer.parseInt(scanner.nextLine());
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
