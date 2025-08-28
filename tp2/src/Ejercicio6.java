
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);
        var positivos = 0;
        var negativos = 0;
        var ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            var numero = Integer.parseInt(scanner.nextLine());
            if (0 == numero) {
                ceros++;
            } else if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("Resultados");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
