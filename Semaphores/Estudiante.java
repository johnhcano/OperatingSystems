class Estudiante extends Thread {
    private String nombreEstudiante;
    private Curso curso;

    public Estudiante(String nombreEstudiante, Curso curso) {
        this.nombreEstudiante = nombreEstudiante;
        this.curso = curso;
    }

    // Sobrescribimos el método run() para que el estudiante intente matricularse
    @Override
    public void run() {
        curso.matricular(nombreEstudiante);
    }
}

