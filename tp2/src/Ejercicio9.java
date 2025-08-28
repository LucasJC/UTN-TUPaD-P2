
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);     
        System.out.print("Ingrese el precio del producto: ");
        var precio = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        var peso = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional):");
        var zona = scanner.nextLine();
        var costoEnvio = calcularCostoEnvio(peso, zona);
        var total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        return switch(zona.toLowerCase()) {
            case "nacional" -> 5 * peso;
            case "internacional" -> 10 * peso;
            default -> throw new IllegalArgumentException("Zona inválida: " + zona);
        };
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
