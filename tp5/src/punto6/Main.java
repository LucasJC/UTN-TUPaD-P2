package punto6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        var mesa = new Mesa(5, 4);
        var cliente = new Cliente("Alberto A.", 3487, 123431);
        var reserva = new Reserva(LocalDate.now(), LocalTime.NOON, cliente, mesa);
        
        System.out.println(reserva);
    }
}
