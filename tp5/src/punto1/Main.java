package punto1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var titular = new Titular(
                "Lucas González",
                "12121212"
        );
        var pasaporte = new Pasaporte(
                "AAA123123", 
                LocalDate.now(), 
                LocalDate.now(),
                "AR", 
                titular, 
                "123453sdfs32432dsr343243432",
                "png");
        
        System.out.println(pasaporte);
    }
}
