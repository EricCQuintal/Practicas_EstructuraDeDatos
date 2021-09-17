package EricQuintal.practica2;

import java.util.Scanner;
import java.lang.Integer;
import javax.swing.JOptionPane;

public class nElementos {
    public static void main(String[] args) {
        System.out.println("...................................................... ");
        System.out.println("PROGRAMA TOMA DATOS DE UN ARREGLO Y DEVUELVE LA SUMA");
        System.out.println("...................................................... ");
        Scanner sc=new Scanner(System.in);
        int nElementos;
        int suma=0;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));
        int [] numeros=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");
        for (int i=0; i<nElementos; i++) {
            System.out.print((i+1)+".Ingrese un numero: ");
            numeros[i]=sc.nextInt();


            
        } 
        System.out.println("............................................. ");
        System.out.println("Los elementos del arreglo son: ");
        System.out.println("............................................. ");
        for (int i=0; i<nElementos; i++){
            System.out.println((i+1)+"."+numeros[i]);
        }
        
        System.out.println("............................................. ");
        for (int i=0; i<nElementos; i++){
           suma +=numeros[i];
           
            
        }
        System.out.println("La suma de los elementos es: "+suma);

        

    }
}
