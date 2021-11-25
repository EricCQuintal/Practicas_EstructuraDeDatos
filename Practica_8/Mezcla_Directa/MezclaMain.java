package Practica_8.Mezcla_Directa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MezclaMain {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] vector2=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            vector2[i]=sc.nextInt();

        } 
		
		Mezcla_Directa Ordenar= new Mezcla_Directa ();
		
		System.out.println("Vector 2 original");
		Ordenar.mostrarArreglo(vector2);
		System.out.println("Vector 2 ordenado");
		vector2= Ordenar.mezclaDirecta(vector2);
		System.out.println("Ascendente");
		Ordenar.mostrarArreglo(vector2);
		System.out.println("Descendente");
		Ordenar.mostrarArreglo2(vector2);
		System.out.println("Numero de elementos repetidos");
		System.out.println(Ordenar.numRepetidos(vector2));
		System.out.println("Elementos que se repiten"); 
		Ordenar.mostrarElementRepe(vector2);
	}	
}