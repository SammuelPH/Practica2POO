//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class Alumno {
    Alumno() {
    }

    public static double cambiarCalificacion(int num, Estudiante[] Arrayprimero, Estudiante[] Arraysecundario) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("\t>> Introduce la nueva calificación: ");
        int cal = sc.nextInt();
        String var10001;
        if (num < 1 && num > 5) {
            if (num >= 6 || num <= 10) {
                Arraysecundario[num - 1].calificacion = cal;
                Arraysecundario[num - 1].estado = asignarEstado(cal);
                var10001 = Arraysecundario[num - 1].nombre;
                System.out.println("La nueva calificación de " + var10001 + " es: " + Arraysecundario[num - 1].calificacion);
            }
        } else {
            Arrayprimero[num - 1].calificacion = cal;
            Arrayprimero[num - 1].estado = asignarEstado(cal);
            var10001 = Arrayprimero[num - 1].nombre;
            System.out.println("La nueva calificación de " + var10001 + " es: " + Arrayprimero[num - 1].calificacion);
        }

        return (double)cal;
    }

    public static String asignarEstado(int calificacion) {
        String estado;
        if (calificacion < 60) {
            estado = "Reprobado";
        } else {
            estado = "No aprobado";
        }

        return estado;
    }

    public static String capturarAlumno(Estudiante[] Arraysecundario) {
        for(int i = 0; i < Arraysecundario.length; ++i) {
            Arraysecundario[i].nombre = Capturarinformacion.capturarString("Ingrese el nombre del alumno" + (i + 1));
            Arraysecundario[i].numcontrol = Capturarinformacion.capturarnumeroentero("Ingrese la matricula del alumno " + (i + 1));
            Arraysecundario[i].materia = Capturarinformacion.capturarString("Ingrese la materia del alumno");
            Arraysecundario[i].calificacion = Capturarinformacion.capturarnumeroentero("Ingrese la calificacion del alumno" + (i + 1));
            Arraysecundario[i].estado = asignarEstado(Arraysecundario[i].calificacion);
            System.out.println();
        }

        return null;
    }

    public static String mostrarAlumnos(Estudiante[] Arrayprimero, Estudiante[] Arraysecundario) {
        System.out.println("Lista de alumnos");

        int contador;
        for(contador = 0; contador < Arrayprimero.length; ++contador) {
            System.out.println(contador + 1 + ".- " + Arrayprimero[contador].nombre + " | " + Arrayprimero[contador].numcontrol + " | " + Arrayprimero[contador].materia + " | " + Arrayprimero[contador].calificacion + " | " + Arrayprimero[contador].estado);
        }

        contador = 5;

        for(int i = 0; i < Arraysecundario.length; ++i) {
            System.out.println(contador + 1 + ".- " + Arraysecundario[i].nombre + " | " + Arraysecundario[i].numcontrol + " | " + Arraysecundario[i].materia + " | " + Arraysecundario[i].calificacion + " | " + Arraysecundario[i].estado);
            ++contador;
        }

        return null;
    }
}
