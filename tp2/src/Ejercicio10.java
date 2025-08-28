
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);     
        System.out.print("Ingrese el stock actual del producto: ");
        var stockActual = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        var cantidadVendida = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        var cantidadRecibida = Integer.parseInt(scanner.nextLine());
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
