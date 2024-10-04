// Clase principal para ejecutar el ejemplo
public class EjecutarSemaphores {
    public static void main(String[] args) {
        // Creamos un curso con 3 plazas disponibles
        Curso curso = new Curso(3);

        // Creamos varios estudiantes (hilos)
        Estudiante estudiante1 = new Estudiante("Estudiante 1", curso);
        Estudiante estudiante2 = new Estudiante("Estudiante 2", curso);
        Estudiante estudiante3 = new Estudiante("Estudiante 3", curso);
        Estudiante estudiante4 = new Estudiante("Estudiante 4", curso);
        Estudiante estudiante5 = new Estudiante("Estudiante 5", curso);

        // Iniciamos los hilos (estudiantes intentando matricularse)
        estudiante1.start();
        estudiante2.start();
        estudiante3.start();
        estudiante4.start();
        estudiante5.start();
    }
}