import java.util.concurrent.Semaphore;

// Clase que simula un Curso con plazas limitadas
class Curso {

    // Semáforo que controla el acceso a las plazas del curso
    private Semaphore plazasDisponibles;

    public Curso(int plazas) {
        plazasDisponibles = new Semaphore(plazas);
    }

    // Método que simula el proceso de matricularse en el curso
    public void matricular(String nombreEstudiante) {
        try {
            System.out.println(nombreEstudiante + " está intentando matricularse...");

            // Adquirir un permiso del semáforo (matrícula en el curso)
            plazasDisponibles.acquire();
            System.out.println(nombreEstudiante + " se ha matriculado. Plazas disponibles: " + plazasDisponibles.availablePermits());

            // Simulamos el tiempo que el estudiante permanece matriculado (2 segundos)
            Thread.sleep(2000);

            // Liberar la plaza cuando el estudiante cancela la matrícula o se gradúa
            plazasDisponibles.release();
            System.out.println(nombreEstudiante + " ha cancelado su matrícula. Plazas disponibles: " + plazasDisponibles.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

