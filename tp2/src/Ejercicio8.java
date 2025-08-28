
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);     
        System.out.print("Ingrese el precio base del producto: ");
        var precioBase = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        var impuesto = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        var descuento = Integer.parseInt(scanner.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(impuesto, descuento, precioBase));
    }
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
}
