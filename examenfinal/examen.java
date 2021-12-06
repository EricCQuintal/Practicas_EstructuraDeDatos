package examenfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class examen {
    public static void main (String[] args) throws IOException{

        Scanner sc=new Scanner(System.in);
        int elemento=0, opc=0;
        
        ClaseMetodos prueba=new ClaseMetodos();

        do
        {
            try{
                System.out.println(
            "\n--------------------------------------------------\n"
            +" MENU ARBOLES \n"+
            "  1.total de alumnos reprobados\n" +
            "  2.Media de la clase\n" +  
            "  3.Media de cada asignatura\n" +
            "  4.Ordennar por matricula Mexcla natural\n" +
            "  5.Ordenar por promedio Radix\n" +
            "  6.Mostrar listado\n" +
            "  7.Mostrar listado\n" +
            "  8.Buscar por nombre del alumno metodo busqueda secuencial\n" +
            "  9.Buscar por matricula metodo busqueda binaria\n" +
            "  10.Buscar a los alumnos que tienen una determinada calificación \n" +
            "  11.SALIR \n" +
            "Elige una opción: \n" +
    "\n--------------------------------------------------\n");


                opc = Integer.parseInt(entrada.readLine());
                switch(opc)
                {
                    case 1:
                 
                   
                        break;
                    case 2:

                
                        
                        break;
                    case 3:
                    prueba.MediaAsignatura();
                       
                        break;
                    case 4:
                    // •	Aplicar el método Mezcla Natural para ordenar de manera ascendente por matricula.

    
                    Mezcla_Natural ordenar = new Mezcla_Natural();
       
                    System.out.println("Arreglo original:");
                    ordenar.mostrarArreglo(Matriculas);

                    System.out.println();

                    System.out.println("Arreglo ordenado de forma ascendente:");
                    Matriculas = ordenar.mezclaDirecta(Matriculas);
                    ordenar.mostrarArreglo(Matriculas);
                       
                        break;
                    case 5:
                            
                        break;
                    case 6: 
                           
                            break; 
                            case 7: 
                           
                            break; 
                            case 8:
                            
                              //•	Aplicar el método de búsqueda binaria para buscar por matricula

    System.out.println("Arreglo original");
    Busqueda.mostrarArreglo(Matriculas);
    Busqueda.burbuja (Matriculas);
    System.out.println("Arreglo ordenado");
    Busqueda.mostrarArreglo(Matriculas);
    System.out.println("ingrese la matricula a buscar ");
    int numero = sc.nextInt();
    for (int h = 0; h < Matriculas.length ; h++)
        System.out.println (" Dato ["+h+"]: "+ Matriculas[h]);
    int resultado = Busqueda.buscar(Matriculas, numero);
    if (resultado != -1) {
        System.out.println ( "Encontrado en: "+ resultado);
    } else {
        System.out.println ( "El dato no se encuentra en el arreglo" );
    }
                           
                            break; 
                            case 9: 
                           
                            break; 
                }
            }
            catch(NumberFormatException n)
            {
                System.out.println("Error" + n.getMessage());
            }
        }while (opc!=6);

    
}
} 
