
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {  
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        var edad = Integer.parseInt(scanner.nextLine());
        var etapa = "";
        if (edad < 12) {
            etapa = "Niño";
        } else if (edad >= 12 && edad < 18) {
            etapa = "Adolescente";
        } else if (edad >= 17 && edad < 60) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        System.out.println("Eres un " + etapa);
    }
}
