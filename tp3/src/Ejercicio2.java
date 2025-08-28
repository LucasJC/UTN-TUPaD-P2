public class Ejercicio2 {
    public static class Mascota {
        private String nombre;
        private String especie;
        private int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Mascota{" + "nombre=" + nombre + ", especie=" 
                    + especie + ", edad=" + edad + "}");
        }

        public void cumplirAnios() {
            this.edad++;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Creamos una mascota:");
        var mascota = new Mascota("Alf", "Gato común europeo", 0);
        mascota.mostrarInfo();
        System.out.println("Simulamos 5 años:");
        for (int i = 0; i < 5; i++) {
            mascota.cumplirAnios();
        }
        mascota.mostrarInfo();
    }
}
