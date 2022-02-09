package Estudiar;

import java.util.Scanner;

import javax.swing.JOptionPane;

//•	Se debe solicitar Total de alumnos, la matricula, el nombre y las calificaciones

public class MainPrincipal {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cantidadalumnos, i,k;
    String [] nombresalumnos;
   
    double suma = 0, media;
    cantidadalumnos=Integer.parseInt(JOptionPane.showInputDialog ("Cantidad de alumnos a ingresar"));
    
    
    System.out.println("Ingrese los nombres de los alumnos");
    nombresalumnos = new String[cantidadalumnos];
    //Insertar nombres de alumnos al Arreglo String:
    for(k=0; k < nombresalumnos.length; k++)
    nombresalumnos[k]=sc.nextLine(); 
    
   
    
    
     System.out.println("Ingrese las Calificaciones finales de los alumnos");
    //se crea un array llamado notas de numAlumn elementos de tipo double
    double[] notas = new double[cantidadalumnos]; 
    
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
     //for (i = 0; i < notas.length; i++) 
    // {
       // suma = suma+notas[i];
        // Calcular la media
       
    // }
    // media = suma ;

     // Mostrar la media
    // System.out.printf("Nota media del curso asignatura : %.2f %n", media);

     

}
    
    

    
        

       // Sumar todas las notas
          //for (i = 0; i < notas.length; i++) {
             //suma = suma + notas[i];
      //   }

        // Calcular la media
         //media = suma / notas.length;

        // Mostrar la media
        // System.out.printf("Nota media del curso asignatura : %.2f %n", media);
        
    
    

        


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

  
  
  
    // •	Aplicar el método Mezcla Natural para ordenar de manera ascendente por matricula.

    
    Mezcla_Natural ordenar = new Mezcla_Natural();
       
    System.out.println("Arreglo original:");
    ordenar.mostrarArregloNatural(Matriculas);

    System.out.println();

    System.out.println("Arreglo ordenado de forma ascendente:");
    Matriculas = ordenar.mezclaDirecta(Matriculas);
    ordenar.mostrarArregloNatural(Matriculas);

    //•	Aplicar el método de búsqueda secuencial para buscar por nombre


    









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

// •	Aplicar el método deseado para la búsqueda por asignatura/calificación










} 



}





   

