package Semana5.Act4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== DATOS DEL CURSO =====
        System.out.println("=== REGISTRO DEL CURSO ===");
        System.out.print("Nombre del curso: ");
        String nombreCurso = sc.nextLine();

        System.out.print("Nombre de la materia 1: ");
        String m1 = sc.nextLine();
        System.out.print("Creditos materia 1: ");
        int c1 = sc.nextInt();

        sc.nextLine(); // limpiar buffer

        System.out.print("Nombre de la materia 2: ");
        String m2 = sc.nextLine();
        System.out.print("Creditos materia 2: ");
        int c2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Nombre de la materia 3: ");
        String m3 = sc.nextLine();
        System.out.print("Creditos materia 3: ");
        int c3 = sc.nextInt();

        System.out.print("Horas semanales del curso: ");
        int horas = sc.nextInt();

        Curso curso = new Curso(nombreCurso, m1, m2, m3, c1, c2, c3, horas);

        sc.nextLine(); // limpiar buffer

        // ===== DATOS DEL PROFESOR =====
        System.out.println("\n=== REGISTRO DEL PROFESOR ===");
        System.out.print("Nombre del profesor: ");
        String nombreProf = sc.nextLine();

        System.out.print("Numero de nomina: ");
        String nomina = sc.nextLine();

        System.out.print("Sueldo por hora: ");
        double sueldoHora = sc.nextDouble();

        Profesor prof = new Profesor(nombreProf, nomina, sueldoHora);
        prof.asignarCurso(curso);

        sc.nextLine();

        // ===== DATOS DEL ALUMNO =====
        System.out.println("\n=== REGISTRO DEL ALUMNO ===");
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        System.out.print("Nombre del alumno: ");
        String nombreAlumno = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Alumno alumno = new Alumno(matricula, nombreAlumno, edad, curso);

        // ===== RESULTADOS =====
        System.out.println("\n=== INFORMACION FINAL ===");
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Creditos totales: " + curso.calcularCreditosTotales());
        System.out.println("Sueldo semanal del profesor: $" + prof.calcularSueldoSemanal());
        System.out.println("Alumno inscrito: " + alumno.getNombre());

        sc.close();
    }
}

