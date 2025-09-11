package punto7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var licencia = new Licencia(
                "Carlos P. G.", 
                "12121212",
                LocalDate.now(),
                LocalDate.now(),
                "A1"
        );
        var conductor = new Conductor("Carlos Pérez González", licencia);
        var motor = new Motor("FD12343213H", TipoMotor.DIESEL);
        var vehiculo = new Vehiculo(
                "AAF1234", 
                "Honda Fit 2018",
                motor, 
                conductor
        );
        
        System.out.println(vehiculo);
    }
}
