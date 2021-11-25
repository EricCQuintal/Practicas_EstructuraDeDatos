package Practica_8.Intercalacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IntercalacionMain {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] vector1=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            vector1[i]=sc.nextInt();

        } 

		Scanner teclado=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos2;
        nElementos2=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] vector2=new int [nElementos2];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos2; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            vector2[i]=teclado.nextInt();

        } 

		
		
		Intercalacion Ordenar= new Intercalacion();
		
		System.out.println("Arreglo vector 1 original");
Ordenar.mostrarArreglo(vector1);
System.out.println("Arreglo vector 2 original");
Ordenar.mostrarArreglo(vector2);
Ordenar.burbuja1(vector1);
Ordenar.burbuja1(vector2);
System.out.println("Arreglo vector 1 ordenado");
Ordenar.mostrarArreglo(vector1);
System.out.println("Arreglo vector 2 ordenado");
Ordenar.mostrarArreglo(vector2);
Ordenar.intercalacion(vector1, vector2);
	}	
}