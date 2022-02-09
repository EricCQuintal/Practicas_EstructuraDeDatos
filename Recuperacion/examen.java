package Recuperacion;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import EricQuintal.practica3.Prueba;

public class examen {
    public static void main (String[] args) throws IOException{

        Scanner sc=new Scanner(System.in);
        int elemento=0, opc=0;
        int cantidadalumnos, i,k,c;
        String [] nombresalumnos;
        double suma=0, mediaclase,mediaaporasignatura,suma2=0;
    
    cantidadalumnos=Integer.parseInt(JOptionPane.showInputDialog ("Cantidad de alumnos a ingresar"));
    
    
    System.out.println("Ingrese los nombres de los alumnos");
    nombresalumnos = new String[cantidadalumnos];
    //Insertar nombres de alumnos al Arreglo String:
    for(k=0; k < nombresalumnos.length; k++)
    nombresalumnos[k]=sc.nextLine(); 

    //notas de la clase de los 3 alumnos
    

double[] notasclase = new double[cantidadalumnos];
                  
 
 
//media de la clase por asignatura
 
 //se crea un array llamado notas de numAlumn elementos de tipo double
 double[] notas = new double[cantidadalumnos]; 

   

 //Nmatriculas=Integer.parseInt(JOptionPane.showInputDialog ("Numero de matriculas a Ingresar"));
 System.out.println("Ingrese las matriculas de los alumnos");
 //se crea un array llamado notas de numAlumn elementos de tipo double
 int[] Matriculas = new int [cantidadalumnos]; 
 
 // Entrada de datos. Se lee la nota de cada alummo y se guarda
 // en cada elemento del array
 for (int j = 0; j < Matriculas.length; j++) {
     System.out.print("Alumno " + (j + 1) + " Matricula: ");
     Matriculas[j] = sc.nextInt();
 }

    
        
        



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


                opc = sc.nextInt();
                
                switch(opc)
                {
                    case 1:
                 
                   
                        break;
                    case 2:
                    System.out.println("Ingrese las Calificaciones finales de los alumnos");
                    for ( c = 0; c< notasclase.length; c++) 
                    {
                        System.out.print("Alumno " + (c + 1) + " Nota final: ");
                        notasclase[c] = sc.nextDouble();  
                       
                    }
                
                     // Sumar todas las notas
                     for (c = 0; c < notasclase.length; c++) 
                    // {
                        suma2 = suma2+notasclase[c];
                        // Calcular la media
                       
                    // }
                     mediaclase = suma2/notasclase.length;
                
                     // Mostrar la media
                     System.out.printf("Nota media del curso asignatura : %.2f %n", mediaclase);
                        
                        break;
                    case 3:
                    
                    System.out.println("Ingrese las Calificaciones finales de los alumnos");
                    // Entrada de datos. Se lee la nota de cada alummo y se guarda
                    // en cada elemento del array
                    for(int l=0; l<cantidadalumnos; l++)
                   {
                    System.out.println("Asigantura "+" " + (l + 1) );
                    for (i = 0; i < notas.length; i++) 
                    {
                        System.out.print("Alumno " + (i + 1) + " Nota final: ");
                        notas[i] = sc.nextDouble();  
                       
                    }
                
                     // Sumar todas las notas
                     for (i = 0; i < notas.length; i++) 
                    // {
                        suma = suma+notas[i];
                        // Calcular la media
                       
                    // }
                     mediaaporasignatura = suma/notas.length;
                
                     // Mostrar la media
                     System.out.printf("Nota media del curso asignatura : %.2f %n", mediaaporasignatura);
                
                     
                
                }
                   

     


                    
                       
                        break;
                    case 4:
                    // •	Aplicar el método Mezcla Natural para ordenar de manera ascendente por matricula.

                   
                    Metodos prueba=new Metodos(3);
                    System.out.println("Arreglo original:");
                    prueba.mostrarArregloNatural(Matriculas);

                    System.out.println();

                    System.out.println("Arreglo ordenado de forma ascendente:");
                    Matriculas = prueba.mezclaDirecta(Matriculas);
                    prueba.mostrarArregloNatural(Matriculas);
                   
                        break;
                    case 5:
                            
                        break;
                    case 6: 

                    //Mostrar alumno y su calificacion en pantalla:
        System.out.println("Nombre\tCalificacion\tMatriculas\tPromedio");
        for( i=0; i < nombresalumnos.length; i++)
              System.out.println(nombresalumnos[i]+"\t"+ notasclase[i]+"\t"+"\t"+Matriculas[i]);
              
      
                           
                        break; 
                    case 7: 
                           
                        break; 
                    case 8:
                            
                    
                           
                        break; 

                    case 9:

                     //•	Aplicar el método de búsqueda binaria para buscar por matricula
                     
                     Metodos.burbuja(Matriculas);
                     
                     System.out.println("ingrese Matricula a buscar ");
                     int numero = sc.nextInt();
                     System.out.println("Posicion\tMatricula\tNombre");
                     for (i = 0; i < Matriculas.length ; i++) 
                         System.out.println (" Dato ["+i+"]: "+"\t"+ Matriculas[i]+"\t"+"\t"+nombresalumnos[i]);
                     int resultado = Metodos.buscar(Matriculas, numero);
                     if (resultado != -1) {
                         System.out.println ( "Encontrado en: "+ resultado);
                     } else {
                         System.out.println ( "El dato no se encuentra en el arreglo" );
                     }
                 





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
