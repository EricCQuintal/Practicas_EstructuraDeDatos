package original;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mat, opc;
        String alumno;
        double cali1, cali2, cali3;
        int numAlumnos;

        try {

            System.out.println("Digite el numero de alumnos");
            numAlumnos = entrada.nextInt();
            Escuela esc = new Escuela(numAlumnos);

            System.out.println("Ingrese el nombre de las materias");
            for (int i = 0; i < 3; i++) {
                System.out.print(">> ");
                String nomMat = entrada.next();
                esc.agregarMateria(nomMat);
            }

            System.out.println("\nINGRESE LOS DATOS");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("\nDigite su matricula");
                mat = entrada.nextInt();

                System.out.println("Digite su nombre");
                alumno = entrada.next();

                System.out.println("Digite su calificacion de " + esc.materias[0]);
                cali1 = entrada.nextDouble();

                System.out.println("Digite su calificacion de " + esc.materias[1]);
                cali2 = entrada.nextDouble();

                System.out.println("Digite su calificacion de " + esc.materias[2]);
                cali3 = entrada.nextDouble();

                esc.agregarAlumno(mat, alumno, cali1, cali2, cali3);
            }

            esc.calcularPromedio();

            do {

                System.out.println("\n        MENU\n"
                        + "1 - Total de alumnos Aprobados\n"
                        + "2 - Media de la clase\n"
                        + "3 - Media de Cada Asignatura\n"
                        + "4 - Ordenar por matricula\n"
                        + "5 - Ordenar por promedio\n"
                        + "6 - Mostrar listado\n"
                        + "7 - Buscar por nombre del alumno\n"
                        + "8 - Buscar por matricula\n"
                        + "9 - Buscar a los alumnos que tienen una determinada calificación en x asignatura\n"
                        + "10 - Salir\n"
                        + "\n>> Elija Una Opcion");

                opc = entrada.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println();
                        esc.totalAprobados();
                        break;

                    case 2:
                        System.out.println();
                        esc.mediaDeLaClase();
                        break;

                    case 3:
                        System.out.println();
                        esc.mediaDeMeteriass();
                        break;

                    case 4:
                        System.out.println();
                        esc.ordenarQuicksort(esc.matriculas, 0, esc.matriculas.length - 1);
                        esc.mostrarMatricula();
                        break;

                    case 5:
                        System.out.println();
                        esc.ordenarRadix(esc.calificaciones);
                        esc.mostrarCalificacion();
                        break;

                    case 6:
                        System.out.println();
                        esc.mostrarLista();
                        break;

                    case 7:
                        System.out.println("\nIngrese el alumno a buscar");
                        String bus = entrada.next();
                        System.out.println();
                        esc.busquedaSecuencial(esc.alumnos, bus);
                        break;

                    case 8:
                        System.out.println("\nIngrese la matricula a buscar");
                        mat = entrada.nextInt();
                        System.out.println();
                        esc.busquedaBinaria(esc.matriculas, mat);
                        break;
                        
                    case 9:
                        System.out.println("\nIngrese la materia a buscar");
                        String matB = entrada.next();
                        System.out.println("Ingrese la calificaciones a mostrar");
                        int calB = entrada.nextInt();
                        System.out.println();
                        esc.busquedaMateriaCali(matB, calB);
                        break;

                    default:
                        break;

                }

            } while (opc != 10);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

}
