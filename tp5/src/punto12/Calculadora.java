package punto12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println(
                "Calculando impuesto de: " 
                        + impuesto.getMonto() 
                        + " para cuil: "
                        + impuesto.getContribuyente().getCuil()
        );
    }
}
