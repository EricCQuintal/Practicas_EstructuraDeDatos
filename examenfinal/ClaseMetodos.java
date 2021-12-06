package examenfinal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClaseMetodos {



    public void ordenarRadixPromedio(int [] arregloNum){
        int x, i, j;

        for(x=Integer.SIZE-1; x>=0; x--){

            int auxiliar[] = new int [arregloNum.length];

            j = 0;

            for (i=0; i<arregloNum.length; i++){

                boolean mover = arregloNum[i] << x >=0;

                if(x == 0 ? !mover: mover){

                    auxiliar[j] = arregloNum[i];
                    j++;

                } else {

                    arregloNum[i-j] = arregloNum[i];

                }
            }

            for (i=j; i < auxiliar.length; i++ ){

                auxiliar[i] = arregloNum[i-j];

            }
            arregloNum = auxiliar;
        }
        System.out.println("Ordenamiento ordenado por radix");
        mostrarArreglo(arregloNum);

      
    }

    
    public void mostrarArreglo(int[] arregloNum) {
            
        int k; 
        for (k =0; k < arregloNum.length; k++){
            
            System.err.print("[" + arregloNum[k] + "] ");
        }
    }

    public void OrdenarPorPromedio() {



        
    }


    public void MediaClase() {
        Scanner sc = new Scanner(System.in);
        int numAlum, i;
       
        double suma = 0, media;

        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();

        } while (numAlum <= 0);


        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numAlum]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }

        // Sumar todas las notas
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        // Calcular la media
        media = suma / notas.length;

        // Mostrar la media
        System.out.printf("Nota media del curso: %.2f %n", media);

        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }

        
    }
    

    

        
        
    

    public void MediaAsignatura() {
        Scanner sc = new Scanner(System.in);
        int numAlum, i;
       
        double suma = 0, media;

        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de asignatura: ");
            numAlum = sc.nextInt();

        } while (numAlum <= 0);


        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numAlum]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }

        // Sumar todas las notas
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        // Calcular la media
        media = suma / notas.length;

        // Mostrar la media
        System.out.printf("Nota media del curso: %.2f %n", media);
    
        
        
    }

    

    

   
    
}
