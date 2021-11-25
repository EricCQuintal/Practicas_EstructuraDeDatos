package Practica_8.Mezcla_Directa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MezclaMain {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] arregloN2=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            arregloN2 [i]=sc.nextInt();

        } 
		
		Mezcla_Directa ordenamientodirecto= new Mezcla_Directa ();
		System.out.println("Vector 2 original");
		ordenamientodirecto.mostrarArreglo(arregloN2);
		System.out.println("Vector 2 ordenado");
		arregloN2= ordenamientodirecto.mezclaDirecta(arregloN2);
		System.out.println("Ascendente");
		ordenamientodirecto.mostrarArreglo(arregloN2);
		System.out.println("Descendente");
		ordenamientodirecto.mostrarArreglo2(arregloN2);
		System.out.println("Numero de elementos repetidos");
		System.out.println(ordenamientodirecto.numRepetidos(arregloN2));
		System.out.println("Elementos que se repiten"); 
		ordenamientodirecto.mostrarElementRepe(arregloN2);
	}	
}