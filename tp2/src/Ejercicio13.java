
import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) { 
        var precios = new double[] { 199.99, 299.5, 149.75, 399.0, 89.99 };
        System.out.println("Precios originales: ");
        imprimirPreciosRecursivamente(precios, 0);
        // modifico un valor
        precios[precios.length/2] = precios[precios.length/2] * 0.5;
        System.out.println("Precios modificados: ");
        imprimirPreciosRecursivamente(precios, 0);
    }
    
    private static void imprimirPreciosRecursivamente(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: " + precios[indice++]);
            imprimirPreciosRecursivamente(precios, indice);
        }
    }
}
