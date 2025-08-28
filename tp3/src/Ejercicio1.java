public class Ejercicio1 {
    public static class Estudiante {
        private String nombre;
        private String apellido;
        private String curso;
        private double calificacion;

        public Estudiante(String nombre, String apellido, String curso, 
                double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }
        
        public void mostrarInfo() {
            System.out.println("Estudiante{" + "nombre=" + nombre 
                    + ", apellido=" + apellido + ", curso=" + curso 
                    + ", calificacion=" + calificacion + "}");
        }
        
        public void subirCalificacion(double puntos) {
            this.calificacion += puntos;
        }
        
        public void bajarCalificacion(double puntos) {
            this.calificacion -= puntos;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Creamos un estudiante:");
        var estudiante = new Estudiante("Carlos", "Mendez", "Programación 2", 6);
        estudiante.mostrarInfo();
        System.out.println("Subimos su calificación:");
        estudiante.subirCalificacion(2);
        estudiante.mostrarInfo();
        System.out.println("Bajamos su calificación:");
        estudiante.bajarCalificacion(0.5);
        estudiante.mostrarInfo();
    }
}
