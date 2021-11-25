package Practica_8.Intercalacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IntercalacionMain {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] arregloN1=new int [nElementos];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            arregloN1[i]=sc.nextInt();

        } 

		Scanner teclado=new Scanner(System.in);
        //se paso a implementar los siguientes atributos
        int nElementos2;
        nElementos2=Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de elementos del arreglo: "));

        int [] arregloN2=new int [nElementos2];

        System.out.println("Digite los elementos del arreglo: ");

        for (int i=0; i<nElementos2; i++) 
        {
            System.out.print((i+1)+".Ingrese un numero: ");
            arregloN2[i]=teclado.nextInt();

        } 

		
		
		Intercalacion ordenIntercalacion= new Intercalacion();
		
        System.out.println("Arreglo vector 1 original");
        ordenIntercalacion.mostrarArreglo(arregloN1);
        System.out.println("Arreglo vector 2 original");
        ordenIntercalacion.mostrarArreglo(arregloN2);
        ordenIntercalacion.burbuja1(arregloN1);
        ordenIntercalacion.burbuja1(arregloN2);
        System.out.println("Arreglo vector 1 ordenado");
        ordenIntercalacion.mostrarArreglo(arregloN1);
        System.out.println("Arreglo vector 2 ordenado");
        ordenIntercalacion.mostrarArreglo(arregloN2);
        ordenIntercalacion.intercalacion(arregloN1, arregloN2);
	}	
}