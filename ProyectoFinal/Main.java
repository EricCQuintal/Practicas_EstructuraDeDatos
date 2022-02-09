package ProyectoFinal;
//Ya teniendo la clase de los metodos y constructores,
//asi que primero importamos las librerias
import java.util.*;
import javax.swing.JOptionPane;
//Ahora creamos esta siguiente clase para implementar un menu

public class Main {
    public static void main(String[] args) {
        //Se declaran las variables 
        Scanner sc = new Scanner(System.in);
        int matricula, opcion;
        int na;
        String nombre;
        double c1, c2, c3;

        try {
            //Entonces creamos la primera parte en el cual primero nos solicuta el numero de alumnos
            na=Integer.parseInt(JOptionPane.showInputDialog ("Ingrese la cantidad de alumnos"));
            metodos esc = new metodos(na);
            //Asi como creamos unos system, que al imprimir 
            //nos solicita los nombres de las asignaturas 
            System.out.println("............................................");
            System.out.println("Ingrese el nombre de cada asignatura");
            System.out.println("Maximo 3 ");
            System.out.println("............................................");
            for (int i = 0; i < 3; i++) {
                System.out.print("Esriba la asignatura "+" "+"#"+(i+1)+":");
                String nm = sc.next();
                esc.agregarMateria(nm);
            }
            //En esta parte nos solicitan el ingresar las matriculas
            for (int i = 0; i < na; i++) {
                System.out.println("............................................");
                System.out.print("\nIngrese la matricula del alumno: ");
                matricula = sc.nextInt();
                
                //Asi como en esta parte nos solicitan el nombre de los alumnos
                System.out.print("Ingrese el nombre alumno: ");
                nombre = sc.next();
            
                //Asi como para finalizar, nos solicitan que ingresemos las calificaciones
                System.out.print("Ingrese la calificacion de " + esc.materias[0]+": ");
                c1 = sc.nextDouble();

                System.out.print("Ingrese la calificacion de " + esc.materias[1]+": ");
                c2 = sc.nextDouble();

                System.out.print("Ingrese la calificacion de " + esc.materias[2]+": ");
                c3 = sc.nextDouble();
                System.out.println("............................................");
                esc.agregarAlumno(matricula, nombre, c1, c2, c3);
                esc.CalcularPromedio();
            }

            

            do {
                //Posteriormente creamos nuestro menu 
                        System.out.println("............................................");
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
                        + "\n Elija Una Opcion:");
                        System.out.println("............................................");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        //Cuando seleccionamos la opcion 1
                        //nos imprime los alumnos aprobados
                        System.out.println();
                        esc.TotalAprobados();
                        break;

                    case 2:
                        //Cuando seleccionamos la opcion 2
                        //nos imprime la media de la clase
                        System.out.println();
                        esc.MediaDeClase();
                        break;

                    case 3:
                        //Cuando seleccionamos la opcion 3
                        //nos imprime la meda de las materias
                        System.out.println();
                        esc.MediaDeMaterias();
                        break;

                    case 4:
                    //Cuando seleccionamos la opcion 4
                    //nos imprime las matriculas de menor a mayor
                    //con el metodo de mezcla natural
                    esc.mezclaDirecta(esc.matriculas);
                    esc.mostrarArregloNatural(esc.matriculas);
                        break;

                    case 5:
                        //Cuando seleccionamos la opcion 5
                        //nos imprime el primedio de mayor a menor
                        //con el metodo radex
                        System.out.println();
                        //al cambiar la variable ingrese el parametro promedio de tipo int
                        esc.ordenarRadix(esc.promedio);

                        break;

                    case 6:
                        //Cuando seleccionamos la opcion 6
                        //nos imprime la lista de alunmos
                        //con sus matriculas, nombres, calificaciones y promedio
                        System.out.println();
                        esc.MostrarLista();
                        break;

                    case 7:
                        //Cuando seleccionamos la opcion 7
                        //nos imprime los nombres de los alumnos
                        //con el metodo secuencial
                        System.out.println("\nIngrese el alumno a buscar");
                        String b = sc.next();
                        System.out.println();
                        esc.busquedaSecuencial(esc.alumnos, b);
                        esc.MostrarLista();
                        break;

                    case 8:
                        //Cuando seleccionamos la opcion 8
                        //nos imprime las matriculas
                        //con el metodo de busqueda binaria 
                        System.out.println("ingrese Matricula a buscar ");
                     int numero = sc.nextInt();
                     System.out.println("Posicion\tMatricula\tNombre");
                     for (int i = 0; i < esc.matriculas.length ; i++) 
                         System.out.println (" Dato ["+i+"]: "+"\t"+esc.matriculas[i]+"\t"+"\t"+esc.alumnos[i]);
                     int resultado = metodos.buscar(esc.matriculas, numero);
                     if (resultado != -1) {
                         System.out.println ( "Encontrado en: "+ resultado);
                     } else {
                         System.out.println ( "El dato no se encuentra en el arreglo" );
                     }
                        
                        break;
                        
                    case 9:
                        //Cuando seleccionamos la opcion 9
                        //nos imprime las calificaciones
                        //de los alumnos de alguna materia en especifico
                        System.out.println("\nIngrese la materia a buscar");
                        String mb = sc.next();
                        System.out.println("Ingrese las calificaciones a mostrar");
                        int cb = sc.nextInt();
                        System.out.println();
                        esc.busquedaMateriaCali(mb, cb);
                        break;
                        //Ya para finalizar, salimos del menu
                    default:
                        break;

                }

            } while (opcion != 10);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

}