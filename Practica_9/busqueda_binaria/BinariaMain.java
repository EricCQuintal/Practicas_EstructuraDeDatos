package Practica_9.busqueda_binaria;

import java.util.Scanner;

public class BinariaMain {

    public static void main (String args[]) {
    	Scanner S = new Scanner(System.in);
    	int a,b;
    	System.out.println("Ingresa el tamaño del vector");
        a= S.nextInt();
        int vector [] = new int[a];
        for(int i=0;i<vector.length;i++) {
        	System.out.println("Ingresa datos para la posicion "+ i);
        	b = S.nextInt();
        	vector[i]= b;
        }
        
        System.out.println("Arreglo original");
        Busqueda.mostrarArreglo(vector);
        Busqueda.burbuja(vector);
        System.out.println("Arreglo ordenado");
        Busqueda.mostrarArreglo(vector);
        System.out.println("ingrese el número a buscar de la lista");
        int numero = S.nextInt();
    	for (int i = 0; i < vector.length ; i++)
    		System.out.println (" Dato ["+i+"]: "+ vector[i]);
    	int resultado = Busqueda.buscar(vector, numero);
    	if (resultado != -1) {
    		System.out.println ( "Encontrado en: "+ resultado);
    	} else {
    		System.out.println ( "El dato no se encuentra en el arreglo" );
    	}
    } 
    
}
