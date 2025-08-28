
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);
        int numeroActual;
        var resultado = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numeroActual = Integer.parseInt(scanner.nextLine());
            if (0 == numeroActual % 2) {
                resultado += numeroActual;
            }
        } while (0 != numeroActual);
        System.out.println("La suma de pares es: " + resultado);
    }
}
