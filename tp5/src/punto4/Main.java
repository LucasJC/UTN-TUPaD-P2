package punto4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var banco = new Banco("Ciudad", "20121212125");
        var cliente = new Cliente("Pedro Álvarez", "12121212");
        var tarjeta = new TarjetaDeCredito(
                "1234567890123456", 
                LocalDate.now(), 
                cliente, 
                banco
        );
        
        System.out.println(tarjeta);
    }
}
