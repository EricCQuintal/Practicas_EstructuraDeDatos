package Practica_8.Quicksort;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class QuicksortMain {
    
        public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] Arreglo=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            Arreglo[i]=sc.nextInt();

        } 

        Quicksort ordenador=new Quicksort();
            ordenador.OrdenarQuicksort(Arreglo);
    System.out.println("Los elementos ordenados son: ");
            for(int i=0; i<Arreglo.length;i++)
            {
                System.out.println(Arreglo[i]);  
            }
    }
    }