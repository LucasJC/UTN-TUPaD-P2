package punto13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        var qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " + qr);
    }
}
