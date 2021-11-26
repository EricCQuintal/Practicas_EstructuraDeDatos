package Practica_8.Mezcla_Natural;

import java.util.Scanner;



public class NaturalMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=4;

        int [] arreglo=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            arreglo[i]=sc.nextInt();

        } 


        Mezcla_Natural ordenar = new Mezcla_Natural();
       
        System.out.println("Arreglo original:");
        ordenar.mostrarArreglo(arreglo);

        System.out.println();

        System.out.println("Arreglo ordenado:");
        arreglo = ordenar.mezclaDirecta(arreglo);
        ordenar.mostrarArreglo(arreglo);
    }
}