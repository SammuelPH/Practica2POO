import java.util.Scanner;

//Iremos comenzando con nuestro main :D
public class Main {

    public static void main(String [] args) {

        //Informacion del estudiante 1
        Estudiante estudiante1 = new Estudiante(null, 0, null, 0, null);

        //Informacion del estudiante 2
        Estudiante estudiante2 = new Estudiante(null,0,null,0,null);

        //Informacion del estudiante 3
        Estudiante estudiante3 = new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 4
        Estudiante estudiante4 = new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 5
        Estudiante estudiante5= new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 1 al 5

        Estudiante Arrayprimero [] = new Estudiante[] {estudiante1,estudiante2,estudiante3,estudiante4,estudiante5};

        //Informacion del estudiante 6
        Estudiante estudiante6 = new Estudiante(null, 0, null, 0, null);

        //Informacion del estudiante 7
        Estudiante estudiante7 = new Estudiante(null,0,null,0,null);

        //Informacion del estudiante 8
        Estudiante estudiante8 = new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 9
        Estudiante estudiante9 = new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 10
        Estudiante estudiante10= new Estudiante (null, 0, null, 0, null);

        //Informacion del estudiante 6 al 10
        Estudiante Arraysecundario [] = new Estudiante[] {estudiante6,estudiante7,estudiante8,estudiante9,estudiante10};

        //Asignamos la informacion de los 5 alumnos que queramos

        estudiante1.nombre = "Roberto Pacheco Hernandez Godeinez"; estudiante1.numcontrol = 55856; estudiante1.materia = "Programacion Estructurada"; estudiante1.calificacion = 45; estudiante1.estado = "No aprobado";

        estudiante2.nombre = "Sammuel Charlie Vargas Gonzales"; estudiante2.numcontrol = 56648; estudiante2.materia = "Algebra Lineal"; estudiante2.calificacion = 85; estudiante2.estado = "Aprobado";

        estudiante3.nombre = "Susy Soto Judith Mejia"; estudiante3.numcontrol = 65120; estudiante3.materia = "Ecuaciones Diferenciales"; estudiante3.calificacion = 58; estudiante3.estado = "No aprobado";

        estudiante4.nombre = "Miriam Darlene Francisco Ramirez";    estudiante4.numcontrol = 65792; estudiante4.materia = "Introduccion a la ingenieria"; estudiante4.calificacion = 79; estudiante4.estado = "Aprobado";

        estudiante5.nombre = "Kerely Ivanna Flores Villa"; estudiante5.numcontrol = 62144; estudiante5.materia = "Psicologia"; estudiante5.calificacion = 79; estudiante5.estado = "Aprobado";

        System.out.println("Lista de alumnos");
        System.out.println();
        for(int i=0;i<Arrayprimero.length;i++)
        {
        System.out.println((i+1)+".- "+Arrayprimero[i].nombre+" | "+Arrayprimero[i].numcontrol+ " | "+Arrayprimero[i].materia+" | "+Arrayprimero[i].calificacion+" | "+Arrayprimero[i].estado);
        }
        System.out.println();
        System.out.println();

        //Damos inicio al menu de opciones numericas
        boolean salir = false;
        do
        {
            System.out.println("¿Que opcion desea elegir?: ");
            System.out.println("1>Capturar alumnos");
            System.out.println("2>Mostrar alumnos");
            System.out.println("3>Cambiar calificacion");
            System.out.println("4>Salir.");
            System.out.println();

            int opc = Capturarinformacion.capturarnumeroentero("La opcion numero ");

            switch(opc) {
                case 1:
                    Alumno.capturarAlumno(Arraysecundario);
                    break;

                case 2:
                    Alumno.mostrarAlumnos(Arrayprimero, Arraysecundario);
                    break;

                case 3:
                    System.out.println();
                    Alumno.mostrarAlumnos(Arrayprimero, Arraysecundario);
                    System.out.println();
                    int numero = Capturarinformacion.capturarnumeroentero(" ¿Que calificacion quiere modificar?");
                    Alumno.cambiarCalificacion(numero, Arrayprimero, Arraysecundario);
                    break;

                case 4:
                    System.out.println("Hasta luego!.");
                    System.exit(1);
                    break;
            }
        }           while(salir!=true);
    }
}
//Aqui se indicara el tipo de variable que entrara
class Capturarinformacion
{

    public static int capturarnumeroentero(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarString(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
}

//Aqui se lograra el cambio
class Alumno
{
    public static double cambiarCalificacion(int num, Estudiante[] Arrayprimero, Estudiante [] Arraysecundario)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("\t>> Introduce la nueva calificación: ");
        int cal = sc.nextInt();
        if(num >= 1 || num <= 5)
        {
            Arrayprimero[num-1].calificacion = cal;
            Arrayprimero[num-1].estado = Alumno.asignarEstado(cal);
            System.out.println("La nueva calificación de "+Arrayprimero[num-1].nombre+ " es: "+Arrayprimero[num-1].calificacion);
        }
        else if(num >= 6 || num <=10)
        {
            Arraysecundario[num-1].calificacion = cal;
            Arraysecundario[num-1].estado = Alumno.asignarEstado(cal);
            System.out.println("La nueva calificación de "+Arraysecundario[num-1].nombre+ " es: "+Arraysecundario[num-1].calificacion);
        }
        return cal;
    }
    public static String asignarEstado(int calificacion)
        {
        String estado;
        if(calificacion<60)
        {
            estado = "Reprobado";
        }
        else
        {
            estado = "No aprobado";
        }
        return(estado);
    }
    public static String capturarAlumno(Estudiante [] Arraysecundario)
    {
        for(int i=0;i<Arraysecundario.length;i++)
        {

            //Aqui se pedira al usuario el cambio de cada usuario
            Arraysecundario[i].nombre = Capturarinformacion.capturarString("Ingrese el nombre del alumno"+(i+1));
            Arraysecundario[i].numcontrol = Capturarinformacion.capturarnumeroentero("Ingrese la matricula del alumno "+(i+1));
            Arraysecundario[i].materia = Capturarinformacion.capturarString("Ingrese la materia del alumno");
            Arraysecundario[i].calificacion = Capturarinformacion.capturarnumeroentero("Ingrese la calificacion del alumno"+(i+1));
            Arraysecundario[i].estado = Alumno.asignarEstado(Arraysecundario[i].calificacion);
            System.out.println();
        }
        return null;
    }

    public static String mostrarAlumnos(Estudiante [] Arrayprimero, Estudiante [] Arraysecundario)
    {
        System.out.println("Lista de alumnos");
        for(int i=0;i<Arrayprimero.length;i++)
        {
            System.out.println((i+1)+".- "+Arrayprimero[i].nombre+" | "+Arrayprimero[i].numcontrol+ " | "+Arrayprimero[i].materia+" | "+Arrayprimero[i].calificacion+" | "+Arrayprimero[i].estado);
        }
        int contador = 5;
        for(int i=0;i<Arraysecundario.length;i++)
        {
            System.out.println((contador+1)+".- "+Arraysecundario[i].nombre+" | "+Arraysecundario[i].numcontrol+ " | "+Arraysecundario[i].materia+" | "+Arraysecundario[i].calificacion+" | "+Arraysecundario[i].estado);
            contador++;
        }
        return null;
    }
}
