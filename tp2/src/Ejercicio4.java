
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {
    static final Set categorias = Set.of("A", "B", "C");
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        var precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        var categoria = scanner.nextLine().toUpperCase();
        validarCategoria(categoria);
        var descuento = obtenerDescuento(categoria);
        System.out.println("Descuento aplicado " + (descuento * 100) + "%");
        System.out.println("Precio final: $" + (precio - precio * descuento));
    }
    
    static double obtenerDescuento(String categoria) {
        return switch(categoria) {
            case "A" -> 0.1;
            case "B" -> 0.15;
            case "C" -> 0.2;
            default -> 0;
        };
    }
    
    static void validarCategoria(String categoria) {
        if (!categorias.contains(categoria)) {
            throw new RuntimeException("Categoría no válida");
        }
    }
}
