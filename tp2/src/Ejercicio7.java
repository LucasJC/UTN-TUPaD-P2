
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);
        boolean esValida = false;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            var nota = Integer.parseInt(scanner.nextLine());
            esValida = nota >= 0 && nota <= 10;
            if (!esValida) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (!esValida);
        System.out.println("Nota guardada correctamente.");
    }
}
