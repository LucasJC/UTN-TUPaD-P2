
import java.util.Scanner;

public class Ejercicio11 {
    
    private static final double DESCUENTO_ESPECIAL = 0.1;
    
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);     
        System.out.print("Ingrese el precio del producto: ");
        var precio = Double.parseDouble(scanner.nextLine());
        var descuentoAplicado = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
    }
    
    public static double calcularDescuentoEspecial(double precio) {
        return precio * DESCUENTO_ESPECIAL;
    }
}
