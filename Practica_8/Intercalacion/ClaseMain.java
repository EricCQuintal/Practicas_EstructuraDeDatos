package Practica_8.Intercalacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClaseMain {
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

		
		
		MetodoOrdenamientoIntercalacion ordenIntercalacion= new MetodoOrdenamientoIntercalacion();
		
        System.out.println("Datos del primer arreglo Ingresado por teclado");
        ordenIntercalacion.MostrarArreglo(arregloN1);
        System.out.println("Datos del segundo arreglo Ingreado por tecaldo");
        ordenIntercalacion.MostrarArreglo(arregloN2);
        ordenIntercalacion.OrdenaArreB(arregloN1);
        ordenIntercalacion.OrdenaArreB(arregloN2);
        System.out.println("Datos Arreglo 1 ordenados");
        ordenIntercalacion.MostrarArreglo(arregloN1);
        System.out.println("Datos Arreglo 2 ordenados");
        ordenIntercalacion.MostrarArreglo(arregloN2);
        ordenIntercalacion.IntercalarArreglos(arregloN1, arregloN2);
	}	
}