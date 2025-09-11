package punto5;

public class Main {
    public static void main(String[] args) {
        var madre = new PlacaMadre("ASUS B850 Pro WIFI", "B850");
        var propietario = new Propietario("Javier González", "12312354");
        var pc = new Computadora("Dell", "BGH1233455FFD5", madre, propietario);
        
        System.out.println(pc);
    }
}
