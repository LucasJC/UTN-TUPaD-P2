

public class Ejercicio12 {
    
    public static void main(String[] args) { 
        var precios = new double[] { 199.99, 299.5, 149.75, 399.0, 89.99 };
        System.out.println("Precios originales: ");
        imprimirPrecios(precios);
        // modifico un valor
        precios[precios.length/2] = precios[precios.length/2] * 0.5;
        System.out.println("Precios modificados: ");
        imprimirPrecios(precios);
    }
    
    private static void imprimirPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: " + precio);
        }
    }
}
