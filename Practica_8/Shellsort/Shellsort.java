package Practica_8.Shellsort;


//Se impprtaron las siguinetes librerias 
import java.io.IOException;
import java.util.Scanner;

public class Shellsort {
    public static void main(String[] args) throws IOException {
        //se encarga de hacer q solicite el usuario los datos de entrada por teclado
       Scanner sc=new Scanner(System.in);
       //se asigna el tamaño del arreglo que es 10
        int[] array = new int[10];
        int valor, d = 0;
        
        // se llena el arreglo con un rango determindao de 20 a 100 
        do {    
            System.out.print("Ingresa valores positivos en el rango [20 a 100]: ");
            valor = sc.nextInt();
            //aqui se condiciona el rango a aceptar en este caso apartir del numero 20
            //se podra aceptar los valores y con limite menor a 100
            if(valor > 20 && valor < 100){
                array[d] = valor;
                d++;
                //si o estan esos datos en el rago solicitados enviara este mensaje
            } else {
                System.out.println("El numero no esta en el rango");
            }
        } while (d < array.length);
        
        // Este es el metdodo encargadpo de realizar el ordenamiento
        int n = array.length;
        int inc = n;
        do {
            inc = inc/2;
            for (int a = 0; a < inc; a++) {
                for (int i = inc + a; i < n; i+=inc) 
                {
                    int j = i;
                    while (j - inc <= 0 && array[j] <array[j-inc]) 
                    {                        
                        int aux = array[j];
                        array[j] = array[j-inc];
                        array [j - inc] = aux;
                        j -= inc;
                    }
                }
            }
        } while (inc > 1);
        
        // El for que se incicializa en 0 con iterativo i es igual a los avlores ordenados 
        //del arreglo a imprimir
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    
           
        
    
    }
}