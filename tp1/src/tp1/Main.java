package tp1;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Punto 2
        System.out.println("¡Hola, Java!");
    
        // Punto 3
        String nombre = "Lucas";
        int edad = 33;
        double altura = 1.8d;
        boolean estudiante = true;
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + 33);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + estudiante);
    
        // Punto 4
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        System.out.println("Nombre: " + nombre + " y edad: " + edad);
    
    
        // Punto 5
        scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        var num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        var num2 = scanner.nextInt();
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
    
        // Punto 6
        var mensaje = "Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"";
        System.out.println(mensaje);

    
        // Punto 7
        int x = 10; // Línea 1
        x = x + 5; // Línea 2
        System.out.println(x); // Línea 3
        /*
        Las tres líneas corresponden a instrucciones.
        Una instrucción es básicamente una unidad de ejecución, mientras que
        las expresiones son construcciones que evalúan a un único valor y no
        pueden ejecutarse por sí solas.
        Vale aclarar que el operador de asignación = también retorna un 
        valor, por lo que la línea 2, además de ser una instrucción, podría 
        considerarse una expresión.
        Ejemplo de esto último: System.out.println(x = x + 5);
        */
    
        // Punto 8
        // a
        scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        var int1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        var int2 = scanner.nextInt();
        System.out.println("División: " + (int1 / int2));
        // b
        System.out.print("Ingrese el primer double: ");
        var double1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el segundo double: ");
        var double2 = scanner.nextDouble();
        System.out.println("División: " + (double1 / double2));
  
        // Punto 9
        scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        // se corrige cambiando nextInt por nextLine para que reciba un String
        nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    
        // Punto 10
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }

}
