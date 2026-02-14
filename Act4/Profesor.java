package Semana5.Act4;

public class Profesor {
    private String nombre;
    private String numeroNomina;
    private double sueldoPorHora;
    private Curso curso;

    // Constructor vacío
    public Profesor() {}

    // Constructor con parámetros
    public Profesor(String nombre, String numeroNomina, double sueldoPorHora) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
    }

    // Constructor copia
    public Profesor(Profesor p) {
        this.nombre = p.nombre;
        this.numeroNomina = p.numeroNomina;
        this.sueldoPorHora = p.sueldoPorHora;
        this.curso = p.curso;
    }

    public void asignarCurso(Curso curso) {
        this.curso = curso;
    }

    public double calcularSueldoSemanal() {
        if (curso != null) {
            return sueldoPorHora * curso.getHorasSemanales();
        }
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
