package Semana5.Act4;

public class Curso {
    private String nombre;
    private String materia1;
    private String materia2;
    private String materia3;
    private int creditos1;
    private int creditos2;
    private int creditos3;
    private int horasSemanales;

    // Constructor vacío
    public Curso() {}

    // Constructor con parámetros
    public Curso(String nombre, String materia1, String materia2, String materia3,
                 int creditos1, int creditos2, int creditos3, int horasSemanales) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        this.creditos1 = creditos1;
        this.creditos2 = creditos2;
        this.creditos3 = creditos3;
        this.horasSemanales = horasSemanales;
    }

    // Constructor copia
    public Curso(Curso c) {
        this.nombre = c.nombre;
        this.materia1 = c.materia1;
        this.materia2 = c.materia2;
        this.materia3 = c.materia3;
        this.creditos1 = c.creditos1;
        this.creditos2 = c.creditos2;
        this.creditos3 = c.creditos3;
        this.horasSemanales = c.horasSemanales;
    }

    public int calcularCreditosTotales() {
        return creditos1 + creditos2 + creditos3;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria1() {
        return materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public int getCreditos1() {
        return creditos1;
    }

    public int getCreditos2() {
        return creditos2;
    }

    public int getCreditos3() {
        return creditos3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    public void setCreditos1(int creditos1) {
        this.creditos1 = creditos1;
    }

    public void setCreditos2(int creditos2) {
        this.creditos2 = creditos2;
    }

    public void setCreditos3(int creditos3) {
        this.creditos3 = creditos3;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
}
