package Recuperacionfinal;
import java.util.*;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matricula, opcion;
        String alumno;
        double cali1, cali2, cali3;
        int numAlumnos;

        try {

            numAlumnos=Integer.parseInt(JOptionPane.showInputDialog ("Cantidad de alumnos a ingresar"));
            Escuela esc = new Escuela(numAlumnos);
            System.out.println("............................................");
            System.out.println("Ingrese el nombre de las materias");
            System.out.println("............................................");
            for (int i = 0; i < 3; i++) {
                System.out.print("Materia "+(i+1)+".");
                String nomMat = sc.next();
                esc.agregarMateria(nomMat);
            }

           
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("............................................");
                System.out.println("Ingrese datos de Alumno "+(i+1));
                System.out.println("............................................");
                System.out.print("\nDigite su matricula: ");
                matricula = sc.nextInt();

                System.out.print("ingrese Nombre Alumno: ");
                alumno = sc.next();

                System.out.print("Ingrese calificacion de " + esc.materias[0]+": ");
                cali1 = sc.nextDouble();

                System.out.print("Ingrese calificacion de " + esc.materias[1]+": ");
                cali2 = sc.nextDouble();

                System.out.print("Ingrese calificacion de " + esc.materias[2]+": ");
                cali3 = sc.nextDouble();

                esc.agregarAlumno(matricula, alumno, cali1, cali2, cali3);
            }

            esc.CalcularPromedio();

            do {

                System.out.println("\n        MENU\n"
                        + "1 - Total de Alumnos Aprobados\n"
                        + "2 - Media de la clase\n"
                        + "3 - Media de Cada Asignatura\n"
                        + "4 - Ordenar por matricula tecnica de mezcla natural\n"
                        + "5 - Ordenar por promedio\n"
                        + "6 - Mostrar listado\n"
                        + "7 - Buscar por Nombre del alumno tecnica busqueda secuencial\n"
                        + "8 - Buscar por matricula tecnica busqueda binaria\n"
                        + "9 - Buscar a los alumnos que tienen una determinada calificación en x asignatura\n"
                        + "10 - Salir\n"
                        + "\n>> Elija Una Opcion");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println();
                        esc.TotalAprobados();
                        break;

                    case 2:
                        System.out.println();
                        esc.MediaDeClase();
                        break;

                    case 3:
                        System.out.println();
                        esc.MediaDeMaterias();
                        break;

                    case 4:
                    esc.mezclaDirecta(esc.matriculas);
                    esc.mostrarArregloNatural(esc.matriculas);
                        break;

                    case 5:
                        System.out.println();
                        //al cambiar la variable ingrese el parametro promedio de tipo int
                        esc.ordenarRadix(esc.promedio);
                       
                        break;

                    case 6:
                        System.out.println();
                        esc.MostrarLista();
                        break;

                    case 7:
                        System.out.println("\nIngrese el alumno a buscar");
                        String bus = sc.next();
                        System.out.println();
                        esc.busquedaSecuencial(esc.alumnos, bus);
                        esc.MostrarLista();
                        break;

                    case 8:
                      
                     
                     System.out.println("ingrese Matricula a buscar ");
                     int numero = sc.nextInt();
                     System.out.println("Posicion\tMatricula\tNombre");
                     for (int i = 0; i < esc.matriculas.length ; i++) 
                         System.out.println (" Dato ["+i+"]: "+"\t"+esc.matriculas[i]+"\t"+"\t"+esc.alumnos[i]);
                     int resultado = Metodos.buscar(esc.matriculas, numero);
                     if (resultado != -1) {
                         System.out.println ( "Encontrado en: "+ resultado);
                     } else {
                         System.out.println ( "El dato no se encuentra en el arreglo" );
                     }
                        
                        break;
                        
                    case 9:
                        System.out.println("\nIngrese la materia a buscar");
                        String matB = sc.next();
                        System.out.println("Ingrese la calificaciones a mostrar");
                        int calB = sc.nextInt();
                        System.out.println();
                        esc.busquedaMateriaCali(matB, calB);
                        break;

                    default:
                        break;

                }

            } while (opcion != 10);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

}
