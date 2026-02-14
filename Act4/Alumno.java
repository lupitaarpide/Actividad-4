package Semana5.Act4;

public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso curso;

    // Constructor vacío
    public Alumno() {}

    // Constructor con parámetros
    public Alumno(String matricula, String nombre, int edad, Curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // Constructor copia
    public Alumno(Alumno a) {
        this.matricula = a.matricula;
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.curso = a.curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
