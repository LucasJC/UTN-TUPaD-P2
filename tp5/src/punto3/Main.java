package punto3;

public class Main {
    public static void main(String[] args) {
        var editorial = new Editorial(
                "Alfaguara", 
                "Tacuarí", 
                "1842", 
                "C1139AAN",
                "CABA",
                "CABA"
        );
        var autor = new Autor("Joël Dicker", "Suiza");
        var libro = new Libro(
                "La muy catastrófica visita al zoo",
                "9788410496002", 
                editorial, 
                autor
        );
        
        System.out.println(libro);
    }
}
